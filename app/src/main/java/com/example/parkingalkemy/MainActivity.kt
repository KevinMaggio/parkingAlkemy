package com.example.parkingalkemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val auto = Vehicle("BGF232" , VehicleType.CAR, Calendar.getInstance())
        


        //val parking= Parking

    }
}