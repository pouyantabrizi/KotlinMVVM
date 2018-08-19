package ir.urmis.kotlinMVVM.ui.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by Pouyan Tabrizi on 8/19/18.
 */
class ViewModelFactory @Inject constructor(
        private val creators: Map<Class<out ViewModel>,
                @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = creators[modelClass as Class<ViewModel>]
                ?: creators.entries.firstOrNull { (c, _) -> modelClass.isAssignableFrom(c) }?.value
                ?: throw IllegalArgumentException("Unknown model class $modelClass")

        return creator.get() as T
    }
}