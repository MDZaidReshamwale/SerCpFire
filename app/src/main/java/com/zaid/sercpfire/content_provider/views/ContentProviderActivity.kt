
package com.zaid.sercpfire.content_provider.views

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.zaid.sercpfire.R

class ContentProviderActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider)
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container, FragmentContentProvider()
           ).commit()

    }
}
