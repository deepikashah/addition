package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;
    private TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =findViewById(R.id.etNum1);
        num2 =findViewById(R.id.etNum2);
        add =findViewById(R.id.btnAdd);
        result =findViewById(R.id.tvAnswer);
        result2 =findViewById(R.id.tvAnswer2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Integer.parseInt(num1.getText().toString());
                double number2 = Integer.parseInt(num2.getText().toString());
                double sum = (number1/100)*number2;
                double ans = number2-sum;
                result.setText("Discount Amount: " + String.valueOf(sum));
                result2.setText("Total Amount: " +String.valueOf(ans));
            }
        });
    }


}