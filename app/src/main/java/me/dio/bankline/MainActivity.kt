package me.dio.bankline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.bankline.databinding.ActivityMainBinding
import me.dio.bankline.domain.Correntista

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val accountHouderId = binding.editTextNumber.toString().toInt()
            val accountHolder = Correntista(accountHouderId)
        }

    }
}