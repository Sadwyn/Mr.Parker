package com.antonrynkovoy.mrparker.parking_models;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;



public class Riviera extends Parking {
    public Riviera(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GREEN);
    }
}
