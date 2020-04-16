package com.example.convertidortemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creo Variables para los componentes XML
    EditText temperaturaEditText;
    Button aFahrenheitButton;
    Button aCelsiusButton;
    TextView resultadoTextView;

    //--------- Evento que se ejecuta al abrir la aplicacion - IN ---------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Conservo lo que hay en el OnCreate anterior
        super.onCreate(savedInstanceState);
        // Creo que esto carga el XML activity_main:
        setContentView(R.layout.activity_main);

        // Asigno los elementos XML a las variables:
        temperaturaEditText=findViewById(R.id.temperaturaEditText);
        aFahrenheitButton=findViewById(R.id.aFahrenheitButton);
        aCelsiusButton=findViewById(R.id.aCelsiusButton);
        resultadoTextView=findViewById(R.id.resultadoTextView);

        // Seteo el TextView de resultado:
        resultadoTextView.setText("");
    }
    // --------- Evento que se ejecuta al abrir la aplicacion - OUT ---------

    //Creo una función auxiliar que se ejecuta al clickear el Boton de convertir a Celsius:
    public void clickToCelsius(View view){
        //Obtengo el Input de Temperatura ingresado por el user y lo grabo en una variable:
        String temperaturaInputStr = temperaturaEditText.getText().toString(); //lo convierto de editable a string
        //paso de str a float y lo grabo en otra variable:
        Float temperaturaInputFloat = Float.parseFloat(temperaturaInputStr);

        //Convierto de F a C:
        Float resultado = (temperaturaInputFloat -32) * 5 / 9;

        // Muestro el resultado:
        //resultadoTextView.setText(Float.toString(resultado));
        resultadoTextView.setText(resultado.toString());
    }

    //Creo una función auxiliar que se ejecuta al clickear el Boton de convertir a Fahrenheit:
    public void clickToFahrenheit(View view){
        //Obtengo el Input de Temperatura ingresado por el user y lo grabo en una variable:
        String temperaturaInputStr = temperaturaEditText.getText().toString(); //lo convierto de editable a string
        //paso de str a float y lo grabo en otra variable:
        Float temperaturaInputFloat = Float.parseFloat(temperaturaInputStr);

        //Convierto de C a F:
        Float resultado = temperaturaInputFloat * 9 / 5 + 32;

        // Muestro el resultado:
        //resultadoTextView.setText(Float.toString(resultado));
        resultadoTextView.setText(resultado.toString());
    }

}
