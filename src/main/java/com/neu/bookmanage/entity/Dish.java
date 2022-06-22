package com.neu.bookmanage.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName dish
 */
@Data
public class Dish implements Serializable {
    /**
     * 
     */
    private Integer dishId;

    /**
     * 
     */
    private String dishName;

    /**
     * 
     */
    private Double dishPrice;

    /**
     * 
     */
    private String dishMessage;

    /**
     * 
     */
    private Integer restaurantId;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dish other = (Dish) that;
        return (this.getDishId() == null ? other.getDishId() == null : this.getDishId().equals(other.getDishId()))
            && (this.getDishName() == null ? other.getDishName() == null : this.getDishName().equals(other.getDishName()))
            && (this.getDishPrice() == null ? other.getDishPrice() == null : this.getDishPrice().equals(other.getDishPrice()))
            && (this.getDishMessage() == null ? other.getDishMessage() == null : this.getDishMessage().equals(other.getDishMessage()))
            && (this.getRestaurantId() == null ? other.getRestaurantId() == null : this.getRestaurantId().equals(other.getRestaurantId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDishId() == null) ? 0 : getDishId().hashCode());
        result = prime * result + ((getDishName() == null) ? 0 : getDishName().hashCode());
        result = prime * result + ((getDishPrice() == null) ? 0 : getDishPrice().hashCode());
        result = prime * result + ((getDishMessage() == null) ? 0 : getDishMessage().hashCode());
        result = prime * result + ((getRestaurantId() == null) ? 0 : getRestaurantId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dishId=").append(dishId);
        sb.append(", dishName=").append(dishName);
        sb.append(", dishPrice=").append(dishPrice);
        sb.append(", dishMessage=").append(dishMessage);
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}