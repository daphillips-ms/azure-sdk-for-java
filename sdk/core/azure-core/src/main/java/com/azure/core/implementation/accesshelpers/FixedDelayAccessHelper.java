// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.core.implementation.accesshelpers;

import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.FixedDelay;
import com.azure.core.http.policy.FixedDelayOptions;

import java.time.Duration;
import java.util.function.Predicate;

/**
 * Class containing helper methods for accessing private members of {@link FixedDelay}.
 */
public final class FixedDelayAccessHelper {
    private static FixedDelayAccessor accessor;

    /**
     * Type defining the methods to set the non-public properties of an {@link FixedDelay} instance.
     */
    public interface FixedDelayAccessor {
        /**
         * Creates an {@link FixedDelay} instance with the passed {@code fixedDelayOptions}, {@code shouldRetry} and
         * {@code shouldRetryException}.
         *
         * @param fixedDelayOptions The {@link FixedDelayOptions}.
         * @param shouldRetry The {@link Predicate} to determine if a response should be retried.
         * @param shouldRetryException The {@link Predicate} to determine if a {@link Throwable} should be retried.
         * @return The created {@link FixedDelay} instance.
         */
        FixedDelay create(FixedDelayOptions fixedDelayOptions, Predicate<HttpResponse> shouldRetry,
            Predicate<Throwable> shouldRetryException);
    }

    /**
     * The method called from {@link FixedDelay} to set it's accessor.
     *
     * @param fixedDelayAccessor The accessor.
     */
    public static void setAccessor(final FixedDelayAccessor fixedDelayAccessor) {
        accessor = fixedDelayAccessor;
    }

    /**
     * Creates an {@link FixedDelay} instance with the passed {@code fixedDelayOptions}, {@code shouldRetry} and
     * {@code shouldRetryException}.
     *
     * @param fixedDelayOptions The {@link FixedDelayOptions}.
     * @param shouldRetry The {@link Predicate} to determine if a response should be retried.
     * @param shouldRetryException The {@link Predicate} to determine if a {@link Throwable} should be retried.
     * @return The created {@link FixedDelay} instance.
     */
    public static FixedDelay create(FixedDelayOptions fixedDelayOptions, Predicate<HttpResponse> shouldRetry,
        Predicate<Throwable> shouldRetryException) {
        if (accessor == null) {
            new FixedDelay(1, Duration.ofMillis(1));
        }

        assert accessor != null;
        return accessor.create(fixedDelayOptions, shouldRetry, shouldRetryException);
    }

    private FixedDelayAccessHelper() {
    }
}
