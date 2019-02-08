package com.company;


import com.company.customer.CustomerController;


public class Main {

    private static final CustomerController CUSTOMER_CONTROLLER = ServiceLocator.getCustomerController();

    public static void main(String[] args) {
        CUSTOMER_CONTROLLER.findAll();
    }
}
