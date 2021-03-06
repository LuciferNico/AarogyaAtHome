package com.techmArogya.aarogyaathome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        val register = findViewById(R.id.registerBtn) as Button
        register.setOnClickListener {
          val reqisterIntent = Intent(this, RegisterActivity::class.java)
            startActivity(reqisterIntent)
        }

        val loginHome = findViewById(R.id.loginBtn) as Button
        loginHome.setOnClickListener {
            val loginHomeIntent = Intent(this, HomeActivity::class.java)
            startActivity(loginHomeIntent)
        }
            /// add hwere mcode for shared preferences
    }
}
