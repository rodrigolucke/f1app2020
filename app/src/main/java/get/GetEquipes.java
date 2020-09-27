package get;

import android.os.AsyncTask;
import android.widget.TextView;

import com.example.f1app2020.Equipes;
import com.example.f1app2020.MainActivity;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import models.Equipe;

public class GetEquipes extends AsyncTask<Void, Void, String> {
    String data = "";
    String dataParsed = "";
    String sigleParsed = "";
    @Override
    protected String doInBackground(Void... params) {
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;


        try {
            URL url = new URL("http://rodrigolucke1-001-site1.itempurl.com/api/2/489079/equipes");
            HttpURLConnection httpURLConnection  = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String linha = "" ;
            //StringBuffer bufferedReadeBufferr = new StringBuffer();
            while(linha != null) {
                linha = bufferedReader.readLine();
                data = data + linha;
              /*  bufferedReader.append(linha);
                bufferedReader.append("\n");*/
            }

            JSONArray JA = new JSONArray(data);
            for (int i = 0; i <JA.length(); i ++){
                JSONObject JO = (JSONObject) JA.get(i);
                        sigleParsed = "id:"+ JO.get("id_equipe")+"\n"+
                         "nome:"+ JO.get("nome")+"\n";
                dataParsed = dataParsed + sigleParsed;
            }


            return bufferedReader.toString();
        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        return null;
    }

    @Override
    protected void onPreExecute () {
        // Este passo é usado para configurar a tarefa, por exemplo, mostrando uma barra de progresso na interface do usuário.
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Equipes.textEquipe.setText(this.dataParsed);
    }


}