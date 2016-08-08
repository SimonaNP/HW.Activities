package com.qkikakiood.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        txtInfo = (TextView) findViewById(R.id.txt_info);
        txtInfo.setText(String.valueOf(MainActivity.editName.getText().toString() + ", "
                + DetailsActivity.editYears.getText().toString() + "\n"
                + DetailsActivity.editAddress.getText().toString()
                + ", \nCity " + DetailsActivity.editCity.getText().toString()));

    }
}