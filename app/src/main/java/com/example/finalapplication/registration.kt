package com.example.finalapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class registration : AppCompatActivity() {
    private lateinit var LoginButton: Button
    private lateinit var RegButton: Button
    private lateinit var Regpassword: EditText
    private lateinit var RegEmail: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_registration`)
        LoginButton = findViewById(R.id.LoginButton)
        LoginButton.setOnClickListener {
            val intent = Intent(this, Log_In::class.java)
            startActivity(intent)
        }

        RegButton = findViewById(R.id.RegButton)
        Regpassword = findViewById(R.id.Regpassword)
        RegEmail = findViewById(R.id.RegEmail)
        auth = FirebaseAuth.getInstance()

        RegButton.setOnClickListener {
            val email: String = RegEmail.text.toString()
            val password: String = Regpassword.text.toString()

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "შეავსეთ ყველა ველი", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "თქვენ სისტემაში შეხვედით", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity ::class.java)
                startActivity(intent)
                finish()

            }
            //   auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(
            //         this,
            //         OnCompleteListener { task ->
            //           if (task.isSuccessful) {
            //                val user = auth.currentUser
            //               val profileUpdates = UserProfileChangeRequest.Builder()
            //                     .setDisplayName(email).build()
            //             user?.updateProfile(profileUpdates)
            //                     ?.addOnCompleteListener(OnCompleteListener<Void?> { userUpdated ->
            //                        if (userUpdated.isSuccessful) {

            //                             Toast.makeText(this, "თქვენ სისტემაში შეხვედით", Toast.LENGTH_LONG)
            //                                    .show()
            //                            val intent = Intent(this, MainActivity.kt::class.java)
            //                             startActivity(intent)
            //                              finish()
            //                         }

            //                     })


            //        } else {
            //            Toast.makeText(this, "ვერ დარეგისტრირდით", Toast.LENGTH_LONG).show()
            //        }

            //      })


            // }
            // }


        }

    }
}