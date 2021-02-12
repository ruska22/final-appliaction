package com.example.finalapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest

class Log_In : AppCompatActivity() {
    private lateinit var Back: Button
    private lateinit var Logpassword:EditText
    private lateinit var LogEmail: EditText
    private lateinit var LogButton: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log__in)
        Back = findViewById(R.id.Back)
        Back.setOnClickListener {
                finish()
        }
        Logpassword = findViewById(R.id.Logpassword)
        LogEmail = findViewById(R.id.LogEmail)
        LogButton = findViewById(R.id.AuthorizationButton)

        LogButton.setOnClickListener {
            val email: String = LogEmail.text.toString()
            val password: String = Logpassword.text.toString()

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "შეავსეთ ყველა ველი", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "თქვენ სისტემაში შეხვედით", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()

            }








        }







    }
}