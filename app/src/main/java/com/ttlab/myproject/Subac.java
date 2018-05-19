package com.ttlab.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mr.T on 3/22/2018.
 */

public class Subac extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac2);
        final Button y = (Button) findViewById(R.id.bt2);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent subac = new Intent(Subac.this,MainActivity.class);
                startActivity(subac);
            }
        });
    }
}
