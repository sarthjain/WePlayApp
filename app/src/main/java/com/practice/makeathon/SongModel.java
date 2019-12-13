package com.practice.makeathon;

public class SongModel {

    private String name;
    private String link;
    private String singer;
    private String year;

    public SongModel() {
    }

    public SongModel(String name, String link, String singer, String year) {
        this.name = name;
        this.link = link;
        this.singer = singer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
