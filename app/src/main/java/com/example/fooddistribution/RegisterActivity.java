package com.example.fooddistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RegisterActivity extends AppCompatActivity
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initFun();
    }
    private void initFun ()
    {
        LinearLayout cred = findViewById(R.id.credentials);
        LinearLayout det = findViewById(R.id.personalDetails);
        LinearLayout add = findViewById(R.id.address);

        cred.setVisibility(View.VISIBLE);
        det.setVisibility(View.INVISIBLE);
        add.setVisibility(View.INVISIBLE);

        ImageView proceed1 = findViewById(R.id.proceed1);
        proceed1.setOnClickListener(view -> {
            if(cred.isShown())
            {
                cred.setVisibility(View.INVISIBLE);
                det.setVisibility(View.VISIBLE);
            }

        });

        ImageView proceed2 = findViewById(R.id.proceed2);
        proceed2.setOnClickListener(view -> {
            if(det.isShown())
            {
                det.setVisibility(View.INVISIBLE);
                add.setVisibility(View.VISIBLE);
            }
        });


    }
}