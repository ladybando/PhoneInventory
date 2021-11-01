package com.example.android.phoneinventory.associations

class Smartphone : Inventory() {
    private val os: String? = null
    private val ram = 0
    private val camera_lenses = 0

    fun createPhones(): ArrayList<Smartphone> {
        val phones: ArrayList<Smartphone> = arrayListOf()
        phones.forEach { phone ->
            phone.os + ":\n" + phone.camera_lenses + ":\n" + phone.ram
        }
            return phones
    }
}