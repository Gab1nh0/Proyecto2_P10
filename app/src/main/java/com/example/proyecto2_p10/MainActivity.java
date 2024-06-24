package com.example.proyecto2_p10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1, cb2;

    private TextView tv1;

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float precio = 3.99f, soda = 0.00f, agrandado = 0.00f, total;

                if (cb1.isChecked()) {
                    soda = 1.50f;
                }
                if (cb2.isChecked()) {
                    agrandado = 1.00f;
                }

                total = precio + soda + agrandado;
                tv1.setText("Total: " + total);
            }

        });




    }
}