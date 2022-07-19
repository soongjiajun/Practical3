package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.practical3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var student: Student = Student("Soong","RSF")

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        binding.btnSetData.setOnClickListener(){

            binding.myStudent = student
            //binding.tvName.text = "Soong"
            //binding.tvProgramme.text = "RSF"
        }

        binding.btnChangeValue.setOnClickListener(){
            student.programme = "RIT"
            binding.invalidateAll()
        }

    }
}