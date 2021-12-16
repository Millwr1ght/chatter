package com.cs264.chatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_main);

        // TODO: add check here to auto sign in if the user already has an account.
    }


    public void signUp(View view) {
        Intent signUpIntent = new Intent(this, sign_up.class);
        startActivity(signUpIntent);
    }
}