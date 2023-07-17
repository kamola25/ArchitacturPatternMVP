package com.kiro.architacturpatternmvp.presenter

interface CounterView {
    fun showCount(count:Int)
    fun showToast(congratulation : String)
    fun changeColor()

}