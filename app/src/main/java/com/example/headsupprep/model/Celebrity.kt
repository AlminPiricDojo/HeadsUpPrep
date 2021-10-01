package com.example.headsupprep.model

import com.google.gson.annotations.SerializedName

//data class Celebrity(val name: String, val taboo1: String, val taboo2: String, val taboo3: String)
class Celebrity{
    @SerializedName("name")
    var name: String = ""

    @SerializedName("taboo1")
    var taboo1: String = ""

    @SerializedName("taboo2")
    var taboo2: String = ""

    @SerializedName("taboo3")
    var taboo3: String = ""

    constructor(name: String, taboo1: String, taboo2: String, taboo3: String) {
        this.name = name
        this.taboo1 = taboo1
        this.taboo2 = taboo2
        this.taboo3 = taboo3
    }
}