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
        chkF.setOnClickListener(this);
        chkC=findViewById(R.id.check_C);
        chkC.setOnClickListener(this);
        chkK=findViewById(R.id.check_K);
        chkK.setOnClickListener(this);
        chkR=findViewById(R.id.check_R);
        chkR.setOnClickListener(this);
    }
    public void onClick(View v) {
        int click = v.getId();
    double grados = Double.parseDouble(cajaNumAConvertir.getText().toString());

        if (radioC.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.check_C) {
                cajaC.setText(grados + "");
                chkC.setChecked(true);
            }
            if (click == R.id.check_F) {
                double res = grados * 1.8 + 32;
                cajaF.setText(res + "");
                chkF.setChecked(true);
            }
            if (click == R.id.check_R) {
                double res = (grados * 1.8 )+ 491.67;
                cajaR.setText(res + "");
                chkR.setChecked(true);
            }
            if (click == R.id.check_K) {
                double res = grados + 273.15;
                cajaK.setText(res + "");
                chkK.setChecked(true);
            }
        }

        if (radioF.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.check_C) {
                double res=(grados-32)/1.8;
                cajaC.setText(String.valueOf(res));
                chkC.setChecked(true);
            }
            if (click == R.id.check_F) {
                cajaF.setText(grados + "");
                chkF.setChecked(true);
            }
            if (click == R.id.check_R) {
                double res = grados + 459.67;
                cajaR.setText(res + "");
                chkR.setChecked(true);
            }
            if (click == R.id.check_K) {
                double res =((grados-32)/1.8)+273.15;
                cajaK.setText(res + "");
                chkK.setChecked(true);
            }
        }

        if (radioR.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.check_C) {
                double res= (grados-491.67)/1.8;
                cajaC.setText(res + "");
                chkC.setChecked(true);
            }
            if (click == R.id.check_F) {
                double res=grados-459.67;
                cajaF.setText(res + "");
                chkF.setChecked(true);
            }
            if (click == R.id.check_R) {
                cajaR.setText(grados+ "");
                chkR.setChecked(true);
            }
            if (click == R.id.check_K) {
                double res =grados*(5/9.);
                cajaK.setText(res + "");
                chkK.setChecked(true);
            }
        }

        if (radioK.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.check_C) {
                double res=grados-273.15;
                cajaC.setText(res + "");
                chkC.setChecked(true);
            }
            if (click == R.id.check_F) {
                double res=((grados-273.15)*1.8 )+ 32;
                cajaF.setText(res + "");
                chkF.setChecked(true);
            }
            if (click == R.id.check_R) {
                double res=grados*1.8;
                cajaR.setText(res+ "");
                chkR.setChecked(true);
            }
            if (click == R.id.check_K) {
                cajaK.setText(grados+ "");
                chkK.setChecked(true);
            }
        }

    }

    }
