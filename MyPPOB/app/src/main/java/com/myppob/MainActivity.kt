package com.myppob

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    true
                }
                R.id.navigation_riwayat -> {
                    //val intent = Intent(this, RiwayatActivity::class.java)
                    //startActivity(intent)
                    false
                }
                R.id.navigation_notifikasi -> {
                    //val intent = Intent(this, NotifikasiActivity::class.java)
                    //startActivity(intent)
                    false
                }
                else -> false
            }
        }

        val menuListrik: LinearLayout = findViewById(R.id.menu_listrik)
        menuListrik.setOnClickListener {
            val intent = Intent(this, ListrikActivity::class.java)
            startActivity(intent)
        }

        val menuData: LinearLayout = findViewById(R.id.menu_data)
        menuData.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            startActivity(intent)
        }

        val menuPulsa: LinearLayout = findViewById(R.id.menu_pulsa)
        menuPulsa.setOnClickListener {
            val intent = Intent(this, PulsaActivity::class.java)
            startActivity(intent)
        }

        val menuTopupGame: LinearLayout = findViewById(R.id.menu_topup_game)
        menuTopupGame.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

        val menuEwallet: LinearLayout = findViewById(R.id.menu_ewallet)
        menuEwallet.setOnClickListener {
            val intent = Intent(this, EwalletActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        val currentSelectedItem = bottomNavigationView.selectedItemId
        if (currentSelectedItem != R.id.navigation_home) {
            bottomNavigationView.selectedItemId = R.id.navigation_home
        } else {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Apakah Anda ingin keluar dari aplikasi?")
            builder.setCancelable(true)
            builder.setPositiveButton("Ya") { _, _ ->
                finishAffinity()
            }
            builder.setNegativeButton("Tidak") { dialog, _ ->
                dialog.cancel()
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}
