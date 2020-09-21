package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView enternumber;
    Button AC,Plu_Min,percentage,division,num7,num8,num9,multiply,num4,num5,num6,minus,num1,num2,num3,plus,num0,decimal,equals;

    String num_by_user;
    String result;
    String tmp,operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enternumber= findViewById(R.id.enternumber);

        num_by_user = enternumber.getText().toString();

        AC = findViewById(R.id.AC);
        Plu_Min = findViewById(R.id.Plu_Min);
        percentage = findViewById(R.id.percentage);
        division = findViewById(R.id.division);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        multiply = findViewById(R.id.multiply);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        minus = findViewById(R.id.minus);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        plus = findViewById(R.id.plus);
        num0 = findViewById(R.id.num0);
        decimal = findViewById(R.id.decimal);
        equals = findViewById(R.id.equals);


        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enternumber.setText("");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enternumber.setText(result+".");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onNumberButtonClick("0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberButtonClick("9");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOperatorButtonClick("/");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOperatorButtonClick("X");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOperatorButtonClick("+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOperatorButtonClick("-");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEqualButtonClick();
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOperatorButtonClick("%");
            }
        });

    }
    public void onNumberButtonClick(String pos) {
        result = enternumber.getText().toString();
        result = result + pos;
        enternumber.setText(result);
    }

    public void onOperatorButtonClick(String operator) {
        tmp = enternumber.getText().toString();
        enternumber.setText("");
        this.operator = operator;
    }

    public void onEqualButtonClick() {
        double res = 0;
        try {
            double number = Double.valueOf(tmp);
            double number2 = Double.valueOf(enternumber.getText().toString());
            switch (operator) {
                case "+":
                    res = number + number2;
                    break;
                case "/":
                    res = number / number2;
                    break;
                case "-":
                    res = number - number2;
                    break;
                case "X":
                    res = number * number2;
                    break;
                case "%":
                    res = (number/100.0f)*number2;
                    break;

            }
            result = String.valueOf(res);
            enternumber.setText(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}