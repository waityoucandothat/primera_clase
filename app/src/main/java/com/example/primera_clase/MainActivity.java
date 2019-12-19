package com.example.primera_clase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //
    public void cambioTex(View varible){
        EditText campoDeTex =(EditText) findViewById(R.id.campoDeTexto);
        TextView mensaje =(TextView) findViewById(R.id.mensaje);
        mensaje.setText(campoDeTex.getText());
    }
}
