package com.neu.bookmanage.service.impl;

import com.neu.bookmanage.entity.Restaurant;
import com.neu.bookmanage.mapper.RestaurantMapper;
import com.neu.bookmanage.service.RestaurantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Resource
    private RestaurantMapper restaurantMapper;
    @Override
    public List<Restaurant> getAll() {
        return restaurantMapper.getAll();
    }

    @Override
    public List<Restaurant> getByName(String name) {
        return restaurantMapper.getByName(name);
    }
}
