package com.company.customer;


import java.util.List;

import com.company.ServiceLocator;
import com.company.base.Repository;


public class CustomerControllerImpl implements CustomerController
{
    private Repository<Customer, Integer> repository = ServiceLocator.getCustomerRepository();


    @Override
    public List<Customer> findAll()
    {
        return repository.findAll();
    }
}
