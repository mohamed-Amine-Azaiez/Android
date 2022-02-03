package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b;
    TextView result;

    float CalculateIMC(float weight,float height){
        height=(height/100);
        return (float)(weight/(height*height));
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            e1 = (EditText)findViewById(R.id.ed1);
            e2 = (EditText)findViewById(R.id.ed2);
            b= (Button)findViewById(R.id.button);
            result=(TextView) findViewById(R.id.result);
            b.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){
                    if(e1.getText().length()>0 && e2.getText().length()>0){
                        float height = Float.parseFloat(e1.getText().toString());
                        float weight = Float.parseFloat(e2.getText().toString());
                        float imc= CalculateIMC(weight,height);
                        if(imc<16){
                            result.setText("Votre Imc est: "+imc+" Vous etes trop maigre");
                        }else if(imc<18.5){
                            result.setText("Votre Imc est: "+imc+" Vous etes maigre");
                        }else if(imc<25){
                            result.setText("Votre Imc est: "+imc+" Vous etes normal");
                        }else if(imc<30){
                            result.setText("Votre Imc est: "+imc+" Vous etes gros(se)");
                        }else{
                            result.setText("Votre Imc est: "+imc+" Vous etes Obèse");
                        }
                    }
                }
            });

    }



}