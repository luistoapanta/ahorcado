package ute.ltoapanta.ahorcado;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class juego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_juego);
    }
    //esta parte toma de referencia asi deberias llamar a las figuras del ahoracado segun los metodos que pongas para ganar las preguntas
//    if(Model._displayWord.equals(Model.get_answer().toLowerCase())){
//        // Victory
//        handleVictory();
//    } else if(Model._wrongGuessesAmount >= 6){
//        // Loss
//        handleLoss();
//    } else {
//        ImageView hangmanGraphic = (ImageView)findViewById(R.id.hangmanGraphic);
//        Drawable currentImage = getDrawable(getResources().getIdentifier("img_hangman" + Model._wrongGuessesAmount, "drawable", getPackageName()));
//        hangmanGraphic.setImageDrawable(currentImage);
//    }

}