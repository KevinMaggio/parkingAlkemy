package com.example.parkingalkemy

import java.util.*

class ParkingSpace(var vehicle: Vehicle) {

    val parkingTime: Long
        get() {
            return (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / 60000
        }


    //val parking = Parking(mutableSetOf(auto,bus,minibus))
    var parking = Parking(mutableSetOf())


    fun imprimir() {
        //println(parking.vehiclesList.contains(auto))
    }


    fun checkOutVehicle(plate: String) {
        for (i in parking.vehiclesList) {
            if (i.plate == plate) {

                if (i.discount!=null){
                    onSuccess(calculateFee(303,i.type.type,true))
                }else{
                    onSuccess(calculateFee(303,i.type.type,false))
                }

                break
            } else {
                onError()
            }
        }
    }

    private fun calculateFee(parkingTime: Long, type: Int, fee: Boolean): Int {
        var monto=0
        var mod =0
        if (parkingTime<120){
            monto = type
        }else{
            var extra = ((parkingTime.toInt() - 120)/ 15 )
            if (((parkingTime.toInt() - 120)%15) !=0){
                mod=1
            }
            monto= type+((extra+mod)*5)

            if (fee){
                monto-=(monto*15)/100
            }
        }
        return monto
    }

    fun onSuccess(res: Int) {

    }

    fun onError() {
        println("error en check out")
    }
}