package ir.urmis.kotlinMVVM.di

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
@Component(modules = arrayOf(AppModule::class, UtilsModule::class , ViewModelModule::class))
@Singleton
interface AppComponent {

    //fun doInjection(loginActivity: LoginActivity)
}
