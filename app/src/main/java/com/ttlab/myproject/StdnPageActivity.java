package com.ttlab.myproject;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StdnPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stdn_page);
        final FloatingActionButton btcp = findViewById(R.id.cp);
        btcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Send Checkpoint",Toast.LENGTH_LONG).show();
            }
        });
        final Button backbt = findViewById(R.id.bbt);
        backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback = new Intent(StdnPageActivity.this,MainActivity.class);
                startActivity(goback);
                Toast.makeText(getApplicationContext(),"Back",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
