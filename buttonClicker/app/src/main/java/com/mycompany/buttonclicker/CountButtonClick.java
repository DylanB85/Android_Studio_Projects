package com.mycompany.buttonclicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dylan on 20/09/2017.
 */

public class CountButtonClick extends Activity{
    Button btn1;
    TextView txtView1;
    int clickCount = 0;
/*
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        txtView1 = (TextView) findViewById(R.id.txtView1);


        btn1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                clickCount ++;
                txtView1.setText(" "+clickCount);
            }
        });
    }*/

}
