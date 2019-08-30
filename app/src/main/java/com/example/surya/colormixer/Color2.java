package com.example.surya.colormixer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Color2 extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar sr,sg,sb;
    private TextView lal,hra,neela;
    private TextView t1;
    int r=0,g=0,b1=0;
    private RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color2);
        rel=(RelativeLayout) findViewById(R.id.RELL);
        lal=(TextView)findViewById(R.id.red);
        hra=(TextView)findViewById(R.id.green);
        neela=(TextView)findViewById(R.id.blue);
        sr=(SeekBar) findViewById(R.id.seekBar);
        sg=(SeekBar) findViewById(R.id.seekBarG);
        sb=(SeekBar) findViewById(R.id.seekBarB);
        sr.setOnSeekBarChangeListener(this);
        sg.setOnSeekBarChangeListener(this);
        sb.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        switch (seekBar.getId()){
            case R.id.seekBar:
                r=i;
                break;
            case R.id.seekBarG:
                g=i;
                break;
            case R.id.seekBarB:
                b1=i;
                break;


        }
        rel.setBackgroundColor(android.graphics.Color.rgb(r,g,b1));



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        lal.setText("RED " + r);
        hra.setText("GREEN " + g);
        neela.setText("BLUE " + b1);


    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        lal.setText("RED " + r);
        hra.setText("GREEN " + g);
        neela.setText("BLUE " + b1);

    }
}
