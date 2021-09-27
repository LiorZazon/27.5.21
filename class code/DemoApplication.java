package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.swagger.v3.core.util.Json;
import nonapi.io.github.classgraph.json.JSONUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		Gson gson = new Gson();
		String user_json = "{ \"id\": 1,\n" +
				"  \"name\": \"Leanne Graham\",\n" +
				"  \"username\": \"Bret\",\n" +
				"  \"email\": \"Sincere@april.biz\" }";

		JsonObject json_easy_access = JsonParser.parseString(user_json).getAsJsonObject();
		System.out.println(json_easy_access.get("email"));
		UserDTO user1 = gson.fromJson(json_easy_access, UserDTO.class);
		System.out.println(user1);
	}

}


