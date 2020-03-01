package com.bb.calculator101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math.*;

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
        Toast.makeText(this, getString(R.string.greeting_text, "JP's"),Toast.LENGTH_LONG).show();
        userInputTextView = findViewById(R.id.user_input_textview);
    }

    public String updateDisplayValue (String currentValue, String concatValue) {
        if (!currentValue.equals("0"))
            return currentValue + concatValue;
        else
            return concatValue;
    }

    public void calcClick(View view) {

        String tempValue = "";

        switch (view.getId()) {
            case R.id.ac_button:
                valueA = 0;
                valueB = 0;
                userInputTextView.setText("0");
                break;
            case R.id.zero_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "0"));
                break;
            case R.id.one_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "1"));
                break;
            case R.id.two_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "2"));
                break;
            case R.id.three_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "3"));
                break;
            case R.id.four_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "4"));
                break;
            case R.id.five_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "5"));
                break;
            case R.id.six_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "6"));
                break;
            case R.id.seven_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "7"));
                break;
            case R.id.eight_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "8"));
                break;
            case R.id.nine_button:
                tempValue = userInputTextView.getText().toString().trim();
                userInputTextView.setText(updateDisplayValue(tempValue, "9"));
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
                break;
            case R.id.period_button:
                // TODO: future implementation
                Toast.makeText(this, getString(R.string.coming_soon_text),Toast.LENGTH_LONG).show();
                break;
            case R.id.neg_pos_button:
                // TODO: future implementation
                Toast.makeText(this, getString(R.string.coming_soon_text),Toast.LENGTH_LONG).show();
                break;
            case R.id.equals_button:
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.x_squared_button:
                operator = 5;
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.x_cubed_button:
                operator = 6;
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.sin_button:
                operator = 7;
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.cos_button:
                operator = 8;
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.tan_button:
                operator = 9;
                valueB = Integer.parseInt(userInputTextView.getText().toString().trim());
                operation();
                break;
        }
    }

    public void operation() {
        int answer = 0;
        double answerD = 0.0, rad = 0.0;

        switch (operator) {
            case 0: //addition
                answer = (valueA + valueB);
                break;
            case 1: //subtraction
                answer = (valueA - valueB);
                break;
            case 2: //division
                answer = (valueA / valueB);
                break;
            case 3: //multiplication
                answer = (valueA * valueB);
                break;
            case 4: //modulus
                answer = (valueA % valueB);
                break;
            case 5: //x^2
                answer = (valueB * valueB);
                break;
            case 6: //x^3
                answer = (valueB * valueB * valueB);
                break;
            case 7: //sin
                rad = Math.toRadians(valueB);
                answerD = (Math.sin(rad));
                break;
            case 8: //cos
                rad = Math.toRadians(valueB);
                answerD = (Math.cos(rad));
                break;
            case 9: //tan
                rad = Math.toRadians(valueB);
                answerD = (Math.tan(rad));
                break;
        }

        if ((operator >= 7) && (operator <= 9))
            userInputTextView.setText("" + answerD);
        else
            userInputTextView.setText("" + answer);
    }
}
