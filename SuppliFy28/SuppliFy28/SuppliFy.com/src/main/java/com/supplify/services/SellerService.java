package com.supplify.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.supplify.dto.SellerDto;
import com.supplify.entity.Seller;

public interface SellerService {
    void saveUser (SellerDto sellerDto, MultipartFile[] images) throws IOException;
    Seller findUserByEmail(String email );
    List<SellerDto> findAllUsers();
    Seller getLoggedInUser();
    void updateSellerProfile(SellerDto sellerDto, MultipartFile[] images) throws IOException;

    
}