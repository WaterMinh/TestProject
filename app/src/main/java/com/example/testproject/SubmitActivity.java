package com.example.testproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Locale;

public class SubmitActivity extends AppCompatActivity {
    private CheckBox checkBox;
    private Button btnSubmit;
    private TextView tvTen;
    private GridView gridView;
    private Integer[] data = new Integer[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit2);
        //get name lên textView
        tvTen = findViewById(R.id.txtTen);
        tvTen.setText(Util.ten);
        // xử lý checkbox
        checkBox = findViewById(R.id.checkDK);
        btnSubmit = findViewById(R.id.btnSubmit);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btnSubmit.setEnabled(true);
                } else {
                    btnSubmit.setEnabled(false);
                }
            }
        });

        //gridView
        gridView = findViewById(R.id.gridView);
        ItemAdapter adapter = new ItemAdapter(this , R.layout.item_layout , data);
        gridView.setAdapter(adapter);
    }

    public void actionSubmit(View view) {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}