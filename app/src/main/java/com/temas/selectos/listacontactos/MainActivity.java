package com.temas.selectos.listacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v)
    {
        Intent intLista= new Intent(this,Lista.class);
        startActivity(intLista);
    }

    public void OnClickS(View v){
        Intent contactLista = new Intent(this,Spinning.class);
        startActivity(contactLista);
    }
}
