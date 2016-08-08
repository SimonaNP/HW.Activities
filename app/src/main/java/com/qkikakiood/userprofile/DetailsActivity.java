package com.qkikakiood.userprofile;


import android.content.Intent;
import android.renderscript.Byte2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity {

    static EditText editYears;
    static EditText editAddress;
    static EditText editCity;
    static EditText editBirthDate;
    static  Button btnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        editAddress = (EditText) findViewById(R.id.edit_address);
        editYears = (EditText) findViewById(R.id.edit_years);
        editCity = (EditText) findViewById(R.id.edit_city);
        editBirthDate = (EditText) findViewById(R.id.edit_bith);
        btnContinue = (Button) findViewById(R.id.btn_continue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailsActivity.this, SummaryActivity.class));
            }
        });
    }
}
