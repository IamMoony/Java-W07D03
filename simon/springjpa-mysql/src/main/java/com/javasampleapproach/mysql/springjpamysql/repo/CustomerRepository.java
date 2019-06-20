package com.javasampleapproach.mysql.springjpamysql.repo;

import java.util.List;

import com.javasampleapproach.mysql.springjpamysql.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
}