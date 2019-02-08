package com.company.customer;


public class Customer
{
    private Integer id;
    private String name;
    private String address;


    public Customer(Integer id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public Integer getId()
    {
        return id;
    }


    public String getName()
    {
        return name;
    }


    public String getAddress()
    {
        return address;
    }
}
