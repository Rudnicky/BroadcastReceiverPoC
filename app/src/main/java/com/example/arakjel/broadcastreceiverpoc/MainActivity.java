package com.example.arakjel.broadcastreceiverpoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button sendInformationButton;
    private Button exitApplicationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        listeners();
    }

    private void initialize() {
        sendInformationButton = (Button) findViewById(R.id.sendInformationButton);
        exitApplicationButton = (Button) findViewById(R.id.exitApplicationButton);
    }

    private void listeners() {
        sendInformationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.example.broadcastsample.SHOW_TOAST");
                sendBroadcast(intent);
            }
        });

        exitApplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
