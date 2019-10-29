package com.example.dagger2advance;

import android.util.Log;

import javax.inject.Inject;

public class Starks implements House {


    @Inject
    public Starks() {
    }

    @Override
    public void prepareForWar() {
        Log.e("Starks","preparing for war");

    }

    @Override
    public void reportForWar() {
        Log.e("Starks","reporting for war");

    }
}
