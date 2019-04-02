package com.example.pooedteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Para crear el objeto persona tengo que instanciarlo acá con el "new" y pueda funcionar con la clase persona que ya se creó
    Persona persona = new Persona();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //POO es un paradigma. Que es un paradigma?? Es un ejemplo o un modelo de algo para seguir porque es muy usado.


        /*persona.nombre = "Johnny Young";
        persona.edad = 38;
        persona.peso = 72;
        persona.estatura = 1.70f;

        Toast.makeText(this, "Los datos de " + persona.nombre + " son: "+"\n" +
                                     "Edad: " + persona.edad +"\n" +
                                      "Peso: " + persona.peso + "\n"+
                                      "Estatura: " + persona.estatura + "\n", Toast.LENGTH_LONG).show();*/

        //En edad coloqué "-14" y el programa funcionó normalmente COSA que no deberia pasar, motivo por el cual es donde usamos los Getters y Setters para corregir el problema (encapsulando)

        persona.setNombre("Johnny III Young");
        //Toast.makeText(this, "Nombre: " + persona.getNombre(), Toast.LENGTH_SHORT).show();
        persona.setEdad(-14);
        //Toast.makeText(this, "Edad: " + persona.getEdad(), Toast.LENGTH_SHORT).show();
        Log.d(String.valueOf(persona), "onCreate: La edad es: " + persona.getEdad());

    }
}
