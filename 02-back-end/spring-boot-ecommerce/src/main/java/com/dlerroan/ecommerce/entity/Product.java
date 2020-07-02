package com.dlerroan.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Table(name="product")
@Data //Lombok annotation - Automatically generate the getter/setter methods behind the scenes
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory category;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "units_in_stock")
	private Integer unitsInStock;
	
	@Column(name = "date_created")
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name = "last_updated")
	@UpdateTimestamp
	private Date lastUpdated;
	
}
