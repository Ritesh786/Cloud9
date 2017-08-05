package com.riteshavikal.lue.cloud9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button msigninbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        msigninbtn = (Button) findViewById(R.id.signin_btn);
        msigninbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(SignUpActivity.this,SendingArrow.class));

    }
}
