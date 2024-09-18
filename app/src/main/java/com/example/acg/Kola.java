package com.example.acg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Random;

public class Kola extends View {

    public Kola(Context context) {
        super(context);
    }

    public Kola(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Kola(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int circleRadius = 200;

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Random random = new Random();
        for(int i=0; i<10; i++){
            paint.setARGB(
                    255,
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256)
            );
            canvas.drawCircle(
                    random.nextInt(width),
                    random.nextInt(height),
                    random.nextInt(100),
                    paint
            );
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(
                2,
                2,
                width-3,
                height-3,
                paint);


        super.onDraw(canvas);
    }
}
