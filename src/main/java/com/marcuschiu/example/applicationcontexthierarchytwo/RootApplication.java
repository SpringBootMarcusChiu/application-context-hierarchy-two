package com.marcuschiu.example.applicationcontexthierarchytwo;

import com.marcuschiu.example.applicationcontexthierarchytwo.ctx1.Ctx1Config;
import com.marcuschiu.example.applicationcontexthierarchytwo.ctx2.Ctx2Config;
import com.marcuschiu.example.applicationcontexthierarchytwo.parent.ParentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class RootApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder()
				.parent(ParentConfig.class).web(WebApplicationType.NONE)
				.child(Ctx1Config.class).web(WebApplicationType.SERVLET)
				.sibling(Ctx2Config.class).web(WebApplicationType.SERVLET);
		SpringApplication sa = springApplicationBuilder.build();
		sa.run(args);
	}
}