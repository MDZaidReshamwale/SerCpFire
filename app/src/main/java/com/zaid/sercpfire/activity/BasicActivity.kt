
package com.zaid.sercpfire.activity

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.zaid.sercpfire.R
import androidx.fragment.app.FragmentTransaction

import androidx.fragment.app.*



class BasicActivity : AppCompatActivity(), Communicator {

    private var fragmentLeft: FragmentLeft? = null
    private var fragmentRight: FragmentRight? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        fragmentLeft = FragmentLeft()
        val fragTag = "fragment_left"
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fl_fragment_left, fragmentLeft!!, fragTag)
                .addToBackStack(null)
                .commit()

        fragmentRight = FragmentRight()
        val fragTag2 = "fragment_right"
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_fragment_right,fragmentRight!!,  fragTag2)
            .addToBackStack(null)
            .commit()

    }

    override fun increment() {
        fragmentRight!!.updateCounter(counter++)
    }

    override fun decrement() {
        fragmentRight!!.updateCounter(counter--)
    }

    companion object {
        private var counter = 0
    }
}
