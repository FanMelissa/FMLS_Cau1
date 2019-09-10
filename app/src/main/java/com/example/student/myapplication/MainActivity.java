package com.example.student.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_DangNhap, tv_TaiKhoan, tv_MatKhau;
    EditText et_TaiKhoan, et_MatKhau;
    Button bt_DangNhap, bt_Thoat;
    CheckBox cb_Luu;
    AlertDialog.Builder dialog;
    AlertDialog.Builder dialog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_DangNhap = (TextView) findViewById(R.id.tv_DangNhap);
        tv_TaiKhoan = (TextView) findViewById(R.id.tv_TaiKhoan);
        tv_MatKhau = (TextView) findViewById(R.id.tv_MatKhau);
        et_TaiKhoan = (EditText) findViewById(R.id.et_TaiKhoan);
        et_MatKhau = (EditText) findViewById(R.id.et_MatKhau);
        bt_DangNhap = (Button) findViewById(R.id.bt_DangNhap);
        cb_Luu = (CheckBox) findViewById(R.id.cb_Luu);
        dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Thông báo");
        bt_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb_Luu.isChecked()){
                    dialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else
                {
                    dialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
                dialog.show();
            }
        });

        bt_Thoat=(Button)findViewById(R.id.bt_Thoat);
        dialog2=new AlertDialog.Builder(this);
        dialog2.setTitle("Thông báo");
        bt_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.setMessage("Bạn có thực sự muốn thoát?");
                dialog2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog2.show();
            }

        });
    }
}
