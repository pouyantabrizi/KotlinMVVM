package ir.urmis.kotlinMVVM.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
object Constant {

    /*fun getProgressDialog(context: Context, msg: String): ProgressDialog {
        val progressDialog = ProgressDialog(context)
        progressDialog.setMessage(msg)
        progressDialog.setCancelable(false)
        return progressDialog
    }*/

    fun checkInternetConnection(context: Context): Boolean
    {
        val connectivity = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info = connectivity.allNetworkInfo
        for (i in info.indices)
        {
            if (info[i].state == NetworkInfo.State.CONNECTED)
            {
                    return true
            }
        }
        return false
    }
}