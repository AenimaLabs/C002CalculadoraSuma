package cl.aenimalabs.c002primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);

        }

        //Este método realiza la suma

    public void Suma(View view){
        String valor1 = et1.getText().toString(); //toma el texto ingresado y luego lo convierte (parsea) a String
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1); // cambia dato String a Entero
        int num2 = Integer.parseInt(valor2);

        int suma= num1+num2;

        String result = String.valueOf(suma); // convierte de entero a String
        tv1.setText(result);                    //coloca el texto


    }

}
