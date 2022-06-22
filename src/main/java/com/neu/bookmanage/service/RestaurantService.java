package com.neu.bookmanage.service;

import com.neu.bookmanage.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> getAll();

    List<Restaurant> getByName(String name);
}
