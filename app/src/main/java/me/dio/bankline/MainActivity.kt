package me.dio.bankline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.bankline.databinding.ActivityMainBinding
import me.dio.bankline.domain.Correntista
import me.dio.bankline.ui.statement.BankStatementActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //acessando o botão de continua e fazendo uma ação quando ele for clikcado
        binding.button.setOnClickListener {
            val accountHouderId = binding.editTextNumber.toString().toInt()
            val accountHolder = Correntista(accountHouderId)

            //o intent esta enviando o nosso correntista para a tela BankStatement
            val intent = Intent(this,BankStatementActivity::class.java).apply {
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER,accountHolder)
            }
            startActivity(intent)
        }

    }
}