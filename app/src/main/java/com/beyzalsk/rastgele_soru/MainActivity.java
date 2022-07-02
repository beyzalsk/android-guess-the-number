package com.beyzalsk.rastgele_soru;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    EditText Soru;
    RadioButton c1,c2,c3,c4;
    Button  Sonrakı, Cevapla;
    TextView Dogru,Yanlıs;
    Sorular sorular = new Sorular();
    ArrayList<Integer> sıralama = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
    int syc =0;
    int d,y;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Soru = (EditText) findViewById(R.id.Sorular);
        c1 = (RadioButton) findViewById(R.id.c1);
        c2 = (RadioButton) findViewById(R.id.c2);
        c3 = (RadioButton) findViewById(R.id.c3);
        c4 = (RadioButton) findViewById(R.id.c4);
        Dogru = (TextView) findViewById(R.id.Dogru_Cevap);
        Yanlıs= (TextView) findViewById(R.id.Yanlıs_Cevap);
        Cevapla = (Button) findViewById(R.id.Cevapla);
        Sonrakı = (Button) findViewById(R.id.Sonrakı);


        Collections.shuffle(sıralama);
        yukleme();
        Sonrakı.setEnabled(false);
        d=y=0;

        Sonrakı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                syc++;
                if(syc<5) yukleme();
                Cevapla.setEnabled(true);
            }
        });
        Cevapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked()){
                    if(c1.getText().equals(sorular.cevap.get(sıralama.get(syc)))){
                        d++;
                        Dogru.setText(d +" " +"Doğru");
                        
                    } else{
                        y++;
                        Yanlıs.setText(y+ " "+"Yanlış");
                    }
                }
                if (c2.isChecked()){
                    if(c2.getText().equals(sorular.cevap.get(sıralama.get(syc)))){
                        d++;
                        Dogru.setText(d+ " "+"Doğru");

                    } else{
                        y++;
                        Yanlıs.setText(y+" "+"Yanlış");
                    }
                }
                if (c3.isChecked()){
                    if(c3.getText().equals(sorular.cevap.get(sıralama.get(syc)))){
                        d++;
                        Dogru.setText(d+" "+"Doğru");

                    } else{
                        y++;
                        Yanlıs.setText(y+" "+"Yanlış");
                    }
                }
                if (c4.isChecked()){
                    if(c4.getText().equals(sorular.cevap.get(sıralama.get(syc)))){
                        d++;
                        Dogru.setText(d+" "+"Doğru");

                    } else{
                        y++;
                        Yanlıs.setText(y+" "+"Yanlış");
                    }
                }
                Cevapla.setEnabled(false);
                Sonrakı.setEnabled(true);

            }
        });




    }

    private void yukleme() {
        Soru.setText(sorular.soru.get(sıralama.get(syc)));
        Collections.shuffle(sorular.s[sıralama.get(syc)]);
        c1.setText(sorular.s[sıralama.get(syc)].get(0));
        c2.setText(sorular.s[sıralama.get(syc)].get(1));
        c3.setText(sorular.s[sıralama.get(syc)].get(2));
        c4.setText(sorular.s[sıralama.get(syc)].get(3));
        Sonrakı.setEnabled(false);

    }
}