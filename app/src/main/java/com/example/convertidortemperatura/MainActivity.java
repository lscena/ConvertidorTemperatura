package com.example.convertidortemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creo Variables para los componentes XML
    EditText temperaturaEditText;
    Button aFahrenheitButton;
    Button aCelsiusButton;
    TextView resultadoTextView;
    RadioButton unitInputTemperatureInC;
    RadioButton unitInputTemperatureInF;
    RadioButton unitInputTemperatureInK;
    RadioGroup unitInputTemperatureRadioGroup;

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
        unitInputTemperatureInC=findViewById(R.id.unitInputTemperatureInC);
        unitInputTemperatureInF=findViewById(R.id.unitInputTemperatureInF);
        unitInputTemperatureInK=findViewById(R.id.unitInputTemperatureInK);
        unitInputTemperatureRadioGroup=findViewById(R.id.unitInputTemperatureRadioGroup);

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

        // Get the checked Radio Button ID from Radio Group
        int selectedRadioButtonID = unitInputTemperatureRadioGroup.getCheckedRadioButtonId();

        //Inicializo la variable de la temperatura Resultante:
        Float resultado = 0.0f;

        //Calculo la temperatura resultante en base a la unidad Input:
        switch (selectedRadioButtonID){
            case R.id.unitInputTemperatureInC:
                //Convierto de C a C:
                resultado = temperaturaInputFloat;
                break;
            case R.id.unitInputTemperatureInF:
                //Convierto de F a C:
                resultado = (temperaturaInputFloat -32) * 5 / 9;
                break;
            case R.id.unitInputTemperatureInK:
                //Convierto de K a C:
                resultado = temperaturaInputFloat - 273.15f;
                break;
        }

        // Muestro el resultado:
        //resultadoTextView.setText(Float.toString(resultado));
        //resultadoTextView.setText(Integer.toString(selectedRadioButtonID));
        resultadoTextView.setText(resultado.toString()+"ºC");
    }

    //Creo una función auxiliar que se ejecuta al clickear el Boton de convertir a Fahrenheit:
    public void clickToFahrenheit(View view){
        //Obtengo el Input de Temperatura ingresado por el user y lo grabo en una variable:
        String temperaturaInputStr = temperaturaEditText.getText().toString(); //lo convierto de editable a string
        //paso de str a float y lo grabo en otra variable:
        Float temperaturaInputFloat = Float.parseFloat(temperaturaInputStr);

        // Get the checked Radio Button ID from Radio Group
        int selectedRadioButtonID = unitInputTemperatureRadioGroup.getCheckedRadioButtonId();

        //Inicializo la variable de la temperatura Resultante:
        Float resultado = 0.0f;

        //Calculo la temperatura resultante en base a la unidad Input:
        switch (selectedRadioButtonID){
            case R.id.unitInputTemperatureInC:
                //Convierto de C a F:
                resultado = temperaturaInputFloat * 9 / 5 + 32;
                break;
            case R.id.unitInputTemperatureInF:
                //Convierto de F a F:
                resultado = temperaturaInputFloat;
                break;
            case R.id.unitInputTemperatureInK:
                //Convierto de K a F:
                resultado = (temperaturaInputFloat - 273.15f) * 9 / 5 + 32.0f;
                break;
        }

        // Muestro el resultado:
        //resultadoTextView.setText(Float.toString(resultado));
        resultadoTextView.setText(resultado.toString()+"ºF");
    }

    //Creo una función auxiliar que se ejecuta al clickear el Boton de convertir a Fahrenheit:
    public void clickToKelvin(View view){
        //Obtengo el Input de Temperatura ingresado por el user y lo grabo en una variable:
        String temperaturaInputStr = temperaturaEditText.getText().toString(); //lo convierto de editable a string
        //paso de str a float y lo grabo en otra variable:
        Float temperaturaInputFloat = Float.parseFloat(temperaturaInputStr);

        // Get the checked Radio Button ID from Radio Group
        int selectedRadioButtonID = unitInputTemperatureRadioGroup.getCheckedRadioButtonId();

        //Inicializo la variable de la temperatura Resultante:
        Float resultado = 0.0f;

        //Calculo la temperatura resultante en base a la unidad Input:
        switch (selectedRadioButtonID){
            case R.id.unitInputTemperatureInC:
                //Convierto de C a K:
                resultado = temperaturaInputFloat + 273.15f;
                break;
            case R.id.unitInputTemperatureInF:
                //Convierto de F a K:
                resultado = (temperaturaInputFloat-32.0f)*5/9+273.15f;
                break;
            case R.id.unitInputTemperatureInK:
                //Convierto de K a K:
                resultado = temperaturaInputFloat;
                break;
        }

        // Muestro el resultado:
        //resultadoTextView.setText(Float.toString(resultado));
        resultadoTextView.setText(resultado.toString()+"K");
    }

}
