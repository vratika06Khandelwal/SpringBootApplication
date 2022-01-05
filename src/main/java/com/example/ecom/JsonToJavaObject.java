package com.example.ecom;

import java.util.Arrays;
import java.util.List;

import com.example.ecom.Models.Product;
import com.google.gson.Gson;

public class JsonToJavaObject {
	private static Gson gson = new Gson();
	public static Product JsonToJavaObject(String jsonInString)
	{
	
	Product product= gson.fromJson(jsonInString, Product.class);
	return product;
	}
	
	public static List<Product> JsonToJavaList(String jsonInString)
	{

	Product[] array =  gson.fromJson(jsonInString, Product[].class);
	List<Product> productArray=Arrays.asList(array);
	return productArray;
	}


}
