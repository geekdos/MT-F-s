package com.ensaf.etudiant.mtapplication.maps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.ensaf.etudiant.mtapplication.maps.monuments.MonumentsMapActivity;

import java.io.Serializable;

/**
 * Created by Etudiant on 17/04/2016.
 */
public class MapConfiguration implements Serializable{

    private double x, y;
    private String placeName;

    public MapConfiguration(double x, double y, String placeName) {
        this.x = x;
        this.y = y;
        this.placeName = placeName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
