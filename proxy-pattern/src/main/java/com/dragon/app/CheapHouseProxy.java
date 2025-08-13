package com.dragon.app;

import java.util.List;

public class CheapHouseProxy implements HouseProxy {
    @Override
    public List<House> getHouses(String location, Integer price, String type) {
        // 判断地理位置是否合适

        // 判断价格是否合适

        // 判断类型是否合适

        House house = new House();
        house.setLocation(location);
        house.setPrice(price);
        house.setType(type);
        return List.of(house);
    }
}
