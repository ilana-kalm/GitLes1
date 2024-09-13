package com.example.gitprjnew;

public interface CustomerView {
    void showCustomerDetails(Customer customer);
    void showError(String message);
    void showLoading();
    void hideLoading();
}
