package com.antonrynkovoy.mrparker.parking_models;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

import com.antonrynkovoy.mrparker.R;



public class Luxoft extends Parking {

    Drawable drawable = getResources().getDrawable(R.drawable.lux_p);

    public Luxoft(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect bounds = canvas.getClipBounds();
        drawable.setBounds(bounds);
        drawable.draw(canvas);
    }
}
