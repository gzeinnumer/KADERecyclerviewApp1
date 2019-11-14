package com.gzeinnumer.kaderecyclerviewapp1

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (val name: String?, val image: Int?) : Parcelable {
    private companion object : Parceler<Item> {
        override fun Item.write(parcel: Parcel, flags: Int) {
            // Custom write implementation
        }

        override fun create(parcel: Parcel): Item {
            // Custom read implementation
        }
    }
}