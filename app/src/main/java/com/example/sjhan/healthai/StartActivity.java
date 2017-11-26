package com.example.sjhan.healthai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btnCameraStart = (Button)findViewById(R.id.btnCameraStart);

        btnCameraStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(StartActivity.this, CameraActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
