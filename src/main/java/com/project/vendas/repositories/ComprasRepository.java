package com.project.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.vendas.entities.Compras;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, Integer> {

}
