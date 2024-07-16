package com.example.hotelrentsystem.classes;

public class Payment {
    private int id;
    private String userRented;
    private String hotelName;
    private double totalCost;


    public Payment(int id, String userRented, String hotelName, double totalCost) {
        this.id = id;
        this.userRented = userRented;
        this.hotelName = hotelName;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserRented() {
        return userRented;
    }

    public void setUserRented(String userRented) {
        this.userRented = userRented;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userRented='" + userRented + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
