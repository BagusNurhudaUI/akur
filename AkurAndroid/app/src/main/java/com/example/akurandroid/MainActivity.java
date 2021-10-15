package com.example.akurandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtPassword;
    private Button login;
    private ImageView logo;
    private TextView tvLogin;
    private TextView tvLoginDetail;
    private TextView tvEmail;
    private TextView tvPassword;
    private TextView tvForgotPassword;
    private CheckBox checkBox;
    private TextView tvRememberMe;
    private TextView tvNewOnPlatform;
    private TextView tvCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        tvLogin = findViewById(R.id.tv_login);
        tvLoginDetail = findViewById(R.id.tv_login_detail);
        tvEmail = findViewById(R.id.tv_email);
        edtEmail = findViewById(R.id.edt_email);
        tvPassword = findViewById(R.id.tv_password);
        tvForgotPassword = findViewById(R.id.tv_forgot_password);
        edtPassword = findViewById(R.id.edt_password);
        checkBox = findViewById(R.id.checkbox);
        login = findViewById(R.id.btn_login);
        tvNewOnPlatform = findViewById(R.id.tv_new_on_platform);
        tvCreateAccount = findViewById(R.id.tv_create_account);
    }
}