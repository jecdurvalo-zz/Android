package br.com.fiap.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CICLO","Passei pelo onCreate");
        
    }

    // onStart
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("CICLO","Passei pelo onStart");
    }

    // onResume
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("CICLO", "Passei pelo onResume");
    }

    // onPause
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("CICLO","Passei pelo onPause");
    }

    // onStop
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("CICLO","Passei pelo onStop");
    }

    // onRestart
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("CICLO","Passei pelo onRestart");
    }
}
