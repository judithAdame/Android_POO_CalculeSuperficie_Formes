package com.adame.myappformes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] listeNomFormes = new String [] {"CARRE", "TRIANGLE", "CERCLE", "TRAPEZOIDE", "RECTANGLE", "ELLIPSE", "PARALLELOGRAMME", "SECTEUR"};

        Spinner dropdown = (Spinner) findViewById(R.id.spinerListeFormes);

        ArrayAdapter<String> adapter = new ArrayAdapter <> (this, android.R.layout.simple_spinner_dropdown_item, listeNomFormes );

        dropdown.setAdapter(adapter);
    }

    public void ComputeOnClic(View CalculerSuperficieVue) {
        Spinner dropdown = (Spinner)findViewById(R.id.spinerListeFormes);
        String formeSelectionee = dropdown.getSelectedItem().toString();
        Intent calculerSuperficieVue = new Intent(this, CalculerSuperficieVue.class);
        calculerSuperficieVue.putExtra("FORME", formeSelectionee);
        startActivity(calculerSuperficieVue);
    }
}
