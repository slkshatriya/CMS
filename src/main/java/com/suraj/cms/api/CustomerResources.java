package com.suraj.cms.api;

import com.suraj.cms.model.Customer;
import com.suraj.cms.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerResources {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){

        return customerServices.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomers(){

        return customerServices.getCustomers();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId){

        return customerServices.getCustomer(customerId);
    }

    @PutMapping(value = "/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer){

        return customerServices.updateCustomer(customerId, customer);
    }

    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId){

        customerServices.deleteCustomer(customerId);
    }
}
