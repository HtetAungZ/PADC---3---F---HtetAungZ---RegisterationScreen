package com.padcmyanmar.helloandroidpadc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class HelloAndroidActivity extends AppCompatActivity {


    private static final String CORRECT_EMAIL = "abc@gmail.com";
    private static final String CORRECT_PASSWORD = "Abcdefg";//Constant Attribute


    private Button btnlogin;
    private EditText etemailorphone, etpassword;
    private TextView btnforgotpassoword, btnnewuserregister;



    public static Intent newIntent(Context context)
    {
        Intent hello= new Intent(context,HelloAndroidActivity.class);
        return hello;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_android);


        btnlogin = findViewById(R.id.btn_login);
        etemailorphone = findViewById(R.id.et_email_or_phone);
        etpassword = findViewById(R.id.et_password);
        btnforgotpassoword = findViewById(R.id.btn_forget_password);
        btnnewuserregister = findViewById(R.id.btn_new_user_register);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailorphone = etemailorphone.getText().toString();
                String password = etpassword.getText().toString();

                if (TextUtils.isEmpty(emailorphone)) {
                    etemailorphone.setError("Email or Phone cannot be empty");
                    return;//stop execute if condition fail
                }


                if (TextUtils.isEmpty(password)) {
                    etpassword.setError("Password cannot be empty");
                    return;
                }


                if (TextUtils.equals(emailorphone, CORRECT_EMAIL) && TextUtils.equals(password, CORRECT_PASSWORD)) {
                    //   Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();

                    Intent intent = LoginActivity.newIntent(getApplicationContext());
                    startActivity(intent);
                } else {
                    Snackbar.make(v, "Incorrect email or password. Please try again", Snackbar.LENGTH_INDEFINITE).show();
                }// Log.d("Login","Login Button Click");
                // Snackbar.make(v,"Login Button Click",Snackbar.LENGTH_LONG).show();

            }


        });

        btnforgotpassoword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   Snackbar.make(v, "\"Forgot Password\" is coming soon", Snackbar.LENGTH_INDEFINITE).show();


            }
        });


        btnnewuserregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Snackbar.make(v, "Registration Screen is coming soon", Snackbar.LENGTH_INDEFINITE).show();


                Intent register=RegisterActivity.newIntent(getApplicationContext());
                startActivity(register);

            }
        });


    }
}
