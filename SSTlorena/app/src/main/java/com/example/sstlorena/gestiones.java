package com.example.sstlorena;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class gestiones extends AppCompatActivity {

    private EditText etIdGestion,etIdUsuario,etIdUsuario2,etNombre,etApellido,etCedula,etCargo, etProducto, etCantidad, etEstado, etImportancia;
    private Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestiones);
        setContentView(R.layout.activity_gestiones);
        etIdGestion = findViewById(R.id.et_id_gestion);
        etIdUsuario = findViewById(R.id.et_id_usuario);
        etIdUsuario2 = findViewById(R.id.et_id_usuario2);
        etNombre = findViewById(R.id.et_nombre);
        etApellido = findViewById(R.id.et_apellido);
        etCedula = findViewById(R.id.et_cedula);
        etCargo = findViewById(R.id.et_cargo);
        etProducto = findViewById(R.id.et_producto);
        etCantidad = findViewById(R.id.et_cantidad);
        etEstado = findViewById(R.id.et_estado);
        etImportancia = findViewById(R.id.et_importancia);
        btnGuardar = findViewById(R.id.btn_guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(gestiones.this, "Datos guardados", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
