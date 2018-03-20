package br.com.fiap.completedatetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actPaises;
    DatePicker dtpNasc;
    TimePicker tmpHoraNasc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] paises = {
                "Argentina",
                "Brasil",
                "Chile",
                "Dinamarca",
                "Escocia",
                "França",
                "Guiana Francesa",
                "Haiti",
                "Italia",
                "Janaina",
                "Kwait",
                "Lituania",
                "Marrocos",
                "Nicaragua",
                "Oma",
                "Peru",
                "Quenia",
                "Russia",
                "Suiça"
        };

        // ArrayAdapter serve para colocar os dados dentro de um layout especifico
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                paises
        );

        // Inicializando as variavéis
        actPaises = findViewById(R.id.actPaises);
        actPaises.setAdapter(adapter);

        dtpNasc = findViewById(R.id.dtpNasc);
        tmpHoraNasc = findViewById(R.id.tmpHoraNasc);
    }

    public void salvar (View view){

        int dia     = dtpNasc.getDayOfMonth();
        int mes     = dtpNasc.getMonth() + 1;
        int ano     = dtpNasc.getYear();
        int hora    = tmpHoraNasc.getCurrentHour();
        int minutos = tmpHoraNasc.getCurrentMinute();

        Toast.makeText(
                this,
                String.format("%s | %d/%d/%d | %d:%d ", actPaises.getText(),
                        dia, mes, ano, hora, minutos
                ),
                Toast.LENGTH_SHORT
        ).show();

    }

}
