// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.http.HttpResponse;
import com.azure.core.implementation.accesshelpers.FixedDelayAccessHelper;
import com.azure.core.util.logging.ClientLogger;
import java.time.Duration;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * A fixed-delay implementation of {@link RetryStrategy} that has a fixed delay duration between each retry attempt.
 */
public class FixedDelay implements RetryStrategy {
    private static final ClientLogger LOGGER = new ClientLogger(FixedDelay.class);

    static {
        FixedDelayAccessHelper.setAccessor(FixedDelay::new);
    }

    private final int maxRetries;
    private final Duration delay;
    private final Predicate<HttpResponse> shouldRetry;
    private final Predicate<Throwable> shouldRetryException;

    /**
     * Creates an instance of {@link FixedDelay}.
     *
     * @param maxRetries The max number of retry attempts that can be made.
     * @param delay The fixed delay duration between retry attempts.
     * @throws IllegalArgumentException If {@code maxRetries} is negative.
     * @throws NullPointerException If {@code delay} is {@code null}.
     */
    public FixedDelay(int maxRetries, Duration delay) {
        this(maxRetries, delay, null, null);
    }

    /**
     * Creates an instance of {@link FixedDelay}.
     *
     * @param fixedDelayOptions The {@link FixedDelayOptions}.
     */
    public FixedDelay(FixedDelayOptions fixedDelayOptions) {
        this(Objects.requireNonNull(fixedDelayOptions, "'fixedDelayOptions' cannot be null.").getMaxRetries(),
            Objects.requireNonNull(fixedDelayOptions, "'fixedDelayOptions' cannot be null.").getDelay());
    }

    private FixedDelay(FixedDelayOptions fixedDelayOptions, Predicate<HttpResponse> shouldRetry,
        Predicate<Throwable> shouldRetryException) {
        this(Objects.requireNonNull(fixedDelayOptions, "'fixedDelayOptions' cannot be null.").getMaxRetries(),
            Objects.requireNonNull(fixedDelayOptions, "'fixedDelayOptions' cannot be null.").getDelay(), shouldRetry,
            shouldRetryException);
    }

    private FixedDelay(int maxRetries, Duration delay, Predicate<HttpResponse> shouldRetry,
        Predicate<Throwable> shouldRetryException) {
        if (maxRetries < 0) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Max retries cannot be less than 0."));
        }
        this.maxRetries = maxRetries;
        this.delay = Objects.requireNonNull(delay, "'delay' cannot be null.");
        this.shouldRetry = shouldRetry;
        this.shouldRetryException = shouldRetryException;
    }

    @Override
    public int getMaxRetries() {
        return maxRetries;
    }

    @Override
    public Duration calculateRetryDelay(int retryAttempts) {
        return delay;
    }

    @Override
    public boolean shouldRetry(HttpResponse httpResponse) {
        return (shouldRetry == null)
            ? RetryStrategy.super.shouldRetry(httpResponse)
            : shouldRetry.test(httpResponse);
    }

    @Override
    public boolean shouldRetryException(Throwable throwable) {
        return (shouldRetryException == null)
            ? RetryStrategy.super.shouldRetryException(throwable)
            : shouldRetryException.test(throwable);
    }
}
