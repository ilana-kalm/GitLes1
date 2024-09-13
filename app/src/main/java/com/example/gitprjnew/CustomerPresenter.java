package com.example.gitprjnew;

public class CustomerPresenter {
    private MainActivity view;

    public CustomerPresenter(MainActivity view) {
        this.view = view;
    }

    public void submitCustomer(String name, String email, String phone) {
        Customer customer = new Customer(name, email, phone);
        view.showCustomerDetails(customer);
    }
}


