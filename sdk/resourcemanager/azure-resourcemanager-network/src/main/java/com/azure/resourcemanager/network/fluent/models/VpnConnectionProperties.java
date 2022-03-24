// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingConfiguration;
import com.azure.resourcemanager.network.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VpnConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for VpnConnection. */
@Fluent
public final class VpnConnectionProperties {
    /*
     * Id of the connected vpn site.
     */
    @JsonProperty(value = "remoteVpnSite")
    private SubResource remoteVpnSite;

    /*
     * Routing weight for vpn connection.
     */
    @JsonProperty(value = "routingWeight")
    private Integer routingWeight;

    /*
     * DPD timeout in seconds for vpn connection.
     */
    @JsonProperty(value = "dpdTimeoutSeconds")
    private Integer dpdTimeoutSeconds;

    /*
     * The connection status.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VpnConnectionStatus connectionStatus;

    /*
     * Connection protocol used for this connection.
     */
    @JsonProperty(value = "vpnConnectionProtocolType")
    private VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType;

    /*
     * Ingress bytes transferred.
     */
    @JsonProperty(value = "ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * Egress bytes transferred.
     */
    @JsonProperty(value = "egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * Expected bandwidth in MBPS.
     */
    @JsonProperty(value = "connectionBandwidth")
    private Integer connectionBandwidth;

    /*
     * SharedKey for the vpn connection.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "enableBgp")
    private Boolean enableBgp;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * The Traffic Selector Policies to be considered by this connection.
     */
    @JsonProperty(value = "trafficSelectorPolicies")
    private List<TrafficSelectorPolicy> trafficSelectorPolicies;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "enableRateLimiting")
    private Boolean enableRateLimiting;

    /*
     * Enable internet security.
     */
    @JsonProperty(value = "enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * Use local azure ip to initiate connection.
     */
    @JsonProperty(value = "useLocalAzureIpAddress")
    private Boolean useLocalAzureIpAddress;

    /*
     * The provisioning state of the VPN connection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * List of all vpn site link connections to the gateway.
     */
    @JsonProperty(value = "vpnLinkConnections")
    private List<VpnSiteLinkConnectionInner> vpnLinkConnections;

    /*
     * The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     */
    @JsonProperty(value = "routingConfiguration")
    private RoutingConfiguration routingConfiguration;

    /**
     * Get the remoteVpnSite property: Id of the connected vpn site.
     *
     * @return the remoteVpnSite value.
     */
    public SubResource remoteVpnSite() {
        return this.remoteVpnSite;
    }

    /**
     * Set the remoteVpnSite property: Id of the connected vpn site.
     *
     * @param remoteVpnSite the remoteVpnSite value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withRemoteVpnSite(SubResource remoteVpnSite) {
        this.remoteVpnSite = remoteVpnSite;
        return this;
    }

    /**
     * Get the routingWeight property: Routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: Routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the dpdTimeoutSeconds property: DPD timeout in seconds for vpn connection.
     *
     * @return the dpdTimeoutSeconds value.
     */
    public Integer dpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds;
    }

    /**
     * Set the dpdTimeoutSeconds property: DPD timeout in seconds for vpn connection.
     *
     * @param dpdTimeoutSeconds the dpdTimeoutSeconds value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType;
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withVpnConnectionProtocolType(
        VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.connectionBandwidth;
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withConnectionBandwidth(Integer connectionBandwidth) {
        this.connectionBandwidth = connectionBandwidth;
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }

    /**
     * Set the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.enableRateLimiting;
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withEnableRateLimiting(Boolean enableRateLimiting) {
        this.enableRateLimiting = enableRateLimiting;
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @return the useLocalAzureIpAddress value.
     */
    public Boolean useLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress;
    }

    /**
     * Set the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @param useLocalAzureIpAddress the useLocalAzureIpAddress value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     *
     * @return the vpnLinkConnections value.
     */
    public List<VpnSiteLinkConnectionInner> vpnLinkConnections() {
        return this.vpnLinkConnections;
    }

    /**
     * Set the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     *
     * @param vpnLinkConnections the vpnLinkConnections value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withVpnLinkConnections(List<VpnSiteLinkConnectionInner> vpnLinkConnections) {
        this.vpnLinkConnections = vpnLinkConnections;
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipsecPolicies() != null) {
            ipsecPolicies().forEach(e -> e.validate());
        }
        if (trafficSelectorPolicies() != null) {
            trafficSelectorPolicies().forEach(e -> e.validate());
        }
        if (vpnLinkConnections() != null) {
            vpnLinkConnections().forEach(e -> e.validate());
        }
        if (routingConfiguration() != null) {
            routingConfiguration().validate();
        }
    }
}
