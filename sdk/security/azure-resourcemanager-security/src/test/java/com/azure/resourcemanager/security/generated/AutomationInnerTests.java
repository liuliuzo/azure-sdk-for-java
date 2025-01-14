// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AutomationInner;
import com.azure.resourcemanager.security.models.AutomationAction;
import com.azure.resourcemanager.security.models.AutomationScope;
import com.azure.resourcemanager.security.models.AutomationSource;
import com.azure.resourcemanager.security.models.EventSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AutomationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"opqgikyzirtxdyux\",\"isEnabled\":true,\"scopes\":[{\"description\":\"sewgioilqukr\",\"scopePath\":\"xtqmieoxor\"},{\"description\":\"ufhyaomtbgh\",\"scopePath\":\"vgrvkffo\"}],\"sources\":[{\"eventSource\":\"Alerts\",\"ruleSets\":[]}],\"actions\":[{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"}]},\"location\":\"bgj\",\"tags\":{\"ovwxnbkfezzxsc\":\"umvfclu\",\"omvzzbtd\":\"hwzdgirujbz\",\"yujviylwdshfssn\":\"qvpn\"},\"id\":\"bgye\",\"name\":\"rymsgaojfmw\",\"type\":\"cotmr\"}")
                .toObject(AutomationInner.class);
        Assertions.assertEquals("bgj", model.location());
        Assertions.assertEquals("umvfclu", model.tags().get("ovwxnbkfezzxsc"));
        Assertions.assertEquals("opqgikyzirtxdyux", model.description());
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("sewgioilqukr", model.scopes().get(0).description());
        Assertions.assertEquals("xtqmieoxor", model.scopes().get(0).scopePath());
        Assertions.assertEquals(EventSource.ALERTS, model.sources().get(0).eventSource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationInner model =
            new AutomationInner()
                .withLocation("bgj")
                .withTags(mapOf("ovwxnbkfezzxsc", "umvfclu", "omvzzbtd", "hwzdgirujbz", "yujviylwdshfssn", "qvpn"))
                .withDescription("opqgikyzirtxdyux")
                .withIsEnabled(true)
                .withScopes(
                    Arrays
                        .asList(
                            new AutomationScope().withDescription("sewgioilqukr").withScopePath("xtqmieoxor"),
                            new AutomationScope().withDescription("ufhyaomtbgh").withScopePath("vgrvkffo")))
                .withSources(
                    Arrays
                        .asList(
                            new AutomationSource().withEventSource(EventSource.ALERTS).withRuleSets(Arrays.asList())))
                .withActions(
                    Arrays
                        .asList(
                            new AutomationAction(),
                            new AutomationAction(),
                            new AutomationAction(),
                            new AutomationAction()));
        model = BinaryData.fromObject(model).toObject(AutomationInner.class);
        Assertions.assertEquals("bgj", model.location());
        Assertions.assertEquals("umvfclu", model.tags().get("ovwxnbkfezzxsc"));
        Assertions.assertEquals("opqgikyzirtxdyux", model.description());
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("sewgioilqukr", model.scopes().get(0).description());
        Assertions.assertEquals("xtqmieoxor", model.scopes().get(0).scopePath());
        Assertions.assertEquals(EventSource.ALERTS, model.sources().get(0).eventSource());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
