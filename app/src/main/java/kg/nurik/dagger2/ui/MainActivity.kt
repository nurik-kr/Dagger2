package kg.nurik.dagger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kg.nurik.dagger2.R
import kg.nurik.dagger2.utils.viewModel

class MainActivity : AppCompatActivity() {

    //    private lateinit var vm: MainViewModel
    //    private val vm by lazy { ViewModelProviders.of(this)[MainViewModel::class.java] }
    private val vm by viewModel(MainViewModel::class) //ext fun helper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vm.loadList()
    }
}