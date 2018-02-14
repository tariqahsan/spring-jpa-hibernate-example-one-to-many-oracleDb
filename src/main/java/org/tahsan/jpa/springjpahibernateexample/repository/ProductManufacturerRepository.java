package org.tahsan.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tahsan.jpa.springjpahibernateexample.model.ProductManufacturer;

public interface ProductManufacturerRepository extends JpaRepository<ProductManufacturer, Long> {
}
