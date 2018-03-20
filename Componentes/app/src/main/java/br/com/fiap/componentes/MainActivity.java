package br.com.fiap.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Classe R cria referências
        // Pegar componente do xml para poder manipulá-lo
        imgAndroid = findViewById(R.id.imgAndroid);
    }

    public void alterarimagem(View view) {
        // Método que manda requisição para trocar imagem
        imgAndroid.setImageResource(R.drawable.android1);
    }
}
