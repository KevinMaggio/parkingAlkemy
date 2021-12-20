package com.example.parkingalkemy

import java.util.*

class PakingSpace (var vehicle: Vehicle)
{
    val parkingTime:Long
        get() {
            return (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis)/60000
        }
}