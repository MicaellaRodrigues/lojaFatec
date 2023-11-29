package com.loja.lojabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loja.lojabackend.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Long, Cliente> {

}
