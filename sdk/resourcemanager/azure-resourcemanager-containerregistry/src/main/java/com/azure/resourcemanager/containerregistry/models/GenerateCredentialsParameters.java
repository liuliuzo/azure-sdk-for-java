// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The parameters used to generate credentials for a specified token or user of a container registry. */
@Fluent
public final class GenerateCredentialsParameters {
    /*
     * The resource ID of the token for which credentials have to be generated.
     */
    @JsonProperty(value = "tokenId")
    private String tokenId;

    /*
     * The expiry date of the generated credentials after which the credentials become invalid.
     */
    @JsonProperty(value = "expiry")
    private OffsetDateTime expiry;

    /*
     * Specifies name of the password which should be regenerated if any -- password1 or password2.
     */
    @JsonProperty(value = "name")
    private TokenPasswordName name;

    /** Creates an instance of GenerateCredentialsParameters class. */
    public GenerateCredentialsParameters() {
    }

    /**
     * Get the tokenId property: The resource ID of the token for which credentials have to be generated.
     *
     * @return the tokenId value.
     */
    public String tokenId() {
        return this.tokenId;
    }

    /**
     * Set the tokenId property: The resource ID of the token for which credentials have to be generated.
     *
     * @param tokenId the tokenId value to set.
     * @return the GenerateCredentialsParameters object itself.
     */
    public GenerateCredentialsParameters withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * Get the expiry property: The expiry date of the generated credentials after which the credentials become invalid.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: The expiry date of the generated credentials after which the credentials become invalid.
     *
     * @param expiry the expiry value to set.
     * @return the GenerateCredentialsParameters object itself.
     */
    public GenerateCredentialsParameters withExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the name property: Specifies name of the password which should be regenerated if any -- password1 or
     * password2.
     *
     * @return the name value.
     */
    public TokenPasswordName name() {
        return this.name;
    }

    /**
     * Set the name property: Specifies name of the password which should be regenerated if any -- password1 or
     * password2.
     *
     * @param name the name value to set.
     * @return the GenerateCredentialsParameters object itself.
     */
    public GenerateCredentialsParameters withName(TokenPasswordName name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
