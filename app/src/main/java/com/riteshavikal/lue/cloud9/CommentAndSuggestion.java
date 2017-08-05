package com.riteshavikal.lue.cloud9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommentAndSuggestion extends AppCompatActivity implements View.OnClickListener {

    Button msubmitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_and_suggestion);

        msubmitbtn = (Button) findViewById(R.id.submit_btn);
        msubmitbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(CommentAndSuggestion.this,TableReservationActivity.class));
    }
}
