package com.example.halloween_event;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button contentButton = new Button(this);
        contentButton.setText("Mystery Box");

        LinearLayout layoutTextBox = findViewById(R.id.layoutTextBox);
        layoutTextBox.addView (contentButton);


        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        params.width = (int) 500;
        contentButton.setLayoutParams(params);
        params.gravity = Gravity.CENTER;
        params.topMargin = 30;

        contentButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View view) {

                TextView contentTitle =findViewById (R.id.contentTitle);
                contentTitle.setText("TRY AGAIN!");
            }

        });



    }




}