package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MyBiodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_biodata);

        setupHyperLink();
    }

    private void setupHyperLink(){
        TextView LinkTextView = findViewById(R.id.link);
        LinkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}