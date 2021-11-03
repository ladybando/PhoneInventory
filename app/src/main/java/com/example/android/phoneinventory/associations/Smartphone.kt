package com.example.android.phoneinventory.associations

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "smartphones")
data class Smartphones(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var os: String?,
    var ram: Int,
    var camera_lenses: Int,
) : Parcelable

//private var phones: ArrayList<Smartphone> = arrayListOf()

/*
fun createPhones() {
    os = "Android"
    ram = 16
    camera_lenses = 2

}

fun showPhones(): ArrayList<Smartphone> {
    phones.forEach { phone ->
        phone.os + ":\n" + phone.camera_lenses + ":\n" + phone.ram
    }
    return phones
}
}*/
