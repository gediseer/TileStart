package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.service.quicksettings.TileService;

@SuppressLint("NewApi")
public class WindowsLinkTileService extends TileService {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onClick() {
        super.onClick();
        Intent intent = new Intent(this, RouterActivity.class);
//        intent.setAction(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityAndCollapse(intent);
    }
}
