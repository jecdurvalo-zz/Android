package br.com.fiap.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        spnOpcoes = findViewById(R.id.spnOpcoes);

        String[] opcoes = new String[]{"AM", "MG", "SP", "RJ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                opcoes);
    }

    public void salvar(View view) {

        String opcao = spnOpcoes.getSelectedItem().toString();

        Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
    }
}
