package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutActivity extends AppCompatActivity {

    TextView aboutText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutText = findViewById(R.id.textView);
        aboutText.setText(getAboutText());

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public String getAboutText() {
        return "This app was made for those who are interested in the animals that unfortunately went extinct. " +
                "Even if you're a beginner in this area and you're just curious about these beautiful animals, " +
                "if you're wondering when these animals used to roam the planet, or which family they belong to," +
                " this app was made for you!";
    }

}
