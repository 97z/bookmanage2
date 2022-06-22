package com.neu.bookmanage.controller;

import com.neu.bookmanage.entity.Restaurant;
import com.neu.bookmanage.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {
    @Resource
    private RestaurantService restaurantService;

    @GetMapping("getAll")
    public List<Restaurant> getAll(){

        return restaurantService.getAll();
    }

    @GetMapping("{name}")
    public List<Restaurant> getByName(@PathVariable("name") String name){
        System.out.println(restaurantService.getByName(name));
        return restaurantService.getByName(name);
    }
}
