package com.axel.basedejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Ceci est un commentaire sur une ligne

    /**
     * commentaire sur un bloc de code
     */

    // Type_variable nom_variable;
    int age;

    int monAge = 10;

    // les variables numériques entières :
    // byte (8 bits) / short (16 bits) / int (32 bits) / long (64 bits)
    long monLong = 4000L;

    // les variables numériques à virgule floattante :
    // float ( 32 bits ), double ( 64 bits)

    float monFloat = 28.7f;
    double monDouble = 56.9;

    // le Char pour les chaines de caractère
    char monChar = 'e';

    // Les booléens
    boolean monBooleen = false;

    // Les String
    String monString = "valeur";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] monTableau = new int[3];
        monTableau[0] = 1;
        monTableau[1] = 5;
        monTableau[2] = 10;

        for (int i = 0; i < monTableau.length; i++) {
            Log.d("JAVA", "Element: "+i+" est :"+monTableau[i]);
        }

        while (monAge < 20){
            Log.d("JAVA", "C'est inférieur à 20");
            monAge++;
        }

        do {
            Log.d("JAVA", "C'est inférieur à 20");
            monAge++;
        }while (monAge < 20);

        if (monAge < 20){
            Log.d("JAVA", "C'est inférieur à 20");
        } else if (monAge == 20) {

        } else {
            Log.d("JAVA", "C'est supérieur à 20");
        }

        switch (monAge){
            case 10 :{
                Log.d("JAVA", "C'est supérieur à 20");
                break;
            }
            case 20 :{
                Log.d("JAVA", "C'est à 20");
                break;
            }
            default:{
                Log.d("JAVA", "C'est à 20");
            }
        }
    }
}


















