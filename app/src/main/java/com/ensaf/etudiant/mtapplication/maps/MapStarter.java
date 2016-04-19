package com.ensaf.etudiant.mtapplication.maps;

import android.content.Context;
import android.content.Intent;

import com.ensaf.etudiant.mtapplication.maps.monuments.MonumentsMapActivity;

/**
 * Created by Etudiant on 17/04/2016.
 */
public class MapStarter {

    private Context context;
    private MapConfiguration map;

    public void startActivitys(double x, double y, String place) {
        this.map = new MapConfiguration(x, y, place);
        Intent intent = new Intent(context, MonumentsMapActivity.class);
        intent.putExtra("Place", map);
        context.startActivity(intent);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
