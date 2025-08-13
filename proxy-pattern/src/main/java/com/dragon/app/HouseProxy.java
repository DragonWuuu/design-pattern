package com.dragon.app;

import java.util.List;

public interface HouseProxy {
    List<House> getHouses(String location, Integer price, String type);
}
