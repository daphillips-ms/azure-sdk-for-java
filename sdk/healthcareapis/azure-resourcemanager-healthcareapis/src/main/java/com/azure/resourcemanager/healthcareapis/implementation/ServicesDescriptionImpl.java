// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.healthcareapis.fluent.models.ServicesDescriptionInner;
import com.azure.resourcemanager.healthcareapis.models.Kind;
import com.azure.resourcemanager.healthcareapis.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthcareapis.models.ServicesDescription;
import com.azure.resourcemanager.healthcareapis.models.ServicesPatchDescription;
import com.azure.resourcemanager.healthcareapis.models.ServicesProperties;
import com.azure.resourcemanager.healthcareapis.models.ServicesResourceIdentity;
import java.util.Collections;
import java.util.Map;

public final class ServicesDescriptionImpl
    implements ServicesDescription, ServicesDescription.Definition, ServicesDescription.Update {
    private ServicesDescriptionInner innerObject;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ServicesResourceIdentity identity() {
        return this.innerModel().identity();
    }

    public ServicesProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ServicesDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private ServicesPatchDescription updateServicePatchDescription;

    public ServicesDescriptionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ServicesDescription create() {
        this.innerObject = serviceManager.serviceClient()
            .getServices()
            .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServicesDescription create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServices()
            .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    ServicesDescriptionImpl(String name,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerObject = new ServicesDescriptionInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public ServicesDescriptionImpl update() {
        this.updateServicePatchDescription = new ServicesPatchDescription();
        return this;
    }

    public ServicesDescription apply() {
        this.innerObject = serviceManager.serviceClient()
            .getServices()
            .update(resourceGroupName, resourceName, updateServicePatchDescription, Context.NONE);
        return this;
    }

    public ServicesDescription apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServices()
            .update(resourceGroupName, resourceName, updateServicePatchDescription, context);
        return this;
    }

    ServicesDescriptionImpl(ServicesDescriptionInner innerObject,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "services");
    }

    public ServicesDescription refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getServices()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
            .getValue();
        return this;
    }

    public ServicesDescription refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getServices()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
            .getValue();
        return this;
    }

    public ServicesDescriptionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServicesDescriptionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServicesDescriptionImpl withKind(Kind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public ServicesDescriptionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateServicePatchDescription.withTags(tags);
            return this;
        }
    }

    public ServicesDescriptionImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ServicesDescriptionImpl withIdentity(ServicesResourceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ServicesDescriptionImpl withProperties(ServicesProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ServicesDescriptionImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.updateServicePatchDescription.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
