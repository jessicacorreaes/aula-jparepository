package com.devsuperior.aulajparepository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.aulajparepository.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	//@Query("SELECT obj FROM User obj WHERE obj.salario >= :minSalary AND obj.salario <= :maxSalary")
	Page<User> findBySalarioBetween(Double minSalary, Double maxSalary, Pageable pageable);
	
	
	//@Query("SELECT obj FROM User obj WHERE LOWER(obj.nome) LIKE LOWER(CONCAT('%',:name,'%'))")
	Page<User> findByNomeContainingIgnoreCase(String name, Pageable pageable);
	

}
