package com.example.pony.settingdetaildemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_btn = (Button) findViewById(R.id.btn_btn);
        btn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SettingDetailUtils.showInstalledAppDetails(MainActivity.this,"com.xiaoziqianbao.xzqb");
            }
        });
    }
}
