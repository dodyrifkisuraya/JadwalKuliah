package com.dorizu.jadwalkuliah.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.dorizu.jadwalkuliah.R
import com.dorizu.jadwalkuliah.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
    }

    private fun setupView() {
        binding.apply {
            chipClass.setOnCloseIconClickListener {

            }
            chipCourse.setOnCloseIconClickListener {

            }
            chipLecture.setOnCloseIconClickListener {

            }
            chipMahasiswa.setOnCloseIconClickListener {

            }
        }
    }
}