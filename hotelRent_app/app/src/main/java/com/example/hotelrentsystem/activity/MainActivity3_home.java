package com.example.hotelrentsystem.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelrentsystem.R;
import com.example.hotelrentsystem.activity_tools.HotelAdapter;
import com.example.hotelrentsystem.classes.Hotel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3_home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HotelAdapter hotelAdapter;
    private List<Hotel> hotelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_home);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        hotelList = new ArrayList<>();
        hotelList.add(new Hotel(1,"Alsham", "Nabuls", 4, 300,90));
        hotelList.add(new Hotel(2,"Carmel", "Rammallah", 5, 500,50));
        hotelList.add(new Hotel(3,"shams", "Gaza", 4, 120,30));

        hotelAdapter = new HotelAdapter(hotelList);
        recyclerView.setAdapter(hotelAdapter);

        // Fill the spinners with data
        fillSpinners();
    }

    private void fillSpinners() {
        Spinner spinnerCity = findViewById(R.id.spinnerCity);
        Spinner spinnerNightCost = findViewById(R.id.spinnerNightCost);
        Spinner spinnerStars = findViewById(R.id.spinnerStars);


        ArrayAdapter<CharSequence> cityAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.cities_array,
                android.R.layout.simple_spinner_item
        );
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCity.setAdapter(cityAdapter);

        ArrayAdapter<CharSequence> nightCostAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.night_cost_array,
                android.R.layout.simple_spinner_item
        );
        nightCostAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNightCost.setAdapter(nightCostAdapter);

        ArrayAdapter<CharSequence> starsAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.stars_array,
                android.R.layout.simple_spinner_item
        );
        starsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStars.setAdapter(starsAdapter);
    }
}
