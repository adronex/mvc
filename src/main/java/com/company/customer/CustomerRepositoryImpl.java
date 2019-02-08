package com.company.customer;


import java.util.List;

import com.company.base.Repository;


public class CustomerRepositoryImpl implements Repository<Customer, Integer>
{

    @Override
    public List<Customer> findAll()
    {
        System.out.println("lola");
        return null;
    }


    @Override
    public Customer findById(final Integer integer)
    {
        return null;
    }


    @Override
    public void saveOrUpdate(final Customer entity)
    {

    }


    @Override
    public void delete(final Integer integer)
    {

    }
}
