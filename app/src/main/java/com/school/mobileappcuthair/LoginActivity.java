package com.school.mobileappcuthair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText edt_phone;
    EditText edt_MatKhau;
    Button btn_DangNhap;
    TextView btn_QuenMK;
    TextView btn_BoQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_phone = (EditText) findViewById(R.id.edt_phone);
        edt_MatKhau = (EditText) findViewById(R.id.edt_matkhau);
        btn_DangNhap = (Button) findViewById(R.id.btn_DangNhap);
        btn_QuenMK = (TextView) findViewById(R.id.btn_QuenMK);
        btn_BoQua = (TextView) findViewById(R.id.btn_BoQua);

        //Nút bỏ qua đăng nhập
        btn_BoQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //UI nút đăng nhập
        btn_DangNhap.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        btn_DangNhap.setTextColor(getResources().getColor(R.color.gray,getTheme()));
                        break;
                    case MotionEvent.ACTION_UP:
                        btn_DangNhap.setTextColor(getResources().getColor(R.color.primary, getTheme()));
                        break;
                }
                return false;
            }
        });

    }
}