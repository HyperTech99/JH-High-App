package com.hypertech.ysm99admin.jh_highschool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.hypertech.ysm99admin.jh_highschool.R.id.g2c4back;

public class g2c10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g2c10);

        Button g2c10back = (Button)findViewById(R.id.g2c10back);
        g2c10back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
