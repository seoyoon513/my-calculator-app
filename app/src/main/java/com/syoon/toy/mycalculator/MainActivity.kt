package com.syoon.toy.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null
    private var btnZero: Button? = null
    private var btnOne: Button? = null
    private var btnTwo: Button? = null
    private var btnThree: Button? = null
    private var btnFour: Button? = null
    private var btnFive: Button? = null
    private var btnSix: Button? = null
    private var btnSeven: Button? = null
    private var btnEight: Button? = null
    private var btnNine: Button? = null
    private var btnClr: Button? = null
    private var btnEqual: Button? = null
    private var btnSub: Button? = null
    private var btnPlus: Button? = null
    private var btnMulti: Button? = null
    private var btnDiv: Button? = null

    val calculationList = listOf<Char>('+', '-', '/', '*')


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tv_input)
        btnZero = findViewById(R.id.btn_zero)
        btnOne = findViewById(R.id.btn_one)
        btnTwo = findViewById(R.id.btn_two)
        btnThree = findViewById(R.id.btn_three)
        btnFour = findViewById(R.id.btn_four)
        btnFive = findViewById(R.id.btn_five)
        btnSix = findViewById(R.id.btn_six)
        btnSeven = findViewById(R.id.btn_seven)
        btnEight = findViewById(R.id.btn_eight)
        btnNine = findViewById(R.id.btn_nine)
        btnClr = findViewById(R.id.btn_clr)
        btnSub = findViewById(R.id.btn_subtract)
        btnPlus = findViewById(R.id.btn_plus)
        btnMulti = findViewById(R.id.btn_multiply)
        btnDiv = findViewById(R.id.btn_divide)
        btnEqual = findViewById(R.id.btn_equal)

        initListener()
        getCalculation()

    }

    private fun initListener() {
        btnZero?.setOnClickListener {
            tvInput?.append("0")
        }
        btnOne?.setOnClickListener {
            tvInput?.append("1")
        }
        btnTwo?.setOnClickListener {
            tvInput?.append("2")
        }
        btnThree?.setOnClickListener {
            tvInput?.append("3")
        }
        btnFour?.setOnClickListener {
            tvInput?.append("4")
        }
        btnFive?.setOnClickListener {
            tvInput?.append("5")
        }
        btnSix?.setOnClickListener {
            tvInput?.append("6")
        }
        btnSeven?.setOnClickListener {
            tvInput?.append("7")
        }
        btnEight?.setOnClickListener {
            tvInput?.append("8")
        }
        btnNine?.setOnClickListener {
            tvInput?.append("9")
        }

        btnClr?.setOnClickListener {
            tvInput?.text = ""
        }

    }

    private fun getCalculation() {

        btnPlus?.setOnClickListener {
            if (tvInput?.text.toString() == "") {
                Toast.makeText(this, "Input number first", Toast.LENGTH_SHORT ).show()
            } else if (calculationList.contains(tvInput?.text.toString().last())) {
                Toast.makeText(this, "Input number", Toast.LENGTH_SHORT ).show()
            } else {
                tvInput?.append("+")
            }
        }

        btnSub?.setOnClickListener {
            if (tvInput?.text.toString() == "") {
                Toast.makeText(this, "Input number first", Toast.LENGTH_SHORT ).show()
            } else if (calculationList.contains(tvInput?.text.toString().last())) {
                Toast.makeText(this, "Input number", Toast.LENGTH_SHORT ).show()
            } else {
                tvInput?.append("-")
            }
        }

        btnMulti?.setOnClickListener {
            if (tvInput?.text.toString() == "") {
                Toast.makeText(this, "Input number first", Toast.LENGTH_SHORT ).show()
            } else if (calculationList.contains(tvInput?.text.toString().last())) {
                Toast.makeText(this, "Input number", Toast.LENGTH_SHORT ).show()
            } else {
                tvInput?.append("*")
            }
        }

        btnDiv?.setOnClickListener {
            if (tvInput?.text.toString() == "") {
                Toast.makeText(this, "Input number first", Toast.LENGTH_SHORT ).show()
            } else if (calculationList.contains(tvInput?.text.toString().last())) {
                Toast.makeText(this, "Input number", Toast.LENGTH_SHORT ).show()
            } else {
                tvInput?.append("/")
            }
        }
    }
}