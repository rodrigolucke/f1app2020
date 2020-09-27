package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import get.GetEquipes;
import get.GetPilotos;

public class Pilotos extends AppCompatActivity {
    public static TextView textViewPilotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilotos);


        setContentView(R.layout.activity_pilotos);
        textViewPilotos = findViewById(R.id.textViewPilotos);
        Button btn = findViewById(R.id.buttonListarPilotos);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GetPilotos getPilotos = new GetPilotos();
                getPilotos.execute();
                //String url = "https://jsonplaceholder.typicode.com/posts/1";

            /*  new AsyncHttpClient().get(url, new AsyncHttpResponseHandler() {
                  @Override
                  public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        String str = new String(responseBody);
                        textEquipe.setText(str);


                  }

                  @Override
                  public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                      String str = new String(responseBody);
                      textEquipe.setText("Erro na chamada");
                  }
              });*/
            }
        });


       /* BuscarAsync buscarTemporadas = new BuscarAsync(this);
        buscarTemporadas.execute();*/
    }
}