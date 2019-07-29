package com.example.smoviles.coderesistor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var rta = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var franja1 = ""
        var franja2 = ""
        var franja3 = ""
        var franja4 = ""

        btn_black1.setOnClickListener {
             franja1 = ""
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_black1.background
        }
        btn_brown1.setOnClickListener {
             franja1 = "1"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_brown1.background
        }
        btn_red1.setOnClickListener {
             franja1 = "2"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_red1.background
        }
        btn_orange1.setOnClickListener {
             franja1 = "3"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_orange1.background
        }
        btn_yellow1.setOnClickListener {
             franja1 = "4"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_yellow1.background
        }
        btn_green1.setOnClickListener {
             franja1 = "5"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_green1.background
        }
        btn_blue1.setOnClickListener {
             franja1 = "6"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_blue1.background
        }
        btn_purple1.setOnClickListener {
             franja1 = "7"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_purple1.background
        }
        btn_gray1.setOnClickListener {
             franja1 = "8"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_gray1.background
        }
        btn_white1.setOnClickListener {
             franja1 = "9"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color1.background = btn_white1.background
        }

        //***********************************************+//

        btn_black2.setOnClickListener {
            franja2 = "0"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_black2.background
        }
        btn_brown2.setOnClickListener {
            franja2 = "1"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_brown2.background
        }
        btn_red2.setOnClickListener {
            franja2 = "2"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_red2.background
        }
        btn_orange2.setOnClickListener {
            franja2 = "3"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_orange2.background
        }
        btn_yellow2.setOnClickListener {
            franja2 = "4"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_yellow2.background
        }
        btn_green2.setOnClickListener {
            franja2 = "5"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_green2.background
        }
        btn_blue2.setOnClickListener {
            franja2 = "6"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_blue2.background
        }
        btn_purple2.setOnClickListener {
            franja2 = "7"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_purple2.background
        }
        btn_gray2.setOnClickListener {
            franja2 = "8"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_gray2.background
        }
        btn_white2.setOnClickListener {
            franja2 = "9"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color2.background = btn_white2.background
        }

        //*********************************************//

        btn_black3.setOnClickListener {
            franja3 = "Ω"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_black3.background
        }
        btn_brown3.setOnClickListener {
            franja3 = "0Ω"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_brown3.background
        }
        btn_red3.setOnClickListener {
            franja3 = "00Ω"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_red3.background
        }
        btn_orange3.setOnClickListener {
            franja3 = "KΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_orange3.background
        }
        btn_yellow3.setOnClickListener {
            franja3 = "0 KΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_yellow3.background
        }
        btn_green3.setOnClickListener {
            franja3 = "00 KΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_green3.background
        }
        btn_blue3.setOnClickListener {
            franja3 = "MΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_blue3.background
        }
        btn_purple3.setOnClickListener {
            franja3 = "0 MΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_purple3.background
        }
        btn_gray3.setOnClickListener {
            franja3 = "00 MΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_gray3.background
        }
        btn_white3.setOnClickListener {
            franja3 = "GΩ"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color3.background = btn_white3.background
        }

        //*********************************************//

        btn_brown4.setOnClickListener {
            franja4 = " ± 1%"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color4.background = btn_brown4.background
        }
        btn_red4.setOnClickListener {
            franja4 = " ± 2%"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color4.background = btn_red4.background
        }
        btn_gold4.setOnClickListener {
            franja4 = " ± 5%"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color4.background = btn_gold4.background
        }
        btn_plate.setOnClickListener {
            franja4 = " ± 10%"
            rta = franja1 + franja2 + franja3 + franja4
            tv_result.text = rta
            tv_color4.background = btn_plate.background
        }

    }
}

