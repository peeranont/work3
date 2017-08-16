package com.example.pnont.work3;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView playBtn;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }

    private void initInstance() {
        input = (EditText) findViewById(R.id.inputText);
        playBtn = (ImageView) findViewById(R.id.playBtn);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = 0;
                if (String.valueOf(input.getText()).equals("")) {

                    Toast.makeText(MainActivity.this, "Please input some number.", Toast.LENGTH_SHORT).show();

                } else {

                    number = Integer.parseInt(String.valueOf(input.getText()));
                    Intent intent = new Intent(MainActivity.this, TapActivity.class);
                    intent.putExtra("sentNumber", number);
                    startActivity(intent);

                }

//                Log.d("current number", String.valueOf(number));
            }
        });
    }


}
