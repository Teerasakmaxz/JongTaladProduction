package com.example.army2102.jongtalad;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRestorePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        initInstances();

        btnRestorePassword.setOnClickListener(this);
    }

    private void initInstances() {
        btnRestorePassword = (Button) findViewById(R.id.btnRestorePassword);
    }

    @Override
    public void onClick(View view) {
        if(view == btnRestorePassword){
            AlertDialog.Builder builder = new AlertDialog.Builder(ForgotPasswordActivity.this);
            builder.setTitle("กู้คืนรหัสผ่าน")
                    .setMessage("ระบบได้ทำการส่งรหัสผ่านไปที่ Email ของท่านเรียบร้อยแล้วโปรดเช็ค Email")
                    .setPositiveButton("ยืนยัน", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(ForgotPasswordActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();

        }
    }
}