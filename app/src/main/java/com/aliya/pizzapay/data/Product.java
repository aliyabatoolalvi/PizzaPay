package com.aliya.pizzapay.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String details;
    public String category;
    public String subCategory;
    public String price;
    public String discountedPrice;
    public String img;
    public String createdAt;
    public String updatedAt;
    public String shortDescription;
    public String size;
    public float rating;
    public Product(){

    }
    public Product(int id, String name, String details, String category, String subCategory, String price, String discountedPrice, String img, String createdAt, String updatedAt, String shortDescription, String size, float rating) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.category = category;
        this.subCategory = subCategory;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.img = img;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.shortDescription = shortDescription;
        this.size = size;
        this.rating = rating;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
