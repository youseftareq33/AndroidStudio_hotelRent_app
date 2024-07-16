package com.example.hotelrentsystem.activity_tools;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelrentsystem.R;
import com.example.hotelrentsystem.activity.MainActivity4_rent;
import com.example.hotelrentsystem.classes.Hotel;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder>{

    private List<Hotel> hotelList;

    public HotelAdapter(List<Hotel> hotelList){
        this.hotelList = hotelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        Hotel hotel = hotelList.get(position);

        TextView hotelNameTextView = cardView.findViewById(R.id.hotelName);
        hotelNameTextView.setText(hotel.getName());

        TextView cityTextView = cardView.findViewById(R.id.city);
        cityTextView.setText(hotel.getCity());

        TextView starsTextView = cardView.findViewById(R.id.stars);
        starsTextView.setText(String.valueOf(hotel.getStars()));

        TextView nightCostTextView = cardView.findViewById(R.id.nightcost);
        nightCostTextView.setText(String.valueOf(hotel.getNightCost()));

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cardView.getContext(), MainActivity4_rent.class);
                intent.putExtra("name", hotel.getName());
                intent.putExtra("city", hotel.getCity());
                intent.putExtra("stars", hotel.getStars());
                intent.putExtra("nightCost", hotel.getNightCost());
                // Add other necessary data to the intent
                cardView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }
    }
}
