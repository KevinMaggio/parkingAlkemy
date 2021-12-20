package com.example.parkingalkemy

import java.util.*

class Vehicle (
    val plate :String,
    val type: VehicleType,
    val checkInTime:Calendar,
    val test:String?=null
){

    val parkingTime:Long
        get() {
            return (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis)/60000
        }

    override fun equals(other: Any?): Boolean {
        if(other is Vehicle){
            return this.plate ==other.plate
        }
        return super.equals(other)
    }

    override fun hashCode(): Int = this.plate.hashCode()
}

class prueba{
    val car = Vehicle("",VehicleType.BUS, Calendar.getInstance())
}