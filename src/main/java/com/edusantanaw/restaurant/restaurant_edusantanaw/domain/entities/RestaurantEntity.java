package com.edusantanaw.restaurant.restaurant_edusantanaw.domain.entities;

public class RestaurantEntity {
    private String _name;
    private String _perfilPhoto;
    private String _description;
    private String[] _categories;
    private boolean _open;

    public RestaurantEntity(String name, String perfilPhoto, String desc, String[] categories, boolean open){
            _name = name;
            _perfilPhoto = perfilPhoto;
            _description = desc;
            _categories = categories;
            _open = open;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_perfilPhoto() {
        return _perfilPhoto;
    }

    public void set_perfilPhoto(String _perfilPhoto) {
        this._perfilPhoto = _perfilPhoto;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public String[] get_categories() {
        return _categories;
    }

    public void set_categories(String[] _categories) {
        this._categories = _categories;
    }

    public boolean is_open() {
        return _open;
    }

    public void set_open(boolean _open) {
        this._open = _open;
    }
}
