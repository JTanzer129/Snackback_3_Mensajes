package com.example.snackbar_3_mensajes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSnackbar_short;
    Button btnSnackbar_long;
    Button  btnSnackbar_indefinite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSnackbar_short = findViewById(R.id.buttonSnackbar_Short);
        btnSnackbar_long = findViewById(R.id.buttonSnackbar_Long);
        btnSnackbar_indefinite = findViewById(R.id.buttonSnackbar_Indefinite);
        btnSnackbar_short.setOnClickListener(this);
        btnSnackbar_long.setOnClickListener(this);
        btnSnackbar_indefinite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonSnackbar_Short) {
            Snackbar.make(v, "Mensaje SnackBar Short", Snackbar.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.buttonSnackbar_Long) {
            Snackbar.make(v, "Mensaje SnackBar Long", Snackbar.LENGTH_LONG).show();
        }
        if (v.getId() == R.id.buttonSnackbar_Indefinite) {
            Snackbar.make(v, "Mensaje SnackBar Indefinite", Snackbar.LENGTH_INDEFINITE).show();
        }
    }
}