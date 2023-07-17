package com.kiro.architacturpatternmvp.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kiro.architacturpatternmvp.databinding.ActivityMainBinding
import com.kiro.architacturpatternmvp.presenter.CounterView
import com.kiro.architacturpatternmvp.presenter.Presenter

class MainActivity : AppCompatActivity(),CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            btnIncrement.setOnClickListener {
                presenter.increment()
                presenter.changeColor()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
                presenter.changeColor()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.counterTxt.text = count.toString()
    }

    override fun showToast(congratulation: String) {
        Toast.makeText(this, congratulation, Toast.LENGTH_SHORT).show()
    }

    override fun changeColor() {
        binding.counterTxt.setTextColor(Color.parseColor("#9CEF16"))
    }
}