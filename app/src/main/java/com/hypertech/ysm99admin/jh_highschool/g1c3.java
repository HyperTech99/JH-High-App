package com.hypertech.ysm99admin.jh_highschool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.hypertech.ysm99admin.jh_highschool.R.id.g1c1back;

public class g1c3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1c3);

        Button g1c3back = (Button)findViewById(R.id.g1c3back);
        g1c3back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
