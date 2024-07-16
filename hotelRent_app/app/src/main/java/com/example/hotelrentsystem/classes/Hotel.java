package com.example.hotelrentsystem.classes;

public class Hotel {

    private int id;
    private String name;
    private String city;
    private int stars;
    private int nightCost;
    private int numOfRooms;


    public Hotel(int id, String name, String city, int stars, int nightCost, int numOfRooms) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.nightCost = nightCost;
        this.numOfRooms = numOfRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getNightCost() {
        return nightCost;
    }

    public void setNightCost(int nightCost) {
        this.nightCost = nightCost;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", stars=" + stars +
                ", nightCost=" + nightCost +
                ", numOfRooms=" + numOfRooms +
                '}';
    }


}
