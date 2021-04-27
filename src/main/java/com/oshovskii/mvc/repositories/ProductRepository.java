package com.oshovskii.mvc.repositories;

import com.oshovskii.mvc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}


