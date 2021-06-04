package com.hbflc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product_dec")
@Data
public class ProductCategory {
	@Id
	@Column(name = "product_no")
	private int productId;
	@Column(name = "product_category")
	private String productCategory;
	@Column(name = "catogory_description")
	private String categoryDescription;
	
}
