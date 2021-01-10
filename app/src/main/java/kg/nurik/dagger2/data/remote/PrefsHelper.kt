package kg.nurik.dagger2.data.remote

import android.content.Context
import android.content.SharedPreferences

class PrefsHelper(private val context: Context) {

    private var prefs: SharedPreferences =
        context.getSharedPreferences("MyShared", Context.MODE_PRIVATE)

    fun saveLogin(login: String) {
        prefs.edit().putString(LOGIN, login).apply()
    }

    fun getLogin(): String {
       return prefs.getString(LOGIN,"")?:"" //элвис если ничего не выйдет то вернет пустое значение
    }

    companion object {
        private const val LOGIN = "LOGIN"
    }
}