package com.example.parkingalkemy

class Parking (
    val vehiclesList:MutableSet<Vehicle>
){

    val limit =19

    fun addVehicle(vehicle: Vehicle):Boolean{
        return if (vehiclesList.size<=limit){
            vehiclesList.add(vehicle)
            println("Welcome to Alkeparking")
            true
        }else {
            println("Sorry check-infailed")
            false
        }
    }
}