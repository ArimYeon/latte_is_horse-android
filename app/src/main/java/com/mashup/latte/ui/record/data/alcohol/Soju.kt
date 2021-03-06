package com.mashup.latte.ui.record.data.alcohol

import androidx.annotation.DrawableRes
import com.mashup.latte.R
import com.mashup.latte.ui.record.data.alcohol.Alcohol

/**
 * Created by Namget on 2020.02.05.
 */
data class Soju(
    @DrawableRes override val imageResource: Int = R.drawable.img_soju,
    override val typeList: MutableList<String> = arrayListOf(
        "선택안함","처음처럼", "참이슬", "진로소주", "좋은데이"
    ),
    override val name: String = "소주",
    override val cup: Int = 0,
    override val bottle: Int = 0
) : Alcohol