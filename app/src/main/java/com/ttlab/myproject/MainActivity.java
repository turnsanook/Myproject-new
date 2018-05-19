package com.ttlab.myproject;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userID,userPW;
    String ID,PW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userID = (EditText)findViewById(R.id.useID);
        userPW = (EditText)findViewById(R.id.usePW);

        ID = userID.getText().toString();
        PW = userPW.getText().toString();

        final Button x = findViewById(R.id.btlogin);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userID.getText().toString().equals("admin")&&userPW.getText().toString().equals("1234")) {
                    Intent go1 = new Intent(MainActivity.this, Subac.class);
                    startActivity(go1);
                    Toast.makeText(getApplicationContext(),"Loged in",Toast.LENGTH_SHORT).show();
                    finish();
                }
                else if (userID.getText().toString().equals("stdn")&&userPW.getText().toString().equals("1234")){
                    Intent go2 = new Intent(MainActivity.this, StdnPageActivity.class);
                    startActivity(go2);
                    Toast.makeText(getApplicationContext(),"Loged in",Toast.LENGTH_SHORT).show();
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
