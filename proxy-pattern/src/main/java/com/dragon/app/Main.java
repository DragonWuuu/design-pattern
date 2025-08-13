package com.dragon.app;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseProxy houseProxy = new CheapHouseProxy();
        List<House> houses = houseProxy.getHouses("北京", 100000, "三室一厅");
    }
}