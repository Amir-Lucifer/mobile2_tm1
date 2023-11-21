package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.saadahmedsoft.popupdialog.PopupDialog;
import com.saadahmedsoft.popupdialog.Styles;
import com.saadahmedsoft.popupdialog.listener.OnDialogButtonClickListener;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);
        Button btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            private Object Styles;

            @Override
            public void onClick(View v) {
            if (username.getText().toString().equals("amir")&& password.getText().toString().equals("1234")) {

                PopupDialog.getInstance(LoginActivity.this)
                        .setStyle(com.saadahmedsoft.popupdialog.Styles.SUCCESS)
                        .setHeading("Well Done")
                        .setDescription("Welcome Amir!")
                        .setCancelable(false)
                        .showDialog(new OnDialogButtonClickListener() {
                            @Override
                            public void onDismissClicked(Dialog dialog) {
                                super.onDismissClicked(dialog);
                            }
                        });



            } else if (username.getText().toString().equals("classmate")&& password.getText().toString().equals("1100")) {


                PopupDialog.getInstance(LoginActivity.this)
                        .setStyle(com.saadahmedsoft.popupdialog.Styles.SUCCESS)
                        .setHeading("Well Done")
                        .setDescription("Welcome Classmate!!")
                        .setCancelable(false)
                        .showDialog(new OnDialogButtonClickListener() {
                            @Override
                            public void onDismissClicked(Dialog dialog) {
                                super.onDismissClicked(dialog);
                            }
                        });


                } else if (username.getText().toString().equals("admin")&& password.getText().toString().equals("0000")) {
                PopupDialog.getInstance(LoginActivity.this)
                        .setStyle(com.saadahmedsoft.popupdialog.Styles.SUCCESS)
                        .setHeading("Well Done")
                        .setDescription("Welcome Admin!!!")
                        .setCancelable(false)
                        .showDialog(new OnDialogButtonClickListener() {
                            @Override
                            public void onDismissClicked(Dialog dialog) {
                                super.onDismissClicked(dialog);
                            }
                        });
            }else
            {
                PopupDialog.getInstance(LoginActivity.this)
                        .setStyle(com.saadahmedsoft.popupdialog.Styles.FAILED)
                        .setHeading("Error")
                        .setDescription("UserName OR PassWord IsNot Correct")
                        .setCancelable(false)
                        .showDialog(new OnDialogButtonClickListener() {
                            @Override
                            public void onDismissClicked(Dialog dialog) {
                                super.onDismissClicked(dialog);
                            }
                        });
            }
            }
        });
    }
}