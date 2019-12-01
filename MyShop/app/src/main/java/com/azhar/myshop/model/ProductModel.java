package com.azhar.myshop.model;

/**
 * Created by Azhar Rivaldi on 01/12/2019.
 */

public class ProductModel {
    public String name, store, img;
    public long price, price_old;
    public int discount;
    public float rating;

    public ProductModel(String name, String store, long price, long price_old, String img, float rating, int discount) {
        this.name = name;
        this.store = store;
        this.price = price;
        this.price_old = price_old;
        this.img = img;
        this.rating = rating;
        this.discount = discount;
    }
}
