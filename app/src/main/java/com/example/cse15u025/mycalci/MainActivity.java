package com.example.cse15u025.mycalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int flag = 0;
    TextView textView;
    Button buttondel, buttoneql;
    String operator;
    float numb1, numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textViewAns);
        textView.setText("");
        buttondel = (Button) findViewById(R.id.buttonDel);

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 0;
                textView.setText("");

            }
        });

        buttoneql = (Button) findViewById(R.id.buttonEql);
        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (operator) {
                    case "+":
                        textView.setText("" + (numb1 + numb2));
                        break;
                    case "-":
                        textView.setText("" + (numb1 - numb2));
                        break;
                    case "/":
                        textView.setText("" + (numb1 / numb2));
                        break;
                    case "*":
                        textView.setText("" + (numb1 * numb2));
                        break;
                }
            }
        });

    }


    public void registerKey(View view) {


        switch (view.getId()) {

            case R.id.button0:
                textView.setText(textView.getText().toString() + '0');
                break;
            case R.id.button1:
                textView.setText(textView.getText().toString() + '1');
                break;
            case R.id.button2:
                textView.setText(textView.getText().toString() + '2');
                break;
            case R.id.button3:
                textView.setText(textView.getText().toString() + '3');
                break;
            case R.id.button4:
                textView.setText(textView.getText().toString() + '4');
                break;
            case R.id.button5:
                textView.setText(textView.getText().toString() + '5');
                break;
            case R.id.button6:
                textView.setText(textView.getText().toString() + '6');
                break;
            case R.id.button7:
                textView.setText(textView.getText().toString() + '7');
                break;
            case R.id.button8:
                textView.setText(textView.getText().toString() + '8');
                break;
            case R.id.button9:
                textView.setText(textView.getText().toString() + '9');
                break;


            case R.id.buttonAdd:
                textView.setText(textView.getText().toString() + " + ");
                flag++;
                operator = "+";
                break;
            case R.id.buttonSub:
                textView.setText(textView.getText().toString() + " - ");
                flag++;
                operator = "-";
                break;
            case R.id.buttonDiv:
                textView.setText(textView.getText().toString() + " / ");
                flag++;
                operator = "/";
                break;
            case R.id.buttonMul:
                textView.setText(textView.getText().toString() + " * ");
                flag++;
                operator = "*";
                break;
        }


        if (flag == 1) {
            String text = textView.getText().toString();
            String[] s = text.split(" ");
            numb1 = Integer.parseInt(s[0]);
            //Toast.makeText(getApplicationContext(),textView.getText().toString(),Toast.LENGTH_LONG).show();
            flag++;
        } else if (flag == 2) {
            String text = textView.getText().toString();
            String[] s = text.split(" ");
            //Toast.makeText(getApplicationContext(),s[s.length-1],Toast.LENGTH_LONG).show();
            numb2 = Integer.parseInt(s[s.length - 1]);
        }
    }
}