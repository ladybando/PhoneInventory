package com.example.android.phoneinventory.associations

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "stores")
data class Stores(
    @ColumnInfo
    @PrimaryKey(autoGenerate = true) val id: Int,
    var name: String?,
    var streetName: String?,
    var cityState: String?,
    var phoneNumber: String?,
): Parcelable

/*   fun createStore() {
        val stores: ArrayList<Stores?> = arrayListOf() //creates array to hold stores
        for (store in stores) {
            System.out.printf(store!!.name + ":\n" + store.streetName + "\n" + store.cityState + "\n" + store.phoneNumber + "\n\n")
        }
    }*/