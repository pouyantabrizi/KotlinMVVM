package ir.urmis.kotlinMVVM.di

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import ir.urmis.kotlinMVVM.ui.base.ViewModelFactory

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

//    @Binds
//    @IntoMap
//    @ViewModelKey(DeviceViewModel::class)
//    fun bindDeviceViewModel(viewModel: DeviceViewModel): ViewModel

//    @Binds
//    @IntoMap
//    @ViewModelKey(MainViewModel::class)
//    fun bindMainViewModel(viewModel: MainViewModel): ViewModel

//    @Binds
//    @IntoMap
//    @ViewModelKey(HomeViewModel::class)
//    fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

}