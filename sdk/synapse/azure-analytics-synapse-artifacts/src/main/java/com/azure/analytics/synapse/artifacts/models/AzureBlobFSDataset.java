// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Azure Data Lake Storage Gen2 storage. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFSFile")
@JsonFlatten
@Fluent
public class AzureBlobFSDataset extends Dataset {
    /*
     * The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /*
     * The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.fileName")
    private Object fileName;

    /*
     * The format of the Azure Data Lake Storage Gen2 storage.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the blob storage.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /** Creates an instance of AzureBlobFSDataset class. */
    public AzureBlobFSDataset() {}

    /**
     * Get the folderPath property: The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression
     * with resultType string).
     *
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression
     * with resultType string).
     *
     * @param folderPath the folderPath value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the fileName property: The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with
     * resultType string).
     *
     * @return the fileName value.
     */
    public Object getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with
     * resultType string).
     *
     * @param fileName the fileName value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset setFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the format property: The format of the Azure Data Lake Storage Gen2 storage.
     *
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of the Azure Data Lake Storage Gen2 storage.
     *
     * @param format the format value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the blob storage.
     *
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the blob storage.
     *
     * @param compression the compression value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
