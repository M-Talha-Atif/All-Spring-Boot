package com.supplify.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Sellers")
public class Seller extends User implements Serializable {

	public Seller() {
		this.setRole("SELLER");
	}
    private static final long serialVersionUID = 1L;

    @Column(nullable=false)
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "SellerDocument_images", joinColumns = @JoinColumn(name = "seller_id"))
    @Column(name = "image_url")
    private List<String> imageUrls = new ArrayList<>();
    
    @Column(nullable=false)
	private String shopname;
    
    
    @Column(nullable=false)
	private String address;
    
   
    @Column(nullable=false)
	private String zipcode;

    
	
	
	  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	  @JoinTable(
			    name = "seller_roles",
			    joinColumns = @JoinColumn(name = "seller_id"),
			    inverseJoinColumns = @JoinColumn(name = "role_id")
			)
			private Set<Role> roles = new HashSet<>();
	 }
