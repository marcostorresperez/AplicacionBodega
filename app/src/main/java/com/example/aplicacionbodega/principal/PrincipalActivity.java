package com.example.aplicacionbodega.principal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


import com.example.aplicacionbodega.R;

public class PrincipalActivity extends AppCompatActivity {

    private String nombre;
    private TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        nombre = (String) getIntent().getSerializableExtra("usuario");

        usuario = findViewById(R.id.txtNombre);
        usuario.setText("Usuario: " + nombre);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

      /*  Intent intent;
        switch (item.getItemId()) {
            case R.id.cajeros:
                return true;
            case R.id.descuentos:
                return true;
            case R.id.clave:
                intent = new Intent(PrincipalActivity.this, ClaveActivity.class);
                intent.putExtra("cliente", cliente);
                startActivity(intent);
                return true;
            case R.id.cuentas:
                intent = new Intent(PrincipalActivity.this, CuentasActivity.class);
                intent.putExtra("cliente", cliente);
                startActivity(intent);
                return true;
            case R.id.transferencias:
                intent = new Intent(PrincipalActivity.this, TransferenciasActivity.class);
                intent.putExtra("cliente", cliente);
                startActivity(intent);
                return true;

            default:

       */
        return super.onOptionsItemSelected(item);


    }


}