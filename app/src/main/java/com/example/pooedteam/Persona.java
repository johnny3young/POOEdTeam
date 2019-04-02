package com.example .pooedteam;

import android.util.Log;
import android.widget.Toast;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    //Métodos
    public String getNombre() {
        return nombre;
    }
    //This (Clase Persona)
    //nombre (Propiedad)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        if (e <0 || e > 150) {
           // Toast.makeText(, "La edad no es válida, por favor digitela nuevamente", Toast.LENGTH_SHORT).show();
            Log.d("La edad no es válida","Ingrese una edad váilida");
        }else {
            edad = e;
        }

    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
//En edad coloqué "-14" y el programa funcionó normalmente COSA que no deberia pasar, motivo por el cual es donde usamos los Getters y Setters para corregir el problema (encapsulando).
    // Colocamos los atributos PRIVATE u con ellos puedo obtener y asignar valores




}
