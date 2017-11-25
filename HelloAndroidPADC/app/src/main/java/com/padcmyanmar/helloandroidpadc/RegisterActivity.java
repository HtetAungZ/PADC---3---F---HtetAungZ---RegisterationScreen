package com.padcmyanmar.helloandroidpadc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ICE on 14-11-2017.
 */

public class RegisterActivity extends AppCompatActivity {

    private EditText etname,etphone,etpassword,etconfirmpassword,etemail,etaddress;
    private RadioGroup rdggender;
    private RadioButton rbmale,rbfemale;
    private Button btnregister;
    private TextView btnalreadyhaveaccount;
    private CheckBox checkaddress;






    public static Intent newIntent(Context context)//app mhar shi tae component ko hlan you lo ya
    {

        Intent register= new Intent(context,RegisterActivity.class);//(start pararmeter, passing activity type)
        return register;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);



        etname = findViewById(R.id.et_name);
        etphone= findViewById(R.id.et_phone);
        etemail=findViewById(R.id.et_email);
        etpassword=findViewById(R.id.et_password);
        etconfirmpassword=findViewById(R.id.et_confirm_password);
        etaddress=findViewById(R.id.et_address);
        rbmale=findViewById(R.id.rb_male);
        rbfemale=findViewById(R.id.rb_female);
        btnalreadyhaveaccount=findViewById(R.id.btn_already_have_account);
        btnregister=findViewById(R.id.btn_register);





        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name= etname.getText().toString();
                String phone=etphone.getText().toString();
                String email=etemail.getText().toString();
                String password=etpassword.getText().toString();
                String confirmpassword=etconfirmpassword.getText().toString();
                String address=etaddress.getText().toString();

                if(TextUtils.isEmpty(name))
                {
                    etname.setError("Enter your name");
                    return;
                }


                if(TextUtils.isEmpty(phone))
                {
                    etphone.setError("Enter your phone number");
                    return;
                }

                if(TextUtils.isEmpty(email))
                {
                    etemail.setError("Enter your email");
                    return;
                }

                if(TextUtils.isEmpty(password))
                {
                    etpassword.setError("Enter your password");
                    return;
                }

                if(TextUtils.isEmpty(confirmpassword))
                {
                    etconfirmpassword.setError("Enter your confirm password");
                    return;
                }

                if(TextUtils.isEmpty(address))
                {
                    etaddress.setError("Enter your address");
                    return;
                }


                if(!password.equals(confirmpassword))
                {
                    Snackbar.make(v,"Your password do not match",Snackbar.LENGTH_INDEFINITE).show();
                    return;
                }


                if(!rbmale.isChecked() && !rbfemale.isChecked()) {
                    Snackbar.make(v, "Select your gender", Snackbar.LENGTH_INDEFINITE).show();
                    return;
                }



                else
                {
                    Intent hello= HelloAndroidActivity.newIntent(getApplicationContext());
                    startActivity(hello);
                    Toast.makeText(getApplicationContext(),"Register Success",Toast.LENGTH_LONG).show();
                }






            }
        });













    btnalreadyhaveaccount.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent register=HelloAndroidActivity.newIntent(getApplicationContext());
            startActivity(register);


        }
    });








    }




}
