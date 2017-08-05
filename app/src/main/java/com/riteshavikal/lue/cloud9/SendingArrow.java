package com.riteshavikal.lue.cloud9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SendingArrow extends AppCompatActivity implements View.OnClickListener {

    Button mbloginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_arrow);

        mbloginbtn = (Button) findViewById(R.id.backlogin_btn);
        mbloginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(SendingArrow.this,IntroducerActivity.class));

    }
}
