package me.danieleorlando.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(INTENT_JOKE);

        setContentView(R.layout.activity_joke);

        TextView jokeTv = findViewById(R.id.jokeTv);
        jokeTv.setText(joke);
    }
}
