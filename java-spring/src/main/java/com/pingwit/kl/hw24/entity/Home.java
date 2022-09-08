package com.pingwit.kl.hw24.entity;

import javax.persistence.*;

@Entity
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //@Column(name = "home_type")
    @Enumerated(EnumType.STRING)
    private HomeType homeType;
    private Integer floorNumber;
    private Integer entranceNumber;

    public Home() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Integer getEntranceNumber() {
        return entranceNumber;
    }

    public void setEntranceNumber(Integer entranceNumber) {
        this.entranceNumber = entranceNumber;
    }
}
