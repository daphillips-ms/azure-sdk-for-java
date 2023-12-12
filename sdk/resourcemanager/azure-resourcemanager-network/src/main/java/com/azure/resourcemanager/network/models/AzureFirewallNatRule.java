// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of a NAT rule.
 */
@Fluent
public final class AzureFirewallNatRule {
    /*
     * Name of the NAT rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallNetworkRuleProtocol> protocols;

    /*
     * The translated address for this NAT rule.
     */
    @JsonProperty(value = "translatedAddress")
    private String translatedAddress;

    /*
     * The translated port for this NAT rule.
     */
    @JsonProperty(value = "translatedPort")
    private String translatedPort;

    /*
     * The translated FQDN for this NAT rule.
     */
    @JsonProperty(value = "translatedFqdn")
    private String translatedFqdn;

    /*
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /**
     * Creates an instance of AzureFirewallNatRule class.
     */
    public AzureFirewallNatRule() {
    }

    /**
     * Get the name property: Name of the NAT rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the NAT rule.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule.
     * 
     * @param description the description value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     * 
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     * 
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses for this rule. Supports IP ranges,
     * prefixes, and service tags.
     * 
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses for this rule. Supports IP ranges,
     * prefixes, and service tags.
     * 
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     * 
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     * 
     * @param destinationPorts the destinationPorts value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the protocols property: Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     * @return the protocols value.
     */
    public List<AzureFirewallNetworkRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     * @param protocols the protocols value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withProtocols(List<AzureFirewallNetworkRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the translatedAddress property: The translated address for this NAT rule.
     * 
     * @return the translatedAddress value.
     */
    public String translatedAddress() {
        return this.translatedAddress;
    }

    /**
     * Set the translatedAddress property: The translated address for this NAT rule.
     * 
     * @param translatedAddress the translatedAddress value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedAddress(String translatedAddress) {
        this.translatedAddress = translatedAddress;
        return this;
    }

    /**
     * Get the translatedPort property: The translated port for this NAT rule.
     * 
     * @return the translatedPort value.
     */
    public String translatedPort() {
        return this.translatedPort;
    }

    /**
     * Set the translatedPort property: The translated port for this NAT rule.
     * 
     * @param translatedPort the translatedPort value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
        return this;
    }

    /**
     * Get the translatedFqdn property: The translated FQDN for this NAT rule.
     * 
     * @return the translatedFqdn value.
     */
    public String translatedFqdn() {
        return this.translatedFqdn;
    }

    /**
     * Set the translatedFqdn property: The translated FQDN for this NAT rule.
     * 
     * @param translatedFqdn the translatedFqdn value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedFqdn(String translatedFqdn) {
        this.translatedFqdn = translatedFqdn;
        return this;
    }

    /**
     * Get the sourceIpGroups property: List of source IpGroups for this rule.
     * 
     * @return the sourceIpGroups value.
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set the sourceIpGroups property: List of source IpGroups for this rule.
     * 
     * @param sourceIpGroups the sourceIpGroups value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
