package com.adame.myappformes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculerSuperficieVue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculer_superficie);

        Intent monIntent = getIntent();
        String strForme = ((Intent) monIntent).getStringExtra("FORME");

        String titre1= "La forme est " + strForme;

        TextView textViewTitre = (TextView) findViewById(R.id.textViewTitre);
        textViewTitre.setText(titre1);
    }

    public void CalculerOnClic(View myV) {
        EditText val1TxtV =(EditText) findViewById(R.id.editText1);
        EditText val2TxtV =(EditText) findViewById(R.id.editText2);
        EditText val3TxtV =(EditText) findViewById(R.id.editText3);
        Double val1 = Double.parseDouble(val1TxtV.getText().toString());
        Double val2 = Double.parseDouble(val2TxtV.getText().toString());
        Double val3 = Double.parseDouble(val3TxtV.getText().toString());
        TextView textViewResultat = (TextView) findViewById(R.id.textViewResultat);
        textViewResultat.setText(val1+"|"+ val2+"|"+ val3);
    }
}
