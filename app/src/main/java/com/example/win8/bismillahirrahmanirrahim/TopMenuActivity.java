package com.example.win8.bismillahirrahmanirrahim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by win.8 on 5/6/2017.
 */

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void onClickBuku(View v){
        Intent i = new Intent(this,FacialWash.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickBuku2(View v){
        Intent i = new Intent(this,Toner.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickBuku3(View v){
        Intent i = new Intent(this,CC.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickBuku4(View v){
        Intent i = new Intent(this,ASG.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickBuku5(View v){
        Intent i = new Intent(this,AFTSS.class);
        startActivity(i); // Pindah Intent
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){ //Bila menekan tombol back maka akan kembali ke MainActivity.xml
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}

