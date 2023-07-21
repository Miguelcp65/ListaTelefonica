package com.example.listatelefonica.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listatelefonica.R
import com.example.listatelefonica.databinding.ActivityContactImageSelectionBinding

class ContactImageSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactImageSelectionBinding
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactImageSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        i = intent
        binding.imageProfile1.setOnClickListener {
            sendID(R.drawable.contact1)
        }
        binding.imageProfile2.setOnClickListener {
            sendID(R.drawable.contact2)
        }
        binding.imageProfile3.setOnClickListener {
            sendID(R.drawable.contact3)
        }
        binding.imageProfile4.setOnClickListener {
            sendID(R.drawable.contact4)
        }
        binding.buttonRemoveImage.setOnClickListener {
            sendID(R.drawable.default_contact)
        }
    }

    private fun sendID(id: Int) {
        i.putExtra("id", id)
        setResult(1, i)
        finish()
    }
}