package com.uca.capas.domain;

import java.math.BigDecimal;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Product {
	
	@Size(message="La longitud debe tener un máximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String name;

	@Size(message="La longitud debe tener un máximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String brand;

	@Size(message="La longitud debe tener un máximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String description;

	@Size(message="La longitud debe tener un máximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String category;

	@Size(message="La longitud debe tener un máximo de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String expirationdate;

	@Positive(message="Este campo no puede ser negativo")
	private BigDecimal price;
	
	public Product() {
		
	}

	public Product(String name, String brand, String description, String category, String expirationdate, BigDecimal price) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.category = category;
		this.expirationdate = expirationdate;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExpirationdate() {
		return expirationdate;
	}

	public void setExpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}