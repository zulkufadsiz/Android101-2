package com.zulkufadsiz.kabuto.android_101_1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
  {
      TextView tv1;
      EditText et1;
      Button    btnFont, btnRenk, btnStil, btnGoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.yazi);
        et1 = (EditText)findViewById(R.id.editText);
        btnFont = (Button)findViewById(R.id.font);
        btnRenk = (Button)findViewById(R.id.renk);
        btnStil = (Button)findViewById(R.id.stil);
        btnGoster =(Button)findViewById(R.id.goster);


        btnFont.setOnClickListener(this);
        btnRenk.setOnClickListener(this);
        btnStil.setOnClickListener(this);
        btnGoster.setOnClickListener(this);





    }
      boolean eskiRenk;
      @Override
      public void onClick(View view) {
        switch (view.getId()){
            case R.id.goster:
                String yazi = et1.getText().toString();
                tv1.setText(yazi);
                break;
            case R.id.renk:
                if (eskiRenk == true)
                tv1.setTextColor(getResources().getColor(R.color.colorPrimary));
                else if (eskiRenk == false)
                tv1.setTextColor(getResources().getColor(R.color.colorAccent));

                    eskiRenk = !eskiRenk;

                break;
            case R.id.stil:
                tv1.setTypeface(null, Typeface.BOLD_ITALIC);
                break;
            case R.id.font:
                tv1.setTypeface(Typeface.SANS_SERIF);
                break;

        }
      }
  }
