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
        double res=0;
        double grados=Double.parseDouble(cajaNumAConvertir.getText().toString());
        if (click==R.id.check_C){
            if(radioC.isSelected()){
                cajaC.setText(grados+"");
            }
            if(radioF.isSelected()){
                res=(grados-32)/1.8;
                cajaC.setText(res+"");
            }
            if(radioK.isSelected()){
                res=grados -273.15;
                cajaC.setText(res+"");
            }
            if(radioR.isSelected()){
                res=(grados-491)*(5/9);
                cajaC.setText(res+"");
            }
        }


        if (click==R.id.check_F){
            if(radioC.isSelected()){
                res=grados*1.8+32;
                cajaF.setText(grados+"");
            }
            if(radioF.isSelected()){
                cajaF.setText(grados+"");
            }
            if(radioK.isSelected()){
                res=((9/5)*grados)-459.67;
                cajaF.setText(res+"");
            }
            if(radioR.isSelected()){
                res=grados-459.67;
                cajaF.setText(res+"");
            }
        }

    }




    }
