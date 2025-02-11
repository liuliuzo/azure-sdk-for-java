// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Single Host fabric provider specific VM settings. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = HyperVVirtualMachineDetails.class)
@JsonTypeName("HyperVVirtualMachine")
@JsonSubTypes({@JsonSubTypes.Type(name = "VmmVirtualMachine", value = VmmVirtualMachineDetails.class)})
@Fluent
public class HyperVVirtualMachineDetails extends ConfigurationSettings {
    /*
     * The source id of the object.
     */
    @JsonProperty(value = "sourceItemId")
    private String sourceItemId;

    /*
     * The id of the object in fabric.
     */
    @JsonProperty(value = "generation")
    private String generation;

    /*
     * The Last replication time.
     */
    @JsonProperty(value = "osDetails")
    private OSDetails osDetails;

    /*
     * The Last successful failover time.
     */
    @JsonProperty(value = "diskDetails")
    private List<DiskDetails> diskDetails;

    /*
     * A value indicating whether the VM has a physical disk attached. String value of SrsDataContract.PresenceStatus
     * enum.
     */
    @JsonProperty(value = "hasPhysicalDisk")
    private PresenceStatus hasPhysicalDisk;

    /*
     * A value indicating whether the VM has a fibre channel adapter attached. String value of
     * SrsDataContract.PresenceStatus enum.
     */
    @JsonProperty(value = "hasFibreChannelAdapter")
    private PresenceStatus hasFibreChannelAdapter;

    /*
     * A value indicating whether the VM has a shared VHD attached. String value of SrsDataContract.PresenceStatus
     * enum.
     */
    @JsonProperty(value = "hasSharedVhd")
    private PresenceStatus hasSharedVhd;

    /*
     * The Id of the hyper-v host in fabric.
     */
    @JsonProperty(value = "hyperVHostId")
    private String hyperVHostId;

    /** Creates an instance of HyperVVirtualMachineDetails class. */
    public HyperVVirtualMachineDetails() {
    }

    /**
     * Get the sourceItemId property: The source id of the object.
     *
     * @return the sourceItemId value.
     */
    public String sourceItemId() {
        return this.sourceItemId;
    }

    /**
     * Set the sourceItemId property: The source id of the object.
     *
     * @param sourceItemId the sourceItemId value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withSourceItemId(String sourceItemId) {
        this.sourceItemId = sourceItemId;
        return this;
    }

    /**
     * Get the generation property: The id of the object in fabric.
     *
     * @return the generation value.
     */
    public String generation() {
        return this.generation;
    }

    /**
     * Set the generation property: The id of the object in fabric.
     *
     * @param generation the generation value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withGeneration(String generation) {
        this.generation = generation;
        return this;
    }

    /**
     * Get the osDetails property: The Last replication time.
     *
     * @return the osDetails value.
     */
    public OSDetails osDetails() {
        return this.osDetails;
    }

    /**
     * Set the osDetails property: The Last replication time.
     *
     * @param osDetails the osDetails value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withOsDetails(OSDetails osDetails) {
        this.osDetails = osDetails;
        return this;
    }

    /**
     * Get the diskDetails property: The Last successful failover time.
     *
     * @return the diskDetails value.
     */
    public List<DiskDetails> diskDetails() {
        return this.diskDetails;
    }

    /**
     * Set the diskDetails property: The Last successful failover time.
     *
     * @param diskDetails the diskDetails value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withDiskDetails(List<DiskDetails> diskDetails) {
        this.diskDetails = diskDetails;
        return this;
    }

    /**
     * Get the hasPhysicalDisk property: A value indicating whether the VM has a physical disk attached. String value of
     * SrsDataContract.PresenceStatus enum.
     *
     * @return the hasPhysicalDisk value.
     */
    public PresenceStatus hasPhysicalDisk() {
        return this.hasPhysicalDisk;
    }

    /**
     * Set the hasPhysicalDisk property: A value indicating whether the VM has a physical disk attached. String value of
     * SrsDataContract.PresenceStatus enum.
     *
     * @param hasPhysicalDisk the hasPhysicalDisk value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withHasPhysicalDisk(PresenceStatus hasPhysicalDisk) {
        this.hasPhysicalDisk = hasPhysicalDisk;
        return this;
    }

    /**
     * Get the hasFibreChannelAdapter property: A value indicating whether the VM has a fibre channel adapter attached.
     * String value of SrsDataContract.PresenceStatus enum.
     *
     * @return the hasFibreChannelAdapter value.
     */
    public PresenceStatus hasFibreChannelAdapter() {
        return this.hasFibreChannelAdapter;
    }

    /**
     * Set the hasFibreChannelAdapter property: A value indicating whether the VM has a fibre channel adapter attached.
     * String value of SrsDataContract.PresenceStatus enum.
     *
     * @param hasFibreChannelAdapter the hasFibreChannelAdapter value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withHasFibreChannelAdapter(PresenceStatus hasFibreChannelAdapter) {
        this.hasFibreChannelAdapter = hasFibreChannelAdapter;
        return this;
    }

    /**
     * Get the hasSharedVhd property: A value indicating whether the VM has a shared VHD attached. String value of
     * SrsDataContract.PresenceStatus enum.
     *
     * @return the hasSharedVhd value.
     */
    public PresenceStatus hasSharedVhd() {
        return this.hasSharedVhd;
    }

    /**
     * Set the hasSharedVhd property: A value indicating whether the VM has a shared VHD attached. String value of
     * SrsDataContract.PresenceStatus enum.
     *
     * @param hasSharedVhd the hasSharedVhd value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withHasSharedVhd(PresenceStatus hasSharedVhd) {
        this.hasSharedVhd = hasSharedVhd;
        return this;
    }

    /**
     * Get the hyperVHostId property: The Id of the hyper-v host in fabric.
     *
     * @return the hyperVHostId value.
     */
    public String hyperVHostId() {
        return this.hyperVHostId;
    }

    /**
     * Set the hyperVHostId property: The Id of the hyper-v host in fabric.
     *
     * @param hyperVHostId the hyperVHostId value to set.
     * @return the HyperVVirtualMachineDetails object itself.
     */
    public HyperVVirtualMachineDetails withHyperVHostId(String hyperVHostId) {
        this.hyperVHostId = hyperVHostId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (osDetails() != null) {
            osDetails().validate();
        }
        if (diskDetails() != null) {
            diskDetails().forEach(e -> e.validate());
        }
    }
}
