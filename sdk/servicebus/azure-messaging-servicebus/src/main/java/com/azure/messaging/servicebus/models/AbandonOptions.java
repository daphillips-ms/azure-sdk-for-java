// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.models;

import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient;
import com.azure.messaging.servicebus.ServiceBusReceiverClient;
import com.azure.messaging.servicebus.ServiceBusSenderAsyncClient;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.azure.messaging.servicebus.ServiceBusTransactionContext;

import java.util.Map;

/**
 * Options to specify when abandoning a {@link ServiceBusReceivedMessage message} received via
 * {@link ServiceBusReceiveMode#PEEK_LOCK}.
 *
 * @see ServiceBusReceiverAsyncClient#abandon(ServiceBusReceivedMessage, AbandonOptions)
 * @see ServiceBusReceiverClient#abandon(ServiceBusReceivedMessage, AbandonOptions)
 * @see <a href="https://learn.microsoft.com/azure/service-bus-messaging/message-transfers-locks-settlement#peeklock">
 *     Settling messages</a>
 */
public final class AbandonOptions extends SettlementOptions {
    private Map<String, Object> propertiesToModify;

    /**
     * Creates a new instance of options to specify when abandoning messages.
     */
    public AbandonOptions() {
    }

    /**
     * Gets the message properties to modify while abandoning the message.
     *
     * @return The message properties to modify while abandoning the message.
     */
    public Map<String, Object> getPropertiesToModify() {
        return propertiesToModify;
    }

    /**
     * Sets the message properties to modify while abandoning message.
     *
     * @param propertiesToModify Message properties to modify.
     *
     * @return The updated {@link AbandonOptions} object.
     */
    public AbandonOptions setPropertiesToModify(Map<String, Object> propertiesToModify) {
        this.propertiesToModify = propertiesToModify;
        return this;
    }

    /**
     * Sets the {@link ServiceBusTransactionContext} to the options.
     *
     * @param transactionContext The {@link ServiceBusTransactionContext} that will be used to abandon a message.
     *
     * @return The updated {@link AbandonOptions} object.
     *
     * @see ServiceBusSenderClient#createTransaction()
     * @see ServiceBusSenderAsyncClient#createTransaction()
     * @see ServiceBusReceiverClient#createTransaction()
     * @see ServiceBusReceiverAsyncClient#createTransaction()
     */
    public AbandonOptions setTransactionContext(ServiceBusTransactionContext transactionContext) {
        super.setTransactionContext(transactionContext);
        return this;
    }
}
