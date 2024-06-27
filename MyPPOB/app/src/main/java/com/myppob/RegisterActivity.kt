package com.myppob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNewUsername: EditText = findViewById(R.id.username)
        val etNewPassword: EditText = findViewById(R.id.password)
        val etConfirmPassword: EditText = findViewById(R.id.confirm_password)
        val btnRegister: Button = findViewById(R.id.register_button)

        btnRegister.setOnClickListener {
            val newUsername = etNewUsername.text.toString()
            val newPassword = etNewPassword.text.toString()
            val confirmPassword = etConfirmPassword.text.toString()

            if (newUsername.isNotEmpty() && newPassword.isNotEmpty() && confirmPassword.isNotEmpty()) {
                if (newPassword == confirmPassword) {
                    // Simpan pengguna baru
                    Toast.makeText(this, "Berhasil Registrasi, Silahkan Login", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Password Tidak Sama", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Tolong Isi Semua Kolom ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
