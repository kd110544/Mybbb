package com.example.mybbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) { /*bundle是包裹*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView= (Button)findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ButtonActivity.class);

                startActivity(intent);
            }
        });
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);

            }


        });
    }
}