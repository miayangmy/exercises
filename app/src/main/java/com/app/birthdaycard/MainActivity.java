package com.app.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.app.birthdaycard.R.id.button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = (EditText) findViewById(R.id.editText1);
        String str = input.getText().toString();

        TextView output = (TextView) findViewById(R.id.textView3);

        Button btn = (Button) findViewById(button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("click","onClick");

        EditText input = (EditText) findViewById(R.id.editText1);
        String str = input.getText().toString();
        double s = Double.valueOf(str);

        TextView output = (TextView) findViewById(R.id.textView3);

        double r = 0;
        r = 1.8*s + 32;
        String result = Double.toString(r);

        output.setText(result);
    }

}
