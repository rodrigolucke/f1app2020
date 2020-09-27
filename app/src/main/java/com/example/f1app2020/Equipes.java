package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import get.GetEquipes;

public class Equipes extends AppCompatActivity {

    public static TextView textEquipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipes);
        textEquipe = findViewById(R.id.textViewEquipe);
        Button btn = findViewById(R.id.buttonListarEquipes);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GetEquipes getequipe = new GetEquipes();
                getequipe.execute();
              String url = "http://192.168.0.16:44307/api/2/434562/equipes";
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