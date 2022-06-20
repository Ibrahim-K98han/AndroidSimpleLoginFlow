package com.ibrahim.loginflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var emailInputET:EditText
    lateinit var passwordInputET:EditText
    lateinit var name:EditText
    lateinit var loginBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emailInputET = findViewById(R.id.emailInputET)
        passwordInputET = findViewById(R.id.passwordInputET)
        name = findViewById(R.id.nameInputET)
        loginBtn = findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {
            val name = name.text.toString()
            val email = emailInputET.text.toString()
            val password = passwordInputET.text.toString()
            if(email.isEmpty()){
                emailInputET.error = getString(R.string.empty_field_msg)
                return@setOnClickListener
            }
            if(password.isEmpty()){
                passwordInputET.error = getString(R.string.empty_field_msg)
            return@setOnClickListener
            }
            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                emailInputET.error = getString(R.string.invalid_email_format_msg)
                return@setOnClickListener
            }
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("email_value",email)
            intent.putExtra("name_value",name)
            startActivity(intent)
        }
    }
}