package com.example.caren.imagegalleryplus.models;

public class Picture {

    //private variables
    int _id;
    String _fileName;
    String _date;
    String _location;

    public Picture() {

    }

    public Picture(String fileName, String date, String location) {
        this._fileName = fileName;
        this._date = date;
        this._location = location;
    }

    public Picture (String fileName, String date) {
        this._fileName = fileName;
        this._date = date;
    }

    public int get_id() {
        return _id;
    }

    public String get_fileName() {
        return _fileName;
    }

    public String get_date() {
        return _date;
    }

    public String get_location() {
        return _location;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_fileName(String _fileName) {
        this._fileName = _fileName;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public void set_location(String _location) {
        this._location = _location;
    }

    public void setID(int i) {
        this._id = i;
    }
}
