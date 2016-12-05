package com.example.reflex_gravity.myappsec;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by joelj on 11/19/2016.
 */

public class getmyfont extends TextView {
    public getmyfont(Context context, AttributeSet attrs,int defStyle)
    {
        super(context,attrs,defStyle);
        init();
    }
    public getmyfont(Context context,AttributeSet attrs)
    {
        super(context,attrs);
        init();
    }
    public getmyfont(Context context)
    {
        super(context);
        init();
    }

    private void init()
    {
        if(!isInEditMode())
        {
            Typeface tf=Typeface.createFromAsset(getContext().getAssets(),"fonts/burdeles.ttf");
            setTypeface(tf);
        }
    }

}
