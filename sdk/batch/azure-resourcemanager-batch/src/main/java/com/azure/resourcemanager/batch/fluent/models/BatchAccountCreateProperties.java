// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.batch.models.AuthenticationMode;
import com.azure.resourcemanager.batch.models.AutoStorageBaseProperties;
import com.azure.resourcemanager.batch.models.EncryptionProperties;
import com.azure.resourcemanager.batch.models.KeyVaultReference;
import com.azure.resourcemanager.batch.models.NetworkProfile;
import com.azure.resourcemanager.batch.models.PoolAllocationMode;
import com.azure.resourcemanager.batch.models.PublicNetworkAccessType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a Batch account. */
@Fluent
public final class BatchAccountCreateProperties {
    /*
     * The properties related to the auto-storage account.
     */
    @JsonProperty(value = "autoStorage")
    private AutoStorageBaseProperties autoStorage;

    /*
     * The pool allocation mode also affects how clients may authenticate to the Batch Service API. If the mode is
     * BatchService, clients may authenticate using access keys or Azure Active Directory. If the mode is
     * UserSubscription, clients must use Azure Active Directory. The default is BatchService.
     */
    @JsonProperty(value = "poolAllocationMode")
    private PoolAllocationMode poolAllocationMode;

    /*
     * A reference to the Azure key vault associated with the Batch account.
     */
    @JsonProperty(value = "keyVaultReference")
    private KeyVaultReference keyVaultReference;

    /*
     * If not specified, the default value is 'enabled'.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessType publicNetworkAccess;

    /*
     * The network profile only takes effect when publicNetworkAccess is enabled.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a
     * Microsoft managed key. For additional control, a customer-managed key can be used instead.
     */
    @JsonProperty(value = "encryption")
    private EncryptionProperties encryption;

    /*
     * List of allowed authentication modes for the Batch account that can be used to authenticate with the data plane.
     * This does not affect authentication with the control plane.
     */
    @JsonProperty(value = "allowedAuthenticationModes")
    private List<AuthenticationMode> allowedAuthenticationModes;

    /** Creates an instance of BatchAccountCreateProperties class. */
    public BatchAccountCreateProperties() {
    }

    /**
     * Get the autoStorage property: The properties related to the auto-storage account.
     *
     * @return the autoStorage value.
     */
    public AutoStorageBaseProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Set the autoStorage property: The properties related to the auto-storage account.
     *
     * @param autoStorage the autoStorage value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withAutoStorage(AutoStorageBaseProperties autoStorage) {
        this.autoStorage = autoStorage;
        return this;
    }

    /**
     * Get the poolAllocationMode property: The pool allocation mode also affects how clients may authenticate to the
     * Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Azure Active
     * Directory. If the mode is UserSubscription, clients must use Azure Active Directory. The default is BatchService.
     *
     * @return the poolAllocationMode value.
     */
    public PoolAllocationMode poolAllocationMode() {
        return this.poolAllocationMode;
    }

    /**
     * Set the poolAllocationMode property: The pool allocation mode also affects how clients may authenticate to the
     * Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Azure Active
     * Directory. If the mode is UserSubscription, clients must use Azure Active Directory. The default is BatchService.
     *
     * @param poolAllocationMode the poolAllocationMode value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withPoolAllocationMode(PoolAllocationMode poolAllocationMode) {
        this.poolAllocationMode = poolAllocationMode;
        return this;
    }

    /**
     * Get the keyVaultReference property: A reference to the Azure key vault associated with the Batch account.
     *
     * @return the keyVaultReference value.
     */
    public KeyVaultReference keyVaultReference() {
        return this.keyVaultReference;
    }

    /**
     * Set the keyVaultReference property: A reference to the Azure key vault associated with the Batch account.
     *
     * @param keyVaultReference the keyVaultReference value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withKeyVaultReference(KeyVaultReference keyVaultReference) {
        this.keyVaultReference = keyVaultReference;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the networkProfile property: The network profile only takes effect when publicNetworkAccess is enabled.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: The network profile only takes effect when publicNetworkAccess is enabled.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     *
     * @param encryption the encryption value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     *
     * @return the allowedAuthenticationModes value.
     */
    public List<AuthenticationMode> allowedAuthenticationModes() {
        return this.allowedAuthenticationModes;
    }

    /**
     * Set the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     *
     * @param allowedAuthenticationModes the allowedAuthenticationModes value to set.
     * @return the BatchAccountCreateProperties object itself.
     */
    public BatchAccountCreateProperties withAllowedAuthenticationModes(
        List<AuthenticationMode> allowedAuthenticationModes) {
        this.allowedAuthenticationModes = allowedAuthenticationModes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoStorage() != null) {
            autoStorage().validate();
        }
        if (keyVaultReference() != null) {
            keyVaultReference().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
