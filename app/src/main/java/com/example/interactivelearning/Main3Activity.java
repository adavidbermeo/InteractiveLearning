package com.example.interactivelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    protected TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Poner Icono en action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        tv1 = (TextView)findViewById(R.id.result_name);
        tv2 = (TextView)findViewById(R.id.result_username);
        tv3 = (TextView)findViewById(R.id.result_password);
        tv4 = (TextView)findViewById(R.id.result_english_level);


        registro();
    }
    private void registro() {
        Bundle extras =  getIntent().getExtras();

        String[] results = getIntent().getStringArrayExtra("array_values");
        //String result = getIntent().getStringExtra("name");

        tv1.setText("Name: " + results[0]);
        tv2.setText("Username: " + results[1]);
        tv3.setText("Password: " + results[2]);
        tv4.setText("English Level: " + results[3]);

    }
    public void returnMainClass(View view){
        //Regreesar al inicio
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}