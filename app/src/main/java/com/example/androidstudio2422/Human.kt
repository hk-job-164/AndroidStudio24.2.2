package com.example.androidstudio2422

import android.util.Log


class Human(name: String, age: Int, private val hobby: Any?) : Animal(name, age), Thinkable {
    override fun say() {
        Log.d("HumanSay", "私の名前は" + name + "です。年は" + age.toString() + "歳です。")
    }

    override fun think() {
        Log.d("HumanSay", "私は" + hobby + "について考える。")
    }
}