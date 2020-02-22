package com.jimprince99.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample1 {
	
	ObjectMapper mapper = new ObjectMapper();


	public static void main(String[] args) {		
		
		// TODO Auto-generated method stub

	}
	
	public String toJson(PersonBean pb) throws JsonProcessingException {
		return mapper.writeValueAsString(pb);
	}
	
	public PersonBean toBean(String json) throws JsonMappingException, JsonProcessingException {
		
		
		return mapper.readValue(json, PersonBean.class);
	}

}
