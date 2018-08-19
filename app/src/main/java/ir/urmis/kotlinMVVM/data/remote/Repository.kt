package ir.urmis.kotlinMVVM.data.remote

import com.google.gson.JsonElement
import io.reactivex.Observable

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
class Repository constructor(var apiCallInterface: ApiCallInterface){

    /*
     * method to call login api
     * */
    fun executeLogin(mobileNumber: String, password: String): Observable<JsonElement> {
        return apiCallInterface.login(mobileNumber, password)
    }
}