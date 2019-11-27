package com.example.figurasaleatorias;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;

public class RandomShapeView extends View{
    private Integer[] mBackGrounds = {Color.CYAN, Color.GRAY, Color.LTGRAY, Color.MAGENTA, Color.YELLOW, Color.WHITE};

    private Paint[] mForegrounds = {makePaint(Color.BLACK),makePaint(Color.BLUE), makePaint(Color.GREEN), makePaint(Color.RED)};

    private Bitmap[] mPics = {makeBitmap(R.drawable.emo_im_angel),
                              makeBitmap(R.drawable.emo_im_cool),
                              makeBitmap(R.drawable.emo_im_crying),
                              makeBitmap(R.drawable.emo_im_happy),
                              makeBitmap(R.drawable.emo_im_yelling)};

    private String mMessage = "Android";

    public RandomShapeView(Context context){
        super(context);
    }

    public RandomShapeView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(RandomUtils.randomElement(mBackGrounds));
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        int avgShapeWidth = viewWidth/5;
        for (int i=0; i<20; i++){
            drawRandomCircle(canvas, viewWidth, viewHeight, avgShapeWidth);
            drawRandomRect(canvas, viewWidth, viewHeight, avgShapeWidth);
            drawRandomBitmap(canvas, viewWidth, viewHeight);
            drawRandomText(canvas, viewWidth, viewHeight, avgShapeWidth);
        }
    }

    private Paint makePaint(int color){
        Paint p = new Paint();
        p.setColor(color);
        return (p);
    }
    private  Bitmap makeBitmap(int bitmapId){
        return (BitmapFactory.decodeResource(getResources(), bitmapId));
    }
    private void drawRandomCircle(Canvas canvas, int viewWidth, int viewHeight, int avgShapeWidth){
        float x = RandomUtils.randomFloat(viewWidth);
        float y =RandomUtils.randomFloat(viewHeight);
        float radius = RandomUtils.randomFloat(avgShapeWidth/2);
        Paint circleColor = RandomUtils.randomElement(mForegrounds);
        canvas.drawCircle(x, y, radius, circleColor);
    }



}
