// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.NetworkFunctionVendorsClient;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionVendorInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionVendor;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionVendors;

public final class NetworkFunctionVendorsImpl implements NetworkFunctionVendors {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkFunctionVendorsImpl.class);

    private final NetworkFunctionVendorsClient innerClient;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public NetworkFunctionVendorsImpl(
        NetworkFunctionVendorsClient innerClient,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkFunctionVendor> list() {
        PagedIterable<NetworkFunctionVendorInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkFunctionVendorImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkFunctionVendor> list(Context context) {
        PagedIterable<NetworkFunctionVendorInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkFunctionVendorImpl(inner1, this.manager()));
    }

    private NetworkFunctionVendorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }
}
