package ir.urmis.kotlinMVVM.ui.main

import android.os.Bundle
import ir.urmis.kotlinMVVM.R
import ir.urmis.kotlinMVVM.ui.base.BaseActivity

/**
 * Created by Pouyan Tabrizi on 8/18/18.
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
