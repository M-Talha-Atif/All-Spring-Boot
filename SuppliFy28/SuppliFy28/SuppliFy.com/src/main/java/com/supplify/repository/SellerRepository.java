package com.supplify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.supplify.entity.Seller;

import java.util.UUID;

public interface SellerRepository extends JpaRepository<Seller, UUID> {
    Seller findByEmail(String email);
}