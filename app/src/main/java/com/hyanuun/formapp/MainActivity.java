package com.hyanuun.formapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final public static String EXTRA_NAME = "extra_name";
    final public static String EXTRA_EMAIL = "extra_email";
    final public static String EXTRA_PHONE = "extra_phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editName = (EditText) findViewById(R.id.editTextNama);
        EditText editEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editPhone = (EditText) findViewById(R.id.editTextPhone);
        EditText editPassword = (EditText) findViewById(R.id.editTextPassword);

        Button btnSave = (Button) findViewById(R.id.idButtonSave);
//        saat tombol save diklik
        btnSave.setOnClickListener(v -> {
//                kode untuk aksi dari klik button
//            menggunakan intent
            Intent loginIntent = new Intent(MainActivity.this, DashboardActivity.class);
            loginIntent.putExtra(EXTRA_NAME, editName.getText().toString());
            loginIntent.putExtra(EXTRA_EMAIL, editEmail.getText().toString());
            loginIntent.putExtra(EXTRA_PHONE, editPhone.getText().toString());

            startActivity(loginIntent);
        });
    }
}