package xyz.nestor.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_addition;
    private Button btn_substraction;
    private Button btn_multiplication;
    private Button btn_division;

    private TextView text_result;
    private EditText edit_number1;
    private EditText edit_number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_result= findViewById(R.id.result);
        edit_number1= findViewById(R.id.number1);
        edit_number2= findViewById(R.id.number2);


        btn_addition = findViewById(R.id.button_addition);
        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText( addition(Integer.parseInt(edit_number1.getText().toString()),Integer.parseInt(edit_number2.getText().toString()) )+"");
            }
        });


        btn_substraction= findViewById(R.id.button_substraction);
        btn_substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText( substraction(Integer.parseInt(edit_number1.getText().toString()),Integer.parseInt(edit_number2.getText().toString()) )+"");
            }
        });

        btn_multiplication= findViewById(R.id.button_multiplication);
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText( multiplication(Integer.parseInt(edit_number1.getText().toString()),Integer.parseInt(edit_number2.getText().toString()) )+"");
            }
        });

        btn_division= findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText( division( Integer.parseInt(edit_number1.getText().toString()),Integer.parseInt(edit_number2.getText().toString()) )+"");
            }
        });

    }

    public double addition (int a, int b){
        return a+b;
    }
    public double substraction (int a, int b){
        return a-b;
    }
    public double multiplication (int a, int b){
        return a*b;
    }
    public double division (double a, double b){
        return a/b;
    }


}