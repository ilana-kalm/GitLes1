package com.example.gitprjnew;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity  {
        private EditText etName, etMail, etPhone;
        private Button btnPress;
        private CustomerPresenter presenter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etName = findViewById(R.id.etName);
            etMail = findViewById(R.id.etMail);
            etPhone = findViewById(R.id.etPhone);
            btnPress = findViewById(R.id.btnPress);

            presenter = new CustomerPresenter(this);

            btnPress.setOnClickListener(v -> {
                String name = etName.getText().toString();
                String email = etMail.getText().toString();
                String phone = etPhone.getText().toString();
                presenter.submitCustomer(name, email, phone);
            });
        }


    public void showCustomerDetails(Customer customer) {
        Toast.makeText(this, "פרטי הלקוח נשלחו בהצלחה:\n" + customer.toString(), Toast.LENGTH_LONG).show();
        }
}
