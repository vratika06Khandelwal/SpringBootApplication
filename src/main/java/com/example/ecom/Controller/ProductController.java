package com.example.ecom.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.ecom.JsonToJavaObject;
import com.example.ecom.Models.Product;
import com.example.ecom.Repository.ProductRepository;
import com.example.ecom.Service.ProductService;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    private Gson gson ;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody String product) {
		Product p = JsonToJavaObject.JsonToJavaObject(product);
        return service.saveProduct(p);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody String products) {
        List<Product> p = (List<Product>) JsonToJavaObject.JsonToJavaList(products);
        return service.saveProducts(p);
    }


  
     
    @GetMapping("/productById/{id}")
    public String findProductById(@PathVariable int id) {
    	String productById=gson.toJson(service.getProductById(id));
        return productById;
    }

   

    @PutMapping("/update")
    public Product updateProduct(@RequestBody String product) {
    	 Product p = JsonToJavaObject.JsonToJavaObject(product);
        return service.updateProduct(p);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
    	String deleteProduct=gson.toJson(service.deleteProduct(id));
        return deleteProduct;
    }
}