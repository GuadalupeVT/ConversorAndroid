package com.example.sesion04_actividad4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements AdapterView.OnClickListener {
    EditText cajaNumAConvertir,cajaC,cajaF,cajaR,cajaK;
    RadioButton radioF,radioC,radioR,radioK;
    CheckBox chkF,chkC,chkR,chkK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaNumAConvertir=findViewById(R.id.cajaConvertir);
        cajaC=findViewById(R.id.cajaC);
        cajaF=findViewById(R.id.cajaF);
        cajaR=findViewById(R.id.cajaR);
        cajaK=findViewById(R.id.cajaK);

        radioC=findViewById(R.id.radioCentigrados);
        radioF=findViewById(R.id.radioFarenheit);
        radioR=findViewById(R.id.radioRankin);
        radioK=findViewById(R.id.radioKelvin);

        chkF=findViewById(R.id.check_F);
        chkC=findViewById(R.id.check_C);
        chkK=findViewById(R.id.check_K);
        chkR=findViewById(R.id.check_R);
    }



}
