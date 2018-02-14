package org.tahsan.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tahsan.jpa.springjpahibernateexample.model.ProductEdition;

public interface ProductEditionRepository extends JpaRepository<ProductEdition, Long> {
}
