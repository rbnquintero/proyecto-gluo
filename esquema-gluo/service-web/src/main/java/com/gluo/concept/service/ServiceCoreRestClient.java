package com.gluo.concept.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gluo.concept.dao.Response;

@FeignClient("GATEWAY")
public interface ServiceCoreRestClient {

	@RequestMapping(value = "/service-core/rest/main")
	public Response getResponse(@RequestHeader(value = "x-auth-token") String sessionId);
}
