package com.example.appmobileslimerancher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fazenda extends AppCompatActivity {
    Button btnvoltar4;
    Button btnsaibaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazenda);

        btnvoltar4 = findViewById(R.id.btnvoltar4);
        btnvoltar4.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish ();
            }
        });

        Button btnsaibaa = findViewById(R.id.btnsaibaa);
        btnsaibaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://slimerancher-archive.fandom.com/wiki/Slime_Rancher";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    }
