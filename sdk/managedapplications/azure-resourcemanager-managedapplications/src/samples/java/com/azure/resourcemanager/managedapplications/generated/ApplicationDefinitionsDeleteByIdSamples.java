// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/** Samples for ApplicationDefinitions DeleteById. */
public final class ApplicationDefinitionsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Solutions/stable/2018-06-01/examples/deleteApplicationDefinition.json
     */
    /**
     * Sample code: Delete application definition.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void deleteApplicationDefinition(
        com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.applicationDefinitions().deleteById("rg", "myManagedApplicationDef", com.azure.core.util.Context.NONE);
    }
}
