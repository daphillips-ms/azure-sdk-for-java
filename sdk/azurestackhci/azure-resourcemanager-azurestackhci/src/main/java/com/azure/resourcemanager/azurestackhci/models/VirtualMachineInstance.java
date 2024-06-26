// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.azurestackhci.fluent.models.VirtualMachineInstanceInner;

/** An immutable client-side representation of VirtualMachineInstance. */
public interface VirtualMachineInstance {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the extendedLocation property: The extendedLocation of the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the hardwareProfile property: HardwareProfile - Specifies the hardware settings for the virtual machine
     * instance.
     *
     * @return the hardwareProfile value.
     */
    VirtualMachineInstancePropertiesHardwareProfile hardwareProfile();

    /**
     * Gets the networkProfile property: NetworkProfile - describes the network configuration the virtual machine
     * instance.
     *
     * @return the networkProfile value.
     */
    VirtualMachineInstancePropertiesNetworkProfile networkProfile();

    /**
     * Gets the osProfile property: OsProfile - describes the configuration of the operating system and sets login data.
     *
     * @return the osProfile value.
     */
    VirtualMachineInstancePropertiesOsProfile osProfile();

    /**
     * Gets the securityProfile property: SecurityProfile - Specifies the security settings for the virtual machine
     * instance.
     *
     * @return the securityProfile value.
     */
    VirtualMachineInstancePropertiesSecurityProfile securityProfile();

    /**
     * Gets the storageProfile property: StorageProfile - contains information about the disks and storage information
     * for the virtual machine instance.
     *
     * @return the storageProfile value.
     */
    VirtualMachineInstancePropertiesStorageProfile storageProfile();

    /**
     * Gets the httpProxyConfig property: HTTP Proxy configuration for the VM.
     *
     * @return the httpProxyConfig value.
     */
    HttpProxyConfiguration httpProxyConfig();

    /**
     * Gets the provisioningState property: Provisioning state of the virtual machine instance.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateEnum provisioningState();

    /**
     * Gets the instanceView property: The virtual machine instance view.
     *
     * @return the instanceView value.
     */
    VirtualMachineInstanceView instanceView();

    /**
     * Gets the status property: The observed state of virtual machine instances.
     *
     * @return the status value.
     */
    VirtualMachineInstanceStatus status();

    /**
     * Gets the guestAgentInstallStatus property: Guest agent install status.
     *
     * @return the guestAgentInstallStatus value.
     */
    GuestAgentInstallStatus guestAgentInstallStatus();

    /**
     * Gets the vmId property: Unique identifier for the vm resource.
     *
     * @return the vmId value.
     */
    String vmId();

    /**
     * Gets the resourceUid property: Unique identifier defined by ARC to identify the guest of the VM.
     *
     * @return the resourceUid value.
     */
    String resourceUid();

    /**
     * Gets the inner com.azure.resourcemanager.azurestackhci.fluent.models.VirtualMachineInstanceInner object.
     *
     * @return the inner object.
     */
    VirtualMachineInstanceInner innerModel();
}
