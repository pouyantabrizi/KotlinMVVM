package ir.urmis.kotlinMVVM.data.remote

import com.google.gson.JsonElement
import io.reactivex.annotations.NonNull
import ir.urmis.kotlinMVVM.utils.Status

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
class ApiResponse constructor(var status :Status,var data :JsonElement? , var error: Throwable?) {

    fun loading(): ApiResponse {
        return ApiResponse(Status.LOADING, null, null)
    }

    fun success(@NonNull data: JsonElement): ApiResponse {
        return ApiResponse(Status.SUCCESS,data,null)
    }

    fun error(@NonNull error: Throwable): ApiResponse {
        return ApiResponse(Status.ERROR, null, error)
    }
}