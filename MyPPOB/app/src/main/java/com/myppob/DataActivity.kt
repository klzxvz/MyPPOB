package com.myppob

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        // Inisialisasi tombol kembali
        val ivBack: ImageView = findViewById(R.id.iv_back)
        ivBack.setOnClickListener {
            finish()
        }

        // Inisialisasi Spinner Operator
        val spinnerOperator: Spinner = findViewById(R.id.spinner_operator)
        ArrayAdapter.createFromResource(
            this,
            R.array.operator_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerOperator.adapter = adapter
        }

        spinnerOperator.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Do something when an operator is selected
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do something when no operator is selected
            }
        }
    }
}