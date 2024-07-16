package com.example.hotelrentsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelrentsystem.R;
import com.example.hotelrentsystem.classes.User;

import java.util.ArrayList;

public class MainActivity2_signup extends AppCompatActivity {

    private EditText username;
    private EditText email;
    private EditText password;
    private EditText confirmPassword;
    private EditText phoneNumber;
    private ImageView errorImage1;
    private ImageView errorImage2;
    private ImageView errorImage3;
    private ImageView errorImage4;
    private ImageView errorImage5;
    private ImageView correctImage;
    private TextView errorMessage;
    private TextView correctMessage;
    private Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_signup);

        // Initialize views
        username = findViewById(R.id.editTextUsername);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        confirmPassword = findViewById(R.id.editTextConfirmPassword);
        phoneNumber = findViewById(R.id.editTextPhoneNumber);
        errorImage1 = findViewById(R.id.error_image1);
        errorImage2 = findViewById(R.id.error_image2);
        errorImage3 = findViewById(R.id.error_image3);
        errorImage4 = findViewById(R.id.error_image4);
        errorImage5 = findViewById(R.id.error_image5);
        correctImage = findViewById(R.id.correct_image);
        errorMessage = findViewById(R.id.error_message);
        correctMessage = findViewById(R.id.correct_message);
        buttonSignup = findViewById(R.id.signup_button);



        // if the button signup clicked
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = username.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();
                String userConfirmPassword = confirmPassword.getText().toString();
                String userPhoneNumber = phoneNumber.getText().toString();

                // if the fields are not filled
                if (userName.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty() ||
                        userConfirmPassword.isEmpty() || userPhoneNumber.isEmpty()) {
                    errorMessage.setText("Please fill in all fields");
                    errorImage1.setVisibility(View.VISIBLE);
                    errorImage2.setVisibility(View.VISIBLE);
                    errorImage3.setVisibility(View.VISIBLE);
                    errorImage4.setVisibility(View.VISIBLE);
                    errorImage5.setVisibility(View.VISIBLE);
                }
                // else if the password doesn't match
                else if (!userPassword.equals(userConfirmPassword)) {
                    errorImage1.setVisibility(View.GONE);
                    errorImage2.setVisibility(View.VISIBLE);
                    errorImage3.setVisibility(View.VISIBLE);
                    errorMessage.setText("Passwords don't match");
                }
                // else sign up
                else {


                    errorImage1.setVisibility(View.GONE);
                    errorImage2.setVisibility(View.GONE);
                    errorImage3.setVisibility(View.GONE);
                    errorImage4.setVisibility(View.GONE);
                    errorImage5.setVisibility(View.GONE);
                    errorMessage.setText("");

                    correctImage.setVisibility(View.VISIBLE);
                    correctMessage.setText("Account created successfully");

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(MainActivity2_signup.this, MainActivity1_login.class);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);
                }
            }
        });
    }
}
