package com.nuovonet.rest.util;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.nuovonet.rest.MyPascalCaseStrategy;

public class JSONUtils<T extends Object> {
	
    public JSONUtils() {
         Type x = ((Class<T>)this.getClass()).getGenericSuperclass(); //.getActualTypeArguments()[0];
         System.out.println("Type class name: "+x.toString().split(" ")[1]); 
    }
    
	public String getJson(Object objeto) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        String json = new String();
		try {
			mapper.setPropertyNamingStrategy(new MyPascalCaseStrategy());
			json = mapper.writer().withDefaultPrettyPrinter().writeValueAsString(objeto);
//			json = mapper.writeValueAsString(base);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return json;
	}
	
	public T getObject(String json, Class<T> cls) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		T objeto = (T) new Object();
		try {
			System.out.println("class<T> name: "+cls.getName()); 
			mapper.setPropertyNamingStrategy(new MyPascalCaseStrategy());
			objeto = mapper.readValue(json, cls);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return objeto;
	}
}
