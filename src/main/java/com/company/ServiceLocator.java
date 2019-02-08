package com.company;


import com.company.base.Repository;
import com.company.customer.Customer;
import com.company.customer.CustomerController;
import com.company.customer.CustomerControllerImpl;
import com.company.customer.CustomerRepositoryImpl;


public final class ServiceLocator
{
    private static CustomerController CUSTOMER_CONTROLLER;

    private static Repository<Customer, Integer> CUSTOMER_REPOSITORY;


    private ServiceLocator()
    {
        // Service locator class, instantiation is forbidden.
    }


    public static CustomerController getCustomerController()
    {
        if (CUSTOMER_CONTROLLER == null)
        {
            CUSTOMER_CONTROLLER = new CustomerControllerImpl();
        }
        return CUSTOMER_CONTROLLER;
    }


    public static Repository<Customer, Integer> getCustomerRepository()
    {
        if (CUSTOMER_REPOSITORY == null)
        {
            CUSTOMER_REPOSITORY = new CustomerRepositoryImpl();
        }
        return CUSTOMER_REPOSITORY;
    }
}
