package com.coderkovid.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity{
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView factTextView;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = (TextView) findViewById(R.id.textView4);

        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

        final Button factButton = (Button) findViewById(R.id.button);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                factTextView.setText(factBook.getFact());
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                factButton.setTextColor(color);

            }
        };
        factButton.setOnClickListener(listener);
    }
}
