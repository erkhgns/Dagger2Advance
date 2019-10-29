package com.example.dagger2advance;

import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {


    @Inject
    public Boltons() {
    }



    @Override
    public void prepareForWar() {
        Log.e("Boltons","preparing for war");
    }

    @Override
    public void reportForWar() {
        Log.e("Boltons","reporting for war");


    }
}
