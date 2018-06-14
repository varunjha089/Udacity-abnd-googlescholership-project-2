package com.example.bharat.practiceset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*score for team a and team b*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToBasketBall(View view) {
        Intent intent = new Intent(this, BasketBall.class);
        startActivity(intent);
    }
    public void goToCricket(View view) {
        Intent intent = new Intent(this, Cricket.class);
        startActivity(intent);
    }

}
