package com.rbleng.service;

import com.rbleng.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    AuthService authService;

    public void insert(Product product){
		// 对操作进行权限控制
        authService.checkAccess();
        System.out.println("insert product");
    }

    public void delete(Long id){
        authService.checkAccess();
        System.out.println("delete product");
    }
}
