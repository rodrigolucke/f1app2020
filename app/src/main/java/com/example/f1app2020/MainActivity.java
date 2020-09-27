package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEquipe;
    private Button buttonGp;
    private Button buttonTemporada;
    private Button buttonPiloto;
    private Button buttonOutros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            buttonEquipe = (Button)findViewById(R.id.buttonEquipes);
            buttonGp = (Button)findViewById(R.id.buttonGp);
            buttonTemporada = (Button)findViewById(R.id.buttonTemporada);
            buttonPiloto = (Button)findViewById(R.id.buttonPiloto);
            buttonOutros = (Button)findViewById(R.id.buttonOutros);



        }
        public void startMainActivity(View view){
            Intent mainActivity = new Intent(this, MainActivity.class);
            startActivity(mainActivity);
        }

        public void startTemporadaActivity(View view){
            Intent temporadaActivity = new Intent(this, Temporadas.class);
            startActivity(temporadaActivity);
        }

        public void startGpsActivity(View view){
            Intent gpsActivity = new Intent(this, Gps.class);
            startActivity(gpsActivity);
        }

        public void startPilotosActivity(View view){
            Intent pilotosActivity = new Intent(this, Pilotos.class);
            startActivity(pilotosActivity);
        }

        public void startOutrosActivity(View view){
            Intent outrosActivity = new Intent(this,Outros.class);
            startActivity(outrosActivity);
        }

        public void startEquipesActivity(View view){
            Intent equiesActivity = new Intent(this,Equipes.class);
            startActivity(equiesActivity);
        }

    }
