// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of private link service IP configuration.
 */
@Fluent
public final class PrivateLinkServiceIpConfigurationPropertiesInner {
    /*
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /*
     * The private IP address allocation method.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * The reference to the subnet resource.
     */
    @JsonProperty(value = "subnet")
    private SubnetInner subnet;

    /*
     * Whether the ip configuration is primary or not.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * The provisioning state of the private link service IP configuration resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     */
    @JsonProperty(value = "privateIPAddressVersion")
    private IpVersion privateIpAddressVersion;

    /**
     * Creates an instance of PrivateLinkServiceIpConfigurationPropertiesInner class.
     */
    public PrivateLinkServiceIpConfigurationPropertiesInner() {
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the PrivateLinkServiceIpConfigurationPropertiesInner object itself.
     */
    public PrivateLinkServiceIpConfigurationPropertiesInner withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the PrivateLinkServiceIpConfigurationPropertiesInner object itself.
     */
    public PrivateLinkServiceIpConfigurationPropertiesInner
        withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the PrivateLinkServiceIpConfigurationPropertiesInner object itself.
     */
    public PrivateLinkServiceIpConfigurationPropertiesInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Whether the ip configuration is primary or not.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Whether the ip configuration is primary or not.
     * 
     * @param primary the primary value to set.
     * @return the PrivateLinkServiceIpConfigurationPropertiesInner object itself.
     */
    public PrivateLinkServiceIpConfigurationPropertiesInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service IP configuration
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateIpAddressVersion property: Whether the specific IP configuration is IPv4 or IPv6. Default is
     * IPv4.
     * 
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    /**
     * Set the privateIpAddressVersion property: Whether the specific IP configuration is IPv4 or IPv6. Default is
     * IPv4.
     * 
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the PrivateLinkServiceIpConfigurationPropertiesInner object itself.
     */
    public PrivateLinkServiceIpConfigurationPropertiesInner
        withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        this.privateIpAddressVersion = privateIpAddressVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
    }
}
