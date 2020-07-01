package com.example.interactivelearning;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
    }

    //Método para el botón enviar
    public void Enviar(View view){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);
    }
}
