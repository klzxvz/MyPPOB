package com.myppob

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_listrik.*

class EwalletActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ewallet)


        val ivBack: ImageView = findViewById(R.id.iv_back)
        ivBack.setOnClickListener {
            finish()
        }

        val spinnerEwallet: Spinner = findViewById(R.id.spinner_ewallet)
        ArrayAdapter.createFromResource(
            this,
            R.array.ewallet_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerEwallet.adapter = adapter
        }

        spinnerEwallet.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }
}
