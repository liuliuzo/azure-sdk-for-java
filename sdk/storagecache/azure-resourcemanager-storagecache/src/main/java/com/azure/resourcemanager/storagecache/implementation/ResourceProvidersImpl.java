// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.storagecache.fluent.models.RequiredAmlFilesystemSubnetsSizeInner;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemSubnetInfo;
import com.azure.resourcemanager.storagecache.models.RequiredAmlFilesystemSubnetsSize;
import com.azure.resourcemanager.storagecache.models.RequiredAmlFilesystemSubnetsSizeInfo;
import com.azure.resourcemanager.storagecache.models.ResourceProviders;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> checkAmlFSSubnetsWithResponse(
        AmlFilesystemSubnetInfo amlFilesystemSubnetInfo, Context context) {
        return this.serviceClient().checkAmlFSSubnetsWithResponse(amlFilesystemSubnetInfo, context);
    }

    public void checkAmlFSSubnets() {
        this.serviceClient().checkAmlFSSubnets();
    }

    public Response<RequiredAmlFilesystemSubnetsSize> getRequiredAmlFSSubnetsSizeWithResponse(
        RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo, Context context) {
        Response<RequiredAmlFilesystemSubnetsSizeInner> inner =
            this.serviceClient().getRequiredAmlFSSubnetsSizeWithResponse(requiredAmlFilesystemSubnetsSizeInfo, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RequiredAmlFilesystemSubnetsSizeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RequiredAmlFilesystemSubnetsSize getRequiredAmlFSSubnetsSize() {
        RequiredAmlFilesystemSubnetsSizeInner inner = this.serviceClient().getRequiredAmlFSSubnetsSize();
        if (inner != null) {
            return new RequiredAmlFilesystemSubnetsSizeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }
}
