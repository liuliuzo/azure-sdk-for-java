// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.models.LogAnalyticsQueryPackQueryInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the list of Log Analytics QueryPack-Query resources. */
@Fluent
public final class LogAnalyticsQueryPackQueryListResult {
    /*
     * List of Log Analytics QueryPack Query definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<LogAnalyticsQueryPackQueryInner> value;

    /*
     * The URI to get the next set of Log Analytics QueryPack definitions if
     * too many QueryPack-Queries where returned in the result set.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Log Analytics QueryPack Query definitions.
     *
     * @return the value value.
     */
    public List<LogAnalyticsQueryPackQueryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Log Analytics QueryPack Query definitions.
     *
     * @param value the value value to set.
     * @return the LogAnalyticsQueryPackQueryListResult object itself.
     */
    public LogAnalyticsQueryPackQueryListResult withValue(List<LogAnalyticsQueryPackQueryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Log Analytics QueryPack definitions if too many
     * QueryPack-Queries where returned in the result set.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Log Analytics QueryPack definitions if too many
     * QueryPack-Queries where returned in the result set.
     *
     * @param nextLink the nextLink value to set.
     * @return the LogAnalyticsQueryPackQueryListResult object itself.
     */
    public LogAnalyticsQueryPackQueryListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model LogAnalyticsQueryPackQueryListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogAnalyticsQueryPackQueryListResult.class);
}
