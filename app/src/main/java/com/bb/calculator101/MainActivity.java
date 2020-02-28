package com.bb.calculator101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView userInputTextView;

    private int valueA = 0;
    private int valueB = 0;

    private int operator = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, getString(R.string.five_number),Toast.LENGTH_SHORT).show();
        Toast.makeText(this, getString(R.string.greeting_text, "Dalo", 47),Toast.LENGTH_LONG).show();
        userInputTextView = findViewById(R.id.user_input_textview);
    }


    public void calcClick(View view) {
        switch (view.getId()) {

            case R.id.ac_button:
                valueA = 0;
                valueB = 0;
                userInputTextView.setText("0");
                break;
            case R.id.one_button:
                userInputTextView.setText("1");
                break;
            case R.id.two_button:
                userInputTextView.setText("2");
                break;
            case R.id.three_button:
                userInputTextView.setText("3");
                break;
            case R.id.four_button:
                userInputTextView.setText("4");
                break;
            case R.id.five_button:
                userInputTextView.setText("5");
                break;
            case R.id.six_button:
                userInputTextView.setText("6");
                break;
            case R.id.seven_button:
                userInputTextView.setText("7");
                break;
            case R.id.eight_button:
                userInputTextView.setText("8");
                break;
            case R.id.nine_button:
                userInputTextView.setText("9");
                break;
            case R.id.add_button:
                operator = 0;
                valueA = Integer.parseInt(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.subtract_button:
                operator = 1;
                valueA = Integer.parseInt(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.division_button:
                operator = 2;
                valueA = Integer.parseInt(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.multiply_button:
                operator = 3;
                valueA = Integer.parseInt(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                break;
            case R.id.modulus_button:
                operator = 4;
                valueA = Integer.parseInt(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
            case R.id.period_button:

                break;
            case R.id.neg_pos_button:

                break;
            case R.id.equals_button:
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
        }
    }

    public void operation() {
        int answer = 0;
        switch (operator) {
            case 0://addition
                answer = (valueA + valueB);
                break;
            case 1://subtraction
                answer = (valueA - valueB);
                break;
            case 2://division
                answer = (valueA / valueB);
                break;
            case 3://multiplication
                answer = (valueA * valueB);
                break;
            case 4://modulus
                answer = (valueA % valueB);
                break;
        }

        userInputTextView.setText("" + answer);
    }
}
