package com.ulpmovil.tp2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Libro libro = (Libro) getIntent().getSerializableExtra("libro");

        if (libro != null) {
            ((TextView) findViewById(R.id.tvTitulo)).setText(libro.getTitulo());
            ((TextView) findViewById(R.id.tvAutor)).setText(libro.getAutor());
            ((TextView) findViewById(R.id.tvPaginas)).setText(libro.getPaginas());
            ((TextView) findViewById(R.id.tvAnio)).setText(libro.getAnio());
            ((ImageView) findViewById(R.id.ivImagen)).setImageResource(libro.getImagen());
            ((TextView) findViewById(R.id.tvDetalles)).setText(libro.getDetalles());
            ((TextView) findViewById(R.id.tvGenero1)).setText(libro.getGenero1());
            ((TextView) findViewById(R.id.tvGenero2)).setText(libro.getGenero2());
        }
        findViewById(R.id.btnAccion).setOnClickListener(v -> {
            Intent intent = new Intent(DetalleActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });

    }

}
