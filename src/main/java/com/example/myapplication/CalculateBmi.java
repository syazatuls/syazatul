package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateBmi extends AppCompatActivity {


    EditText editweight, editheight;
    TextView result;
    Button calculatebmi;
    String calculation, BMIcategory, healthrisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_bmi);

        editweight = (EditText) findViewById(R.id.editweight);
        editheight = (EditText) findViewById(R.id.editheight);
        result = findViewById(R.id.result);
        calculatebmi = (Button) findViewById(R.id.calculatebmi);

        calculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editweight.length() == 0)
                {
                    editweight.setError("Enter Weight");
                }
                else if (editheight.length() == 0)
                {
                    editheight.setError("Enter Height");
                }
                else {
                    String S1 = editweight.getText().toString();
                    String S2 = editheight.getText().toString();

                    float weightValue = Float.parseFloat(S1);
                    float heightValue = Float.parseFloat(S2) / 100;

                    float bmi = weightValue / (heightValue * heightValue);

                    if (bmi < 18.4) {
                        BMIcategory = "Underweight";
                        healthrisk = "Malnutrition risk";
                    } else if (bmi >= 18.5 && bmi <= 24.9) {
                        BMIcategory = "Normal Weight";
                        healthrisk = "Low risk";
                    } else if (bmi >= 25 && bmi <= 29.9) {
                        BMIcategory = "Overweight";
                        healthrisk = "Enhanced risk";
                    } else if (bmi >= 30 && bmi <= 34.9) {
                        BMIcategory = "Moderately Obese";
                        healthrisk = "Medium risk";
                    } else if (bmi >= 35 && bmi <= 39.9) {
                        BMIcategory = "Severely Obese";
                        healthrisk = "High risk";
                    } else {
                        BMIcategory = "Very Severely Obese";
                        healthrisk = "Very High risk";
                    }

                    calculation = "Result : " + bmi
                            + "\n\nBMI Category : " + BMIcategory
                            + "\n\nHealth Risk  : " + healthrisk;

                    result.setText(calculation);
                }
            }
        });
    }
}