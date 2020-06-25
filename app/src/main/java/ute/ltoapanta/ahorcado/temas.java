package ute.ltoapanta.ahorcado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class temas extends AppCompatActivity {
    private String flagX = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_temas);
    }

    public void lenguajeClick(View v){
        flagX = "lenguaje";
        cambiarVista(v);
    }
    public void matematicaClick(View v){
        flagX = "matematica";
        cambiarVista(v);
    }
    public void historiaClick(View v){
        flagX = "historia";
        cambiarVista(v);
    }
    public void naturalesClick(View v){
        flagX = "naturales";
        cambiarVista(v);
    }
    public void cambiarVista(View v){
        Intent intent = new Intent(this,juego.class);
        intent.putExtra("flagX",flagX);
        startActivity(intent);
    }
}