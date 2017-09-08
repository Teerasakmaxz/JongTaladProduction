package com.example.army2102.jongtalad;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initInstances();
        btnRegister.setOnClickListener(this);
    }

    private void initInstances() {
        btnRegister = (Button) findViewById(R.id.btnRegister);
    }

    @Override
    public void onClick(View view) {
        if(view == btnRegister){
            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
            builder.setTitle("ทำการสมัครเสร็จสิ้น !!")
                    .setMessage("ขอบคุณสำหรับการสมัครมากชิกทางทีมงานจะทำการติดต่อกลับไปภายใน 24 ชม.")
                    .setPositiveButton("ตกลง", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }
}
