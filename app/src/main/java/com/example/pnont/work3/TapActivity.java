package com.example.pnont.work3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TapActivity extends AppCompatActivity {
    TextView displayNumber;
    ImageView addNumber;
    private int targetNumber;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_2);

        targetNumber = getIntent().getIntExtra("sentNumber", 0);
        initInstance();
    }

    private void initInstance() {
        displayNumber = (TextView) findViewById(R.id.numberDisplay);
        addNumber = (ImageView) findViewById(R.id.addBtn);
        addNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                displayNumber.setText(String.valueOf(count));
                if (count >= targetNumber){
                    Intent intent = new Intent(TapActivity.this , MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}
