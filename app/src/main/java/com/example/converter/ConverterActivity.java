package com.example.converter;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConverterActivity extends AppCompatActivity {
    final double MILECONSTANT = 1.6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convertButton;
       // Button exitButton;
        final EditText originalUnitField;
        final TextView convertedUnitField;

        convertButton = findViewById(R.id.convert);
        //exitButton = findViewById(R.id.exit);
        originalUnitField = findViewById(R.id.originalUnit);
        convertedUnitField = findViewById(R.id.convertedUnit);

        convertButton.setOnClickListener(v -> {
            double convert = Double.parseDouble(originalUnitField.getText().toString());
            convertedUnitField.setText(String.valueOf(convert * MILECONSTANT));               //Just put the formula here accordingly!!!
            convertedUnitField.setTextColor(Color.BLUE);
        });
//        exitButton.setOnClickListener(view -> {
//            finish();
//            System.exit(0);
//        });
    }
}