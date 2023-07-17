package com.kiro.architacturpatternmvp.presenter

import com.kiro.architacturpatternmvp.data.Model

class Presenter constructor(var view: CounterView){
    var model = Model()

    fun increment(){
        model.increment()
        view.showCount(model.count)
        if (model.count == 10){
            view.showToast("Поздравляем!")
        }
    }
    fun decrement(){
        model.decrement()
        view.showCount(model.count)
    }
    fun changeColor(){
        if(model.count == 15){
        view.changeColor()
    }
    }

}