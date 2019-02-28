package com.business.world.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="ADDRESS")
public class AddressEntity implements Serializable {

    private int id;
    private String addressline1;
    private String city;
    private String state;
    private String streetNum;
    private String zip;

    @Id
    @GeneratedValue
    @Column(name ="ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="ADDRESSLINE1")
    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    @Column(name="CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name="STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name="STREET_NUM")
    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    @Column(name="ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                ", addressline1='" + addressline1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", streetNum='" + streetNum + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
