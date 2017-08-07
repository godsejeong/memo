package com.wark.memo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by pc on 2017-06-24.
 */

public class Itemview extends LinearLayout{
    TextView Text;

    public Itemview(Context context) {
        super(context);

        init(context);
    }
    public Itemview(Context context, AttributeSet attrs){
        super(context,attrs);
        init(context);
    }

    private void init(Context context) {
        //레이아웃을 Inflater 해서 붙혀줌
        LayoutInflater flater = (LayoutInflater) context.getSystemService(context.LAUNCHER_APPS_SERVICE);
        flater.inflate(R.layout.list_memo,this,true);

        Text = (TextView) findViewById(R.id.intext);

    }

    //호출
    public void SetName(String name){
    Text.setText(name);
    }
}
