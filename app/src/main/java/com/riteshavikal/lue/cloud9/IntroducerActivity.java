package com.riteshavikal.lue.cloud9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroducerActivity extends AppCompatActivity implements View.OnClickListener {

    Button mconfirmbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducer);

        mconfirmbtn = (Button) findViewById(R.id.confirm_btn);
        mconfirmbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(IntroducerActivity.this,CommentAndSuggestion.class));

    }
}
