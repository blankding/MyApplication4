package com.example.myapplication4;

public class Fruit {
    private  int image_id;
    private  String image_name;
    private  String image_descripe;
    private  String image_Content;


    public Fruit(int image_id, String image_name,String image_descripe, String image_Content) {
        this.image_id = image_id;
        this.image_name = image_name;
        this.image_descripe = image_descripe;
        this.image_Content = image_Content;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getImage_descripe() {
        return image_descripe;
    }

    public void setImage_descripe(String image_descripe) {
        this.image_descripe = image_descripe;
    }

    public String getImage_Content() {
        return image_Content;
    }

    public void setImage_Content(String image_Content) {
        this.image_Content = image_Content;
    }
}
