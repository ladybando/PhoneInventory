package com.example.android.phoneinventory.associations

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "inventory")
data class Inventory(
    @androidx.room.PrimaryKey(autoGenerate = true) val id: Int,
    var make: String?,
    var model: String,
    var price: Int,
    var quantity: Int,
): Parcelable


