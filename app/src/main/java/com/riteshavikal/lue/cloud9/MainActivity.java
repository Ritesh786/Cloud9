package com.riteshavikal.lue.cloud9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button msignupbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msignupbtn = (Button) findViewById(R.id.signup_btn);
        msignupbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

         startActivity(new Intent(MainActivity.this,SignUpActivity.class));
    }
}
