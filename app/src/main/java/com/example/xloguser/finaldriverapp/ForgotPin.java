package com.example.xloguser.finaldriverapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPin extends AppCompatActivity {

    private Button sumbitCpNumber;
    private Button sumbitCodeBtn;
    private EditText enterCodeTxt;
    private EditText entercp;
    private ConstraintLayout cellphoneNumber;
    private ConstraintLayout enterCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pin);
        sumbitCpNumber = (Button)findViewById(R.id.submitBtn);
        sumbitCodeBtn = (Button)findViewById(R.id.submitCodeBtn);
        enterCodeTxt = (EditText)findViewById(R.id.enterCodeEditTxt);
        entercp = (EditText)findViewById(R.id.phoneNumberEditTxt);
        cellphoneNumber = (ConstraintLayout)findViewById(R.id.enterNumber);
        enterCode = (ConstraintLayout)findViewById(R.id.enterCode);

        sumbitCpNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entercp.length() < 10) {
                    Toast.makeText(ForgotPin.this, "Please enter valid phone number",
                            Toast.LENGTH_LONG).show();
                    Log.e("sad", "msg" + entercp.length());

                } else {
                    cellphoneNumber.setVisibility(View.INVISIBLE);
                    enterCode.setVisibility(View.VISIBLE);
                }
            }
        });


        sumbitCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enterCodeTxt.length() > 6){
                    Toast.makeText(ForgotPin.this, "Please enter the code given",
                            Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(ForgotPin.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


    }
}
