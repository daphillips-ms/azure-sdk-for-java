// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the network interface ip settings. */
@Fluent
public final class NicIpSettings {
    /*
     * Gets or sets the nic allocation method.
     */
    @JsonProperty(value = "allocationMethod")
    private IpAddressAllocationMethod allocationMethod;

    /*
     * Gets or sets the dns servers.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /*
     * Gets or sets the gateway.
     */
    @JsonProperty(value = "gateway")
    private List<String> gateway;

    /*
     * Gets or sets the ip address for the nic.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Gets or sets the mask.
     */
    @JsonProperty(value = "subnetMask")
    private String subnetMask;

    /*
     * Gets or sets the primary server.
     */
    @JsonProperty(value = "primaryWinsServer", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryWinsServer;

    /*
     * Gets or sets the secondary server.
     */
    @JsonProperty(value = "secondaryWinsServer", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryWinsServer;

    /*
     * Gets or sets the IP address information being reported for this NIC. This contains the same IPv4 information
     * above plus IPV6 information.
     */
    @JsonProperty(value = "ipAddressInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<NicIpAddressSettings> ipAddressInfo;

    /** Creates an instance of NicIpSettings class. */
    public NicIpSettings() {
    }

    /**
     * Get the allocationMethod property: Gets or sets the nic allocation method.
     *
     * @return the allocationMethod value.
     */
    public IpAddressAllocationMethod allocationMethod() {
        return this.allocationMethod;
    }

    /**
     * Set the allocationMethod property: Gets or sets the nic allocation method.
     *
     * @param allocationMethod the allocationMethod value to set.
     * @return the NicIpSettings object itself.
     */
    public NicIpSettings withAllocationMethod(IpAddressAllocationMethod allocationMethod) {
        this.allocationMethod = allocationMethod;
        return this;
    }

    /**
     * Get the dnsServers property: Gets or sets the dns servers.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: Gets or sets the dns servers.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the NicIpSettings object itself.
     */
    public NicIpSettings withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the gateway property: Gets or sets the gateway.
     *
     * @return the gateway value.
     */
    public List<String> gateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: Gets or sets the gateway.
     *
     * @param gateway the gateway value to set.
     * @return the NicIpSettings object itself.
     */
    public NicIpSettings withGateway(List<String> gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the ipAddress property: Gets or sets the ip address for the nic.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: Gets or sets the ip address for the nic.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the NicIpSettings object itself.
     */
    public NicIpSettings withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the subnetMask property: Gets or sets the mask.
     *
     * @return the subnetMask value.
     */
    public String subnetMask() {
        return this.subnetMask;
    }

    /**
     * Set the subnetMask property: Gets or sets the mask.
     *
     * @param subnetMask the subnetMask value to set.
     * @return the NicIpSettings object itself.
     */
    public NicIpSettings withSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
        return this;
    }

    /**
     * Get the primaryWinsServer property: Gets or sets the primary server.
     *
     * @return the primaryWinsServer value.
     */
    public String primaryWinsServer() {
        return this.primaryWinsServer;
    }

    /**
     * Get the secondaryWinsServer property: Gets or sets the secondary server.
     *
     * @return the secondaryWinsServer value.
     */
    public String secondaryWinsServer() {
        return this.secondaryWinsServer;
    }

    /**
     * Get the ipAddressInfo property: Gets or sets the IP address information being reported for this NIC. This
     * contains the same IPv4 information above plus IPV6 information.
     *
     * @return the ipAddressInfo value.
     */
    public List<NicIpAddressSettings> ipAddressInfo() {
        return this.ipAddressInfo;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipAddressInfo() != null) {
            ipAddressInfo().forEach(e -> e.validate());
        }
    }
}
