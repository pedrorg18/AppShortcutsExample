package com.example.proiggimenez.appshortcutsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String ACTION_OPEN_FIRST_SCREEN = "com.example.proiggimenez.appshortcutsexample.OPEN_FIRST_SCREEN";
    private static final String ACTION_OPEN_SECOND_SCREEN = "com.example.proiggimenez.appshortcutsexample.OPEN_SECOND_SCREEN";

    Button buttonGoScreen1;
    Button buttonGoScreen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGoScreen1 = findViewById(R.id.buttonGoScreen1);
        buttonGoScreen2 = findViewById(R.id.buttonGoScreen2);

        buttonGoScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToScreen1();
            }
        });

        buttonGoScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToScreen2();
            }
        });

        Log.i("ShortcutsExample", "got intent - action: "+getIntent().getAction());
        if (ACTION_OPEN_FIRST_SCREEN.equals(getIntent().getAction())) {
            goToScreen1();
        } else if (ACTION_OPEN_SECOND_SCREEN.equals(getIntent().getAction())) {
            goToScreen2();
        }
    }

    private void goToScreen1() {
        startActivity(new Intent(this, FirstScreenActivity.class));
    }

    private void goToScreen2() {
        startActivity(new Intent(this, SecondScreenActivity.class));
    }
}
