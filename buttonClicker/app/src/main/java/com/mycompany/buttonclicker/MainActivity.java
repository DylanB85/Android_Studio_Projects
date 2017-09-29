package com.mycompany.buttonclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_Click(View view){
        clickCount++;
        TextView txtView = (TextView) findViewById(R.id.txtView1);
        txtView.setText(" "+clickCount);
    }

}
