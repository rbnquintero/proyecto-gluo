package com.gluo.concept;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableRedisHttpSession
@EnableDiscoveryClient
@RestController
@RequestMapping("/rest")
public class ServiceCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCoreApplication.class, args);
	}
	
	@RequestMapping(value="/main")
	public Response main() {
		return new Response("It works!");
	}
	
}

class Response {
	private String id = UUID.randomUUID().toString();
	private String msg;

	public Response(String msg) {
		this.msg = msg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
