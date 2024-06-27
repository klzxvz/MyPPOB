package com.myppob

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_listrik.*

class ListrikActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listrik)

        // Inisialisasi tombol kembali
        val ivBack: ImageView = findViewById(R.id.iv_back)
        ivBack.setOnClickListener {
            finish()
        }

        // Inisialisasi Id Pelanggan
        val spinnerListrik: Spinner = findViewById(R.id.spinner_listrik)
        ArrayAdapter.createFromResource(
            this,
            R.array.listrik_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerListrik.adapter = adapter
        }

        spinnerListrik.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Do something when an operator is selected
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do something when no operator is selected
            }
        }
    }
}
