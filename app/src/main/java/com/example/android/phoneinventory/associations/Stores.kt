package com.example.android.phoneinventory.associations

class Stores {
    private var name: String? = null
    private var streetName: String? = null
    private var cityState: String? = null
    private var phoneNumber: String? = null

    fun createStore() {
        val stores: ArrayList<Stores?> = arrayListOf() //creates array to hold stores
        for (store in stores) {
            System.out.printf(store!!.name + ":\n" + store.streetName + "\n" + store.cityState + "\n" + store.phoneNumber + "\n\n")
        }

    }
}