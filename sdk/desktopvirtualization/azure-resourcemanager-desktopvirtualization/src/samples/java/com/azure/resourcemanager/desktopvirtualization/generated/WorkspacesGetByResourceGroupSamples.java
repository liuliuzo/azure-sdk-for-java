// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for Workspaces GetByResourceGroup. */
public final class WorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/Workspace_Get.json
     */
    /**
     * Sample code: Workspace_Get.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .workspaces()
            .getByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE);
    }
}
