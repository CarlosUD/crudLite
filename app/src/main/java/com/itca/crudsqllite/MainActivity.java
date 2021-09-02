package com.itca.crudsqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{
    private EditText etcodigo,etdescripcion,etprecio;
 private Button guardar,consultarcodigo,condultadescripcion,btnEliminar,modificar,salir,nuevo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      etcodigo=findViewById(R.id.etcodigo);
       etdescripcion=findViewById(R.id.etdescrion);
       etprecio=findViewById(R.id.etprecio);

       guardar=findViewById(R.id.guardar);
       consultarcodigo=findViewById(R.id.consultarcodigo);
        condultadescripcion=findViewById(R.id.condultadescripcion);
        btnEliminar=findViewById(R.id.btnEliminar);
        modificar=findViewById(R.id.modificar);
        salir=findViewById(R.id.salir);
        nuevo=findViewById(R.id.nuevo);

        guardar.setOnClickListener(this);
        consultarcodigo.setOnClickListener(this);
        condultadescripcion.setOnClickListener(this);
        btnEliminar.setOnClickListener(this);
        modificar.setOnClickListener(this);
        salir.setOnClickListener(this);
        nuevo.setOnClickListener(this);


    }
    public  void  alta (View view) {
        AminSQLiteOpenHelper admin =new AminSQLiteOpenHelper(this,"administracion",null,1);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.guardar:
                
                break;
            case  R.id.consultarcodigo:
                Toast.makeText(this, "codigo", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.condultadescripcion:
                Toast.makeText(this, "descripcion", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.btnEliminar:
                Toast.makeText(this, "eliminar", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.modificar:
                Toast.makeText(this, "modificar", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.salir:
                Toast.makeText(this, "salir", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.nuevo:
                Toast.makeText(this, "nuevo", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}