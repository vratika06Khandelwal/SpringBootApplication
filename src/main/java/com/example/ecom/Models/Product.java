
   
package com.example.ecom.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Product_TBBL")
@XmlRootElement(name = "Product")
@XmlType(propOrder = {
    "id",
    "name",
    "description",
    "price"
})
public class Product implements Serializable {
	@Id
	private int id;

	private  String name;
    private  int price;
	private String description;
	
}
