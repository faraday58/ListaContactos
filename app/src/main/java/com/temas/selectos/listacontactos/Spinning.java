package com.temas.selectos.listacontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinning extends AppCompatActivity {

    String [] mDatos;
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinning);

        mDatos = getResources().getStringArray(R.array.datos);
        mSpinner = findViewById(R.id.spinner);

        ArrayAdapter <String> adapatadorSpinner = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mDatos);
        mSpinner.setAdapter(adapatadorSpinner);

        mSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String usuarioSeleccionado="Mensaje enviado a :" + mDatos[position];
                Toast.makeText(getApplicationContext(), usuarioSeleccionado, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
