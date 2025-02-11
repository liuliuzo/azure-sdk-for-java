// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * ActiveRevisionsMode controls how active revisions are handled for the Container app:
 * &lt;list&gt;&lt;item&gt;Multiple: multiple revisions can be active. If no value if provided, this is the
 * default&lt;/item&gt;&lt;item&gt;Single: Only one revision can be active at a time. Revision weights can not be used
 * in this mode&lt;/item&gt;&lt;/list&gt;.
 */
public final class ActiveRevisionsMode extends ExpandableStringEnum<ActiveRevisionsMode> {
    /** Static value multiple for ActiveRevisionsMode. */
    public static final ActiveRevisionsMode MULTIPLE = fromString("multiple");

    /** Static value single for ActiveRevisionsMode. */
    public static final ActiveRevisionsMode SINGLE = fromString("single");

    /**
     * Creates a new instance of ActiveRevisionsMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActiveRevisionsMode() {
    }

    /**
     * Creates or finds a ActiveRevisionsMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActiveRevisionsMode.
     */
    @JsonCreator
    public static ActiveRevisionsMode fromString(String name) {
        return fromString(name, ActiveRevisionsMode.class);
    }

    /**
     * Gets known ActiveRevisionsMode values.
     *
     * @return known ActiveRevisionsMode values.
     */
    public static Collection<ActiveRevisionsMode> values() {
        return values(ActiveRevisionsMode.class);
    }
}
