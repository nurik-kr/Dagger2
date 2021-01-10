package kg.nurik.dagger2.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import kg.nurik.dagger2.di.inject
import kotlinx.coroutines.*

class MainViewModel : ViewModel() {

    private val repository by inject { retrofitRepository } //как переменка,таким образом подключаем зависимости
    private val prefs by inject { preference }

    private val scope = CoroutineScope(Job())

    fun loadList() {
        scope.launch(Dispatchers.IO) {
            runCatching {
                val result = repository.loadBLogs(20, 1)
                prefs.saveLogin(result.toString())
                Log.d("_______error", "response")
            }.onFailure {
                Log.d("_______error", it.localizedMessage)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        scope.cancel()
    }
}