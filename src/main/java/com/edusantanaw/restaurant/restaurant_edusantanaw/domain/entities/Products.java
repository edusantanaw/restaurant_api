package com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities;

import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.exceptions.EntityValidationException;

public class Products {
    private String _name;
    private Double _price = 0.0;
    private String _description;
    private String _photo;
    private int _amount = 0;
    private String _restaurant;

    public Products(String name, Double price, String desc, String photo, int amount, String restaurant) throws EntityValidationException {
        _name = name;
        _description = desc;
        _photo = photo;
        _restaurant = restaurant;
        this.set_price(price);
        this.set_amount(amount);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Double get_price() {
        return _price;
    }

    public void set_price(Double _price) throws EntityValidationException {
        if (_price <= 0) throw new EntityValidationException("o preço precisa ser maior que zero!");
        this._price = _price;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public String get_photo() {
        return _photo;
    }

    public void set_photo(String _photo) {
        this._photo = _photo;
    }

    public int get_amount() {
        return _amount;
    }

    public void set_amount(int _amount) throws EntityValidationException {
        if (_price <= 0) throw new EntityValidationException("A quantidade precisa ser maior ou igual a que zero!");
        this._amount = _amount;
    }

    public String get_restaurant() {
        return _restaurant;
    }

    public void set_restaurant(String _restaurant) {
        this._restaurant = _restaurant;
    }
}
