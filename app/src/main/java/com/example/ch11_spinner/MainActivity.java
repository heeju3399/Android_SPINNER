package com.example.ch11_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SPINNER-TEST");
        Log.i("context","context???"+context);
        final Integer [] movieResouse = {
                R.drawable.mov31,R.drawable.mov32,R.drawable.mov33,R.drawable.mov34,
                R.drawable.mov35,R.drawable.mov36,R.drawable.mov37,R.drawable.mov38,
                R.drawable.mov39,R.drawable.mov40,R.drawable.mov41,R.drawable.mov42
        };
        final String [] movieName = {
                "킹콩","반지의제왕","이름모름","미녀는괴로워","나홀로집에 3","파라안",
                    "더롤3","로마의휴일","매트릭스","가위손","스릴러","에이아이"};
        Spinner spinner = findViewById(R.id.spiner1);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
                        android.R.layout.select_dialog_item, movieName);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                                        int position, long id) {
               final int pos = position;
                ImageView iv = findViewById(R.id.iv1);
                iv.setImageResource(movieResouse[pos]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner.setAdapter(adapter);
    }
}