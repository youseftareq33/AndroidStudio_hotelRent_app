package com.example.hotelrentsystem.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelrentsystem.R;

public class MainActivity4_rent extends AppCompatActivity {

    private TextView hotelNameTextView;
    private TextView cityTextView;
    private TextView starsTextView;
    private TextView nightCostTextView;
    private Button rentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_rent);

        hotelNameTextView = findViewById(R.id.hotelNameTextView);
        cityTextView = findViewById(R.id.cityTextView);
        starsTextView = findViewById(R.id.starsTextView);
        nightCostTextView = findViewById(R.id.nightCostTextView);
        rentButton = findViewById(R.id.rentButton);

        // Retrieve data from Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String city = extras.getString("city");
            int stars = extras.getInt("stars");
            int nightCost = extras.getInt("nightCost");

            // Set the data to the TextViews
            hotelNameTextView.setText("Hotel Name: " + name);
            cityTextView.setText("City: " + city);
            starsTextView.setText("Stars: " + stars);
            nightCostTextView.setText("Night Cost: " + nightCost);


            rentButton.setOnClickListener(v -> {

            });
        }
    }
}
