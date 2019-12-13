package com.practice.makeathon;

import java.io.Serializable;

public class MovieModel implements Serializable {

    private String name;
    private String description;
    private String link;

    public MovieModel(){}
    public MovieModel(String name,String description,String link,Boolean favourite){
        this.name = name;
        this.description = description;
        this.link = link;
        this.favourite = favourite;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    private boolean favourite;


}
