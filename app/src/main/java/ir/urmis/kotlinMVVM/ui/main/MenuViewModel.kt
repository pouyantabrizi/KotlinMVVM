package ir.urmis.kotlinMVVM.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import ir.urmis.kotlinMVVM.data.remote.ApiResponse
import ir.urmis.kotlinMVVM.data.remote.Repository
import javax.inject.Inject

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
class MenuViewModel @Inject constructor(var repository: Repository) : ViewModel() {

    private val disposables = CompositeDisposable()
    private val responseLiveData = MutableLiveData<ApiResponse>()
}