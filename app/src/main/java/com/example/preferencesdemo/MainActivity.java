package com.example.preferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getPreferences(Context.MODE_PRIVATE);
        nickname = sp.getString("nickname", "default");

        TextView resultTV = findViewById(R.id.resultTV);
        resultTV.setText("Nickname is:"+nickname);
    }
}
