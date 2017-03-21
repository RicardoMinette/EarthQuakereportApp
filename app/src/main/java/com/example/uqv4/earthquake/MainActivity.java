package com.example.uqv4.earthquake;

import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by UQV4 on 15/03/2017.
 */

public class MainActivity extends AppCompatActivity {

    private final String LogMainActivity="LogMainActivity";
    // MainActivty

    @Override
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.main_activity_layout);
        ArrayList<EarthQuake> earthQuakes=QueryUtils.extractEarthQuake();
        //ArrayList<EarthQuake> earthQuakes=setList();

        //test if the values were correctly extracted

        EarthquakeAdapter earthquakeAdapter=new EarthquakeAdapter(this,earthQuakes);
        ListView listView=(ListView) findViewById(R.id.earthquakeList);
        listView.setAdapter(earthquakeAdapter);
    }




    // agora é necesário inflar com o adaptador o listView. Isto oé feito em três passos
    // 1) obter a resposta no formato do Arquivo JSON
    // 2) instanciar a classe JSONObject
    // 3) acessar as informações do JSONObject seguindo a grámatica do JSON e o métodos para tal
    // 4) criar o ArrayList com os dados de interesse obtidos a partir das informações acessadas
    // 5) instanciar a classe EarthQuake com o ArrayList
    // 6) instanciar do adaptador
    // 7) aplicar na listView o adaptador instanciado



    //método criado apenas para testes:

    private ArrayList setList(){

        ArrayList<EarthQuake> earthQuakes=new ArrayList<>();
        earthQuakes.add(new EarthQuake("dumb1","dumb 2","dumb 3"));
        return earthQuakes;

    }








}
