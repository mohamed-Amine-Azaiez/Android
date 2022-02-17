package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    EditText e1;
    EditText e2;

    Button login;
    TextView result;
    TextView c;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        login= (Button)findViewById(R.id.login);
        result=(TextView) findViewById(R.id.error);

        login.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                if (e1.getText().toString().equals("admin") && e2.getText().toString().equals("admin") ){
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);

                }else{

                    i++;
                    result.setText("ERROR " );
                    if(i==5) {
                        login.setEnabled(false);
                    }
                    }

            }
        });
    }
}