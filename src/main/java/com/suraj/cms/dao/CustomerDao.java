package com.suraj.cms.dao;

import com.suraj.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {

    @Override
    List<Customer> findAll();

}
