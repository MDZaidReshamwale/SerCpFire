package com.zaid.sercpfire.activity

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.zaid.sercpfire.R
import kotlinx.android.synthetic.main.fragment_right.*

class FragmentRight : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_right, container, false)

        return view
    }

    fun updateCounter(count: Int) {
        tv_counter.text = count.toString() + ""
    }

}
