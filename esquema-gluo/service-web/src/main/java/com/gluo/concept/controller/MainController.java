package com.gluo.concept.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gluo.concept.dao.Response;
import com.gluo.concept.service.ServiceCoreRestClient;

@RestController
public class MainController {

	@Autowired
	private ServiceCoreRestClient serviceCore;

	@RequestMapping("/")
	public Response main(HttpSession session) {
		return serviceCore.getResponse(session.getId());
	}

}
