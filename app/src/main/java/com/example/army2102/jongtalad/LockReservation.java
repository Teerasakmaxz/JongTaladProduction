package com.example.army2102.jongtalad;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.locks.Lock;

public class LockReservation extends AppCompatActivity implements View.OnClickListener {

    private Button btnReserve;
    private EditText etName;
    private EditText etSurname;
    private Spinner spProductType;
    private Spinner spLock;


    private TextView tvA1;
    private TextView tvA2;
    private TextView tvA3;
    private TextView tvB1;
    private TextView tvB2;
    private TextView tvB3;
    private TextView tvC1;
    private TextView tvC2;
    private TextView tvC3;
    private TextView tvC4;
    private TextView tvC5;
    private TextView tvD1;
    private TextView tvD2;
    private TextView tvD3;
    private TextView tvD4;
    private TextView tvD5;
    private TextView tvD6;
    private TextView tvD7;
    private TextView tvD8;
    private TextView tvD9;


    private String[] productTypeList = {
            "อาหาร",
            "เสื้อผ้า",
            "อุปกรณ์อิเล็กทรอนิกส์",
    };

    private String[] lockList = {
            "A1",
            "A2",
            "A3",
            "B1",
            "B2",
            "B3",
            "C1",
            "C2",
            "C3",
            "C4",
            "C5",
            "D1",
            "D2",
            "D3",
            "D4",
            "D5",
            "D6",
            "D7",
            "D8",
            "D9",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_reservation);

        initInstances();
        tvA1.setOnClickListener(this);
        tvA2.setOnClickListener(this);
        tvA3.setOnClickListener(this);
        tvB1.setOnClickListener(this);
        tvB2.setOnClickListener(this);
        tvB3.setOnClickListener(this);
        tvC1.setOnClickListener(this);
        tvC2.setOnClickListener(this);
        tvC3.setOnClickListener(this);
        tvC4.setOnClickListener(this);
        tvC5.setOnClickListener(this);
        tvD1.setOnClickListener(this);
        tvD2.setOnClickListener(this);
        tvD3.setOnClickListener(this);
        tvD4.setOnClickListener(this);
        tvD5.setOnClickListener(this);
        tvD6.setOnClickListener(this);
        tvD7.setOnClickListener(this);
        tvD8.setOnClickListener(this);
        tvD9.setOnClickListener(this);
        btnReserve.setOnClickListener(this);

    }

    private void initInstances() {
        etName = (EditText) findViewById(R.id.etName);
        etSurname = (EditText) findViewById(R.id.etSurname);
        btnReserve = (Button) findViewById(R.id.btnReserve);
        spProductType = (Spinner) findViewById(R.id.spProductType);
        spLock = (Spinner) findViewById(R.id.spLock);
        tvA1 = (TextView) findViewById(R.id.tvA1);
        tvA2 = (TextView) findViewById(R.id.tvA2);
        tvA3 = (TextView) findViewById(R.id.tvA3);
        tvB1 = (TextView) findViewById(R.id.tvB1);
        tvB2 = (TextView) findViewById(R.id.tvB2);
        tvB3 = (TextView) findViewById(R.id.tvB3);
        tvC1 = (TextView) findViewById(R.id.tvC1);
        tvC2 = (TextView) findViewById(R.id.tvC2);
        tvC3 = (TextView) findViewById(R.id.tvC3);
        tvC4 = (TextView) findViewById(R.id.tvC4);
        tvC5 = (TextView) findViewById(R.id.tvC5);
        tvD1 = (TextView) findViewById(R.id.tvD1);
        tvD2 = (TextView) findViewById(R.id.tvD2);
        tvD3 = (TextView) findViewById(R.id.tvD3);
        tvD4 = (TextView) findViewById(R.id.tvD4);
        tvD5 = (TextView) findViewById(R.id.tvD5);
        tvD6 = (TextView) findViewById(R.id.tvD6);
        tvD7 = (TextView) findViewById(R.id.tvD7);
        tvD8 = (TextView) findViewById(R.id.tvD8);
        tvD9 = (TextView) findViewById(R.id.tvD9);

        ArrayAdapter<String> productTypeAdapter = new ArrayAdapter<>(LockReservation.this, R.layout.support_simple_spinner_dropdown_item, productTypeList);
        ArrayAdapter<String> lockAdapter = new ArrayAdapter<>(LockReservation.this, R.layout.support_simple_spinner_dropdown_item, lockList);

        spProductType.setAdapter(productTypeAdapter);
        spLock.setAdapter(lockAdapter);
    }

    @Override
    public void onClick(View view) {
        if (view == btnReserve) {
            if (valuesChecking())
                setLockStatus(R.color.lockStatusOuccupied);
        } else if (view == tvA1) {
            showLockStatus();
        } else if (view == tvA2) {
            showLockStatus();
        } else if (view == tvA3) {
            showLockStatus();
        } else if (view == tvB1) {
            showLockStatus();
        } else if (view == tvB2) {
            showLockStatus();
        } else if (view == tvB3) {
            showLockStatus();
        } else if (view == tvC1) {
            showLockStatus();
        } else if (view == tvC2) {
            showLockStatus();
        } else if (view == tvC3) {
            showLockStatus();
        } else if (view == tvC4) {
            showLockStatus();
        } else if (view == tvC5) {
            showLockStatus();
        } else if (view == tvD1) {
            showLockStatus();
        } else if (view == tvD2) {
            showLockStatus();
        } else if (view == tvD3) {
            showLockStatus();
        } else if (view == tvD4) {
            showLockStatus();
        } else if (view == tvD5) {
            showLockStatus();
        } else if (view == tvD6) {
            showLockStatus();
        } else if (view == tvD7) {
            showLockStatus();
        } else if (view == tvD8) {
            showLockStatus();
        } else if (view == tvD9) {
            showLockStatus();
        }
    }

    private void setLockStatus(Integer colorID) {
        switch (spLock.getSelectedItem().toString()) {
            case "A1":
                tvA1.setBackgroundResource(colorID);
                break;
            case "A2":
                tvA2.setBackgroundResource(colorID);
                break;
            case "A3":
                tvA3.setBackgroundResource(colorID);
                break;
            case "B1":
                tvB1.setBackgroundResource(colorID);
                break;
            case "B2":
                tvB2.setBackgroundResource(colorID);
                break;
            case "B3":
                tvB3.setBackgroundResource(colorID);
                break;
            case "C1":
                tvC1.setBackgroundResource(colorID);
                break;
            case "C2":
                tvC2.setBackgroundResource(colorID);
                break;
            case "C3":
                tvC3.setBackgroundResource(colorID);
                break;
            case "C4":
                tvC4.setBackgroundResource(colorID);
                break;
            case "C5":
                tvC5.setBackgroundResource(colorID);
                break;
            case "D1":
                tvD1.setBackgroundResource(colorID);
                break;
            case "D2":
                tvD2.setBackgroundResource(colorID);
                break;
            case "D3":
                tvD3.setBackgroundResource(colorID);
                break;
            case "D4":
                tvD4.setBackgroundResource(colorID);
                break;
            case "D5":
                tvD5.setBackgroundResource(colorID);
                break;
            case "D6":
                tvD6.setBackgroundResource(colorID);
                break;
            case "D7":
                tvD7.setBackgroundResource(colorID);
                break;
            case "D8":
                tvD8.setBackgroundResource(colorID);
                break;
            case "D9":
                tvD9.setBackgroundResource(colorID);
                break;
            default:
                Toast.makeText(LockReservation.this, "Please select lock", Toast.LENGTH_LONG).show();
        }
    }

    private boolean valuesChecking() {
        if (etName.getText().length() == 0 || etSurname.getText().length() == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LockReservation.this);
            builder.setMessage("โปรดกรอกข้อมูลให้ครบทุกช่อง");
            Dialog dialog = builder.create();
            dialog.show();
            return false;
        } else {
            Toast.makeText(LockReservation.this, "จองล็อคสำเร็จ", Toast.LENGTH_LONG).show();
            return true;
        }
    }

    private void showLockStatus() {
        AlertDialog.Builder builder = new AlertDialog.Builder(LockReservation.this);
        builder.setTitle("รายละเอียดล็อค")
                .setMessage(spLock.getSelectedItem() + "\n" +
                        etName.getText() + " " +
                        etSurname.getText() + "\n" +
                        spProductType.getSelectedItem() + "\n")
                .setPositiveButton("ยกเลิกการจอง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        setLockStatus(R.color.lockStatausNotOuccupied);
                    }
                })
                .setNegativeButton("ปิดหน้าจอ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}