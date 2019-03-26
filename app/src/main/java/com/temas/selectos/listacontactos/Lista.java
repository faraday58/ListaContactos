package com.temas.selectos.listacontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lista extends AppCompatActivity {

    String [] mDatos;
    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        mDatos= getResources().getStringArray(R.array.datos);
        mListView = findViewById(R.id.listav);

        ArrayAdapter<String> adaptadorLista = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mDatos);
        mListView.setAdapter(adaptadorLista);

        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String usuarioSeleccionado="Mensaje enviado a :" + mDatos[position];
                Toast.makeText(getApplicationContext(),usuarioSeleccionado,Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }
}
