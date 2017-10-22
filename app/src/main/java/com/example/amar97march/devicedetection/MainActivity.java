package com.example.amar97march.devicedetection;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtOrientation;
    private TextView txtResolution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get a reference to our TextView widget
        txtOrientation =(TextView) findViewById(R.id.txtOrientation);
        txtResolution=(TextView) findViewById(R.id.txtResolution);

    }
    public void detectDevice(View v){
        Display display = getWindowManager().getDefaultDisplay();
        txtOrientation.setText(""+display.getRotation());
        //now for resolution
        Point xy=new Point();
        display.getSize(xy);
        txtResolution.setText("x = "+xy.x+" y = "+xy.y);

    }
}
