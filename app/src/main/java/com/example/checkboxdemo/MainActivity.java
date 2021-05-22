package com.example.checkboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_web_btn, cb_android_btn, cb_graphics_btn, cb_java_btn, cb_game_btn, cb_cpp_btn, cb_sales_force_btn;
    Button btnReset, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_web_btn = findViewById(R.id.checkbox_web_devt);
        cb_android_btn = findViewById(R.id.checkbox_android_devt);
        cb_graphics_btn = findViewById(R.id.checkbox_graphics_devt);
        cb_java_btn = findViewById(R.id.checkbox_java_devt);
        cb_game_btn = findViewById(R.id.checkbox_game_devt);
        cb_cpp_btn = findViewById(R.id.checkbox_cpp_devt);
        cb_sales_force_btn = findViewById(R.id.checkbox_sales_force);

        btnSubmit = findViewById(R.id.submit_button);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("My Expertise :");
                if (cb_web_btn.isChecked()) {
                    result.append("\n" + cb_web_btn.getText().toString());
                }
                if (cb_android_btn.isChecked()) {
                    result.append("\n" + cb_android_btn.getText().toString());
                }
                if (cb_graphics_btn.isChecked()) {
                    result.append("\n" + cb_graphics_btn.getText().toString());
                }
                if (cb_java_btn.isChecked()) {
                    result.append("\n" + cb_java_btn.getText().toString());
                }
                if (cb_game_btn.isChecked()) {
                    result.append("\n" + cb_game_btn.getText().toString());
                }
                if (cb_cpp_btn.isChecked()) {
                    result.append("\n" + cb_cpp_btn.getText().toString());
                }

                if (cb_sales_force_btn.isChecked()) {
                    result.append("\n" + cb_sales_force_btn.getText().toString());
                }

                if (!cb_web_btn.isChecked() && !cb_android_btn.isChecked() && !cb_graphics_btn.isChecked() && !cb_java_btn.isChecked()
                        && !cb_game_btn.isChecked() && !cb_cpp_btn.isChecked() && !cb_sales_force_btn.isChecked()) {
                    result.append("\n None");
                }
                Message.message(MainActivity.this, result.toString());
            }
        });

        btnReset = findViewById(R.id.reset_button);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_web_btn.isChecked()) {
                    cb_web_btn.setChecked(false);
                }
                if (cb_android_btn.isChecked()) {
                    cb_android_btn.setChecked(false);
                }
                if (cb_graphics_btn.isChecked()) {
                    cb_graphics_btn.setChecked(false);
                }
                if (cb_java_btn.isChecked()) {
                    cb_java_btn.setChecked(false);
                }
                if (cb_game_btn.isChecked()) {
                    cb_game_btn.setChecked(false);
                }
                if (cb_cpp_btn.isChecked()) {
                    cb_cpp_btn.setChecked(false);
                }
                if (cb_sales_force_btn.isChecked()) {
                    cb_sales_force_btn.setChecked(false);
                }
            }
        });
    }
}