package ir.urmis.kotlinMVVM.data.remote

import com.google.gson.JsonElement
import io.reactivex.Observable
import ir.urmis.kotlinMVVM.utils.Urls
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
interface ApiCallInterface {

    @FormUrlEncoded
    @POST(Urls.LOGIN)
    abstract fun login(@Field("mobile") mobileNumber: String, @Field("password") password: String): Observable<JsonElement>
}