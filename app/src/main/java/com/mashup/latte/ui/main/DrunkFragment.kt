package com.mashup.latte.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mashup.latte.R

/**
 * Created by Namget on 2019.11.23.
 */
class DrunkFragment : Fragment() {

    companion object {
        lateinit var drunkFragment: DrunkFragment

        fun newInstance(): DrunkFragment {
            synchronized(DrunkFragment::class) {
                drunkFragment = DrunkFragment()
                val args = Bundle()
                drunkFragment.arguments = args
                return drunkFragment
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_drunk, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initRecyclerView()
        requestTodayDrunkList()
    }

    private fun initRecyclerView() {

    }

    private fun requestTodayDrunkList() {

    }



}