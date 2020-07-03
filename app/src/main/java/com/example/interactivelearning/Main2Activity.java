package com.example.interactivelearning;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public EditText et1,et2,et3,et4;
    public String name_value,username_value,password_value,english_level_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = (EditText) findViewById(R.id.txt_name);
        et2 = (EditText) findViewById(R.id.txt_username);
        et3 = (EditText) findViewById(R.id.txt_password);
        et4 = (EditText) findViewById(R.id.txt_english_level);

    }

    //Método para el botón Regresar
    public void createAccount(View view){

        //String name  = "Angel";

        Intent i = new Intent(this, Main3Activity.class);

        name_value = et1.getText().toString();
        username_value = et2.getText().toString();
        password_value = et3.getText().toString();
        english_level_value = et4.getText().toString();


        String[] array = {name_value, username_value,password_value,english_level_value};

        i.putExtra("array_values", array);

        startActivity(i);

    }
}
