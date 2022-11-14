package com.suraj.cms.services;

import com.suraj.cms.dao.CustomerDao;
import com.suraj.cms.exception.CustomerNotFoundException;
import com.suraj.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerServices {

    @Autowired
    private CustomerDao customerDao;
//    private int customerIdCount = 1;
//    private List<Customer> customerList  = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer){

//        customer.setCustomerId(customerIdCount);
//        customerList.add(customer);
//
//        customerIdCount++;
//
//        return customer;

        return customerDao.save(customer);
    }

    public List<Customer> getCustomers(){
//        return customerList;

        return customerDao.findAll();
    }

    public Customer getCustomer(int customerId){

        Optional<Customer> optionalCustomer = customerDao.findById(customerId);

        if (!optionalCustomer.isPresent()) {

            throw new CustomerNotFoundException("customer is not found");
        }
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();

        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer){

        customer.setCustomerId(customerId);
//        customerList
//                .stream()
//                .forEach(c -> {
//                    if (c.getCustomerId() == customerId){
//
//                        c.setCustomerFirstName(customer.getCustomerFirstName());
//                        c.setCustomerLastName(customer.getCustomerLastName());
//                        c.setCustomerEmailId(customer.getCustomerEmailId());
//                    }
//                });
//
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();

        return customerDao.save(customer);
    }

    public void deleteCustomer(int customerId){

//        customerList
//                .stream()
//                .forEach(c -> {
//                    if (c.getCustomerId() == customerId){
//
//                        customerList.remove(c);
//                    }
//                });

        customerDao.deleteById(customerId);
    }
}
