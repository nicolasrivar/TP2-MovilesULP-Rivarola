package com.ulpmovil.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import com.ulpmovil.tp2.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EdgeToEdge.enable(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.cargarLibros(new ArrayList<>());

        binding.etBuscar.setOnEditorActionListener((v, actionId, event) -> {
            String title = ((EditText) v).getText().toString().trim();
            Libro libro = encontrarLibro(title);

            if (libro != null) {
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("libro", libro);
                startActivity(intent);
            } else {
                binding.etBuscar.setError("Libro no encontrado");
            }

            return true;
        });
    }

    private Libro encontrarLibro(String title) {
        for (Libro libro : viewModel.getLibros().getValue()) {
            if (libro.getTitulo().equalsIgnoreCase(title)) {
                return libro;
            }
        }
        return null;
    }
}
