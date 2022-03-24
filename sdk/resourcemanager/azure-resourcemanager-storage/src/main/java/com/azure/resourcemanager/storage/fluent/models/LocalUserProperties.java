// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.models.PermissionScope;
import com.azure.resourcemanager.storage.models.SshPublicKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Storage Account Local User properties. */
@Fluent
public final class LocalUserProperties {
    /*
     * The permission scopes of the local user.
     */
    @JsonProperty(value = "permissionScopes")
    private List<PermissionScope> permissionScopes;

    /*
     * Optional, local user home directory.
     */
    @JsonProperty(value = "homeDirectory")
    private String homeDirectory;

    /*
     * Optional, local user ssh authorized keys for SFTP.
     */
    @JsonProperty(value = "sshAuthorizedKeys")
    private List<SshPublicKey> sshAuthorizedKeys;

    /*
     * A unique Security Identifier that is generated by the server.
     */
    @JsonProperty(value = "sid", access = JsonProperty.Access.WRITE_ONLY)
    private String sid;

    /*
     * Indicates whether shared key exists. Set it to false to remove existing
     * shared key.
     */
    @JsonProperty(value = "hasSharedKey")
    private Boolean hasSharedKey;

    /*
     * Indicates whether ssh key exists. Set it to false to remove existing SSH
     * key.
     */
    @JsonProperty(value = "hasSshKey")
    private Boolean hasSshKey;

    /*
     * Indicates whether ssh password exists. Set it to false to remove
     * existing SSH password.
     */
    @JsonProperty(value = "hasSshPassword")
    private Boolean hasSshPassword;

    /**
     * Get the permissionScopes property: The permission scopes of the local user.
     *
     * @return the permissionScopes value.
     */
    public List<PermissionScope> permissionScopes() {
        return this.permissionScopes;
    }

    /**
     * Set the permissionScopes property: The permission scopes of the local user.
     *
     * @param permissionScopes the permissionScopes value to set.
     * @return the LocalUserProperties object itself.
     */
    public LocalUserProperties withPermissionScopes(List<PermissionScope> permissionScopes) {
        this.permissionScopes = permissionScopes;
        return this;
    }

    /**
     * Get the homeDirectory property: Optional, local user home directory.
     *
     * @return the homeDirectory value.
     */
    public String homeDirectory() {
        return this.homeDirectory;
    }

    /**
     * Set the homeDirectory property: Optional, local user home directory.
     *
     * @param homeDirectory the homeDirectory value to set.
     * @return the LocalUserProperties object itself.
     */
    public LocalUserProperties withHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
        return this;
    }

    /**
     * Get the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     *
     * @return the sshAuthorizedKeys value.
     */
    public List<SshPublicKey> sshAuthorizedKeys() {
        return this.sshAuthorizedKeys;
    }

    /**
     * Set the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     *
     * @param sshAuthorizedKeys the sshAuthorizedKeys value to set.
     * @return the LocalUserProperties object itself.
     */
    public LocalUserProperties withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys) {
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        return this;
    }

    /**
     * Get the sid property: A unique Security Identifier that is generated by the server.
     *
     * @return the sid value.
     */
    public String sid() {
        return this.sid;
    }

    /**
     * Get the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     *
     * @return the hasSharedKey value.
     */
    public Boolean hasSharedKey() {
        return this.hasSharedKey;
    }

    /**
     * Set the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     *
     * @param hasSharedKey the hasSharedKey value to set.
     * @return the LocalUserProperties object itself.
     */
    public LocalUserProperties withHasSharedKey(Boolean hasSharedKey) {
        this.hasSharedKey = hasSharedKey;
        return this;
    }

    /**
     * Get the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     *
     * @return the hasSshKey value.
     */
    public Boolean hasSshKey() {
        return this.hasSshKey;
    }

    /**
     * Set the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     *
     * @param hasSshKey the hasSshKey value to set.
     * @return the LocalUserProperties object itself.
     */
    public LocalUserProperties withHasSshKey(Boolean hasSshKey) {
        this.hasSshKey = hasSshKey;
        return this;
    }

    /**
     * Get the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     *
     * @return the hasSshPassword value.
     */
    public Boolean hasSshPassword() {
        return this.hasSshPassword;
    }

    /**
     * Set the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     *
     * @param hasSshPassword the hasSshPassword value to set.
     * @return the LocalUserProperties object itself.
     */
    public LocalUserProperties withHasSshPassword(Boolean hasSshPassword) {
        this.hasSshPassword = hasSshPassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permissionScopes() != null) {
            permissionScopes().forEach(e -> e.validate());
        }
        if (sshAuthorizedKeys() != null) {
            sshAuthorizedKeys().forEach(e -> e.validate());
        }
    }
}
