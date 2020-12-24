package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final EditText a=findViewById(R.id.Q);
        final EditText b=findViewById(R.id.HW);
        final EditText c=findViewById(R.id.MidTerm);
        final EditText d=findViewById(R.id.F);
        final TextView e=findViewById(R.id.textView2);
        final TextView f=findViewById(R.id.textView3);
        Button butt=findViewById(R.id.button);
        Button butt1=findViewById(R.id.button1);



        final String[] coutv = {new String()};

        butt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String first = a.getText().toString();
                double x1 = Double.parseDouble(first);
                String secnd = b.getText().toString();
                double x2 = Double.parseDouble(secnd);
                String therd = c.getText().toString();
                double x3 = Double.parseDouble(therd);
                String forth = d.getText().toString();
                double x4 = Double.parseDouble(forth);

                double Result = x1 + x2 + x3 + x4;


                if (Result > 100) {

                    e.setText("Error this is not real gared");
                    e.setTextColor(Color.BLUE);
                } else if (Result < 101 && Result >= 90) {
                    e.setText("A");
                    f.setText("Good jop man ");
                    e.setTextColor(Color.GRAY);

                } else if (Result < 89 && Result >= 80) {
                    e.setText("B");

                    f.setText("Hero");
                    e.setTextColor(Color.GREEN);
                } else if (Result < 79 && Result >= 70) {
                    e.setText("C");

                    f.setText("Careful");
                    e.setTextColor(Color.CYAN);
                } else if (Result < 69 && Result >= 60) {
                    e.setText("D");
                    f.setText("You're going to hell.");
                    e.setTextColor(Color.LTGRAY);
                } else {
                    e.setText("F");
                    f.setText(" Playing the piano is better for you than studying.");

                    e.setTextColor(Color.MAGENTA);
                }

            }




        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             a.setText("0");
             b.setText("0");
             c.setText("0");
             d.setText("0");
             e.setText("Reset");
             e.setTextColor(Color.BLUE);
            }
        });

    }
}