// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PacketCapturesStopMockTests {
    @Test
    public void testStop() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"hnykz\",\"name\":\"gswvxwlmzqwm\",\"status\":\"tx\",\"resourceId\":\"mxmcuqudtcvclxy\",\"startTime\":\"2021-06-24T22:05:31Z\",\"endTime\":\"2021-08-20T13:54:14Z\",\"percentComplete\":56.83583807388026,\"properties\":\"datauiyjib\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AsyncOperationStatus response =
            manager.packetCaptures().stop("ovmribiattg", "lu", "fotang", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hnykz", response.id());
        Assertions.assertEquals("gswvxwlmzqwm", response.name());
        Assertions.assertEquals("tx", response.status());
        Assertions.assertEquals("mxmcuqudtcvclxy", response.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T22:05:31Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-20T13:54:14Z"), response.endTime());
        Assertions.assertEquals(56.83583807388026D, response.percentComplete());
    }
}
