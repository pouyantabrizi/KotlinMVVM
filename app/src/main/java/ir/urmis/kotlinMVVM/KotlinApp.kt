package ir.urmis.kotlinMVVM

import android.app.Application
import android.content.Context
import ir.urmis.kotlinMVVM.di.AppComponent
import ir.urmis.kotlinMVVM.di.AppModule
import ir.urmis.kotlinMVVM.di.DaggerAppComponent
import ir.urmis.kotlinMVVM.di.UtilsModule

/**
 * Created by Pouyan Tabrizi on 8/18/18.
 */
class KotlinApp : Application() {

    fun getAppComponent(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).utilsModule(UtilsModule()).build()
    }

    protected override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
    }
}
