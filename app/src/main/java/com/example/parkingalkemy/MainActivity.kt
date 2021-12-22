package com.example.parkingalkemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    val parking = Parking(mutableSetOf())
    val auto: Vehicle = Vehicle("BGF232", VehicleType.CAR, Calendar.getInstance())
    val auto2: Vehicle = Vehicle("DDF442", VehicleType.CAR, Calendar.getInstance())
    val auto3: Vehicle =
        Vehicle("JNG534", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val auto4: Vehicle = Vehicle("KMH555", VehicleType.CAR, Calendar.getInstance())
    val bus: Vehicle =
        Vehicle("MPD990", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val bus2: Vehicle = Vehicle("SSD422", VehicleType.BUS, Calendar.getInstance())
    val bus3: Vehicle = Vehicle("JNF746", VehicleType.BUS, Calendar.getInstance())
    val bus4: Vehicle =
        Vehicle("CNV099", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_003")
    val bus5: Vehicle = Vehicle("KNK444", VehicleType.BUS, Calendar.getInstance())
    val minibus: Vehicle = Vehicle("NDG534", VehicleType.MINIBUS, Calendar.getInstance())
    val minibus2: Vehicle = Vehicle("KND525", VehicleType.MINIBUS, Calendar.getInstance())
    val minibus3: Vehicle = Vehicle(" CXZ412", VehicleType.MINIBUS, Calendar.getInstance())
    val minibus4: Vehicle = Vehicle("LMF888", VehicleType.MINIBUS, Calendar.getInstance())
    val minibus5: Vehicle = Vehicle("MMG666", VehicleType.MINIBUS, Calendar.getInstance())
    val moto = Vehicle("AA001", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val moto2 = Vehicle("AA002", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val moto3 = Vehicle("AA003", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val moto4 =
        Vehicle("AA004", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_003")
    val moto5 = Vehicle("AA005", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val moto6 =
        Vehicle("AA006", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_004")
    val moto7 = Vehicle("AA007", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val list = listOf<Vehicle>(
        auto,
        auto2,
        auto3,
        auto4,
        bus,
        bus2,
        bus3,
        bus4,
        bus5,
        moto,
        moto2,
        moto3,
        moto4,
        moto5,
        moto6,
        moto7,
        minibus,
        minibus2,
        minibus3,
        minibus4,
        minibus5
    )

    val parkingspace=ParkingSpace(auto)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        check_in(list)

        parkingspace.parking =parking
        parkingspace.parking.workOfTheDay()
        parkingspace.checkOutVehicle(auto.plate)
        parkingspace.parking.workOfTheDay()
        parkingspace.parking.listVehicle()

    }

    fun check_in(list :List<Vehicle>) {
        for (i in list) {
            parking.addVehicle(i)
        }
    }
}