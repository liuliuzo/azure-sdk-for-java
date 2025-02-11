// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Backup. */
public interface Backup {
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
     * Gets the location property: Resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the backupId property: backupId
     *
     * <p>UUID v4 used to identify the Backup.
     *
     * @return the backupId value.
     */
    String backupId();

    /**
     * Gets the creationDate property: creationDate
     *
     * <p>The creation date of the backup.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the size property: Size of backup.
     *
     * @return the size value.
     */
    Long size();

    /**
     * Gets the label property: Label for backup.
     *
     * @return the label value.
     */
    String label();

    /**
     * Gets the backupType property: backupType
     *
     * <p>Type of backup Manual or Scheduled.
     *
     * @return the backupType value.
     */
    BackupType backupType();

    /**
     * Gets the failureReason property: Failure reason.
     *
     * @return the failureReason value.
     */
    String failureReason();

    /**
     * Gets the volumeName property: Volume name.
     *
     * @return the volumeName value.
     */
    String volumeName();

    /**
     * Gets the useExistingSnapshot property: Manual backup an already existing snapshot. This will always be false for
     * scheduled backups and true/false for manual backups.
     *
     * @return the useExistingSnapshot value.
     */
    Boolean useExistingSnapshot();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.BackupInner object.
     *
     * @return the inner object.
     */
    BackupInner innerModel();

    /** The entirety of the Backup definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }

    /** The Backup definition stages. */
    interface DefinitionStages {
        /** The first stage of the Backup definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Backup definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /** The stage of the Backup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, poolName, volumeName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of the NetApp account.
             * @param poolName The name of the capacity pool.
             * @param volumeName The name of the volume.
             * @return the next definition stage.
             */
            WithCreate withExistingVolume(
                String resourceGroupName, String accountName, String poolName, String volumeName);
        }

        /**
         * The stage of the Backup definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLabel, DefinitionStages.WithUseExistingSnapshot {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Backup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Backup create(Context context);
        }

        /** The stage of the Backup definition allowing to specify label. */
        interface WithLabel {
            /**
             * Specifies the label property: Label for backup.
             *
             * @param label Label for backup.
             * @return the next definition stage.
             */
            WithCreate withLabel(String label);
        }

        /** The stage of the Backup definition allowing to specify useExistingSnapshot. */
        interface WithUseExistingSnapshot {
            /**
             * Specifies the useExistingSnapshot property: Manual backup an already existing snapshot. This will always
             * be false for scheduled backups and true/false for manual backups.
             *
             * @param useExistingSnapshot Manual backup an already existing snapshot. This will always be false for
             *     scheduled backups and true/false for manual backups.
             * @return the next definition stage.
             */
            WithCreate withUseExistingSnapshot(Boolean useExistingSnapshot);
        }
    }

    /**
     * Begins update for the Backup resource.
     *
     * @return the stage of resource update.
     */
    Backup.Update update();

    /** The template for Backup update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithLabel, UpdateStages.WithUseExistingSnapshot {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Backup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Backup apply(Context context);
    }

    /** The Backup update stages. */
    interface UpdateStages {
        /** The stage of the Backup update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the Backup update allowing to specify label. */
        interface WithLabel {
            /**
             * Specifies the label property: Label for backup.
             *
             * @param label Label for backup.
             * @return the next definition stage.
             */
            Update withLabel(String label);
        }

        /** The stage of the Backup update allowing to specify useExistingSnapshot. */
        interface WithUseExistingSnapshot {
            /**
             * Specifies the useExistingSnapshot property: Manual backup an already existing snapshot. This will always
             * be false for scheduled backups and true/false for manual backups.
             *
             * @param useExistingSnapshot Manual backup an already existing snapshot. This will always be false for
             *     scheduled backups and true/false for manual backups.
             * @return the next definition stage.
             */
            Update withUseExistingSnapshot(Boolean useExistingSnapshot);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Backup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Backup refresh(Context context);

    /**
     * Create a new Backup Restore Files request
     *
     * <p>Restore the specified files from the specified backup to the active filesystem.
     *
     * @param body Restore payload supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreFiles(BackupRestoreFiles body);

    /**
     * Create a new Backup Restore Files request
     *
     * <p>Restore the specified files from the specified backup to the active filesystem.
     *
     * @param body Restore payload supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreFiles(BackupRestoreFiles body, Context context);
}
