package me.dio.bankline.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.bankline.R
import me.dio.bankline.databinding.ActivityBankStatementBinding
import me.dio.bankline.domain.Correntista

class BankStatementActivity : AppCompatActivity() {

    companion object {
        const val  EXTRA_ACCOUNT_HOLDER = "me.dio.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }
    //com essa variavel podemos acessar qualquer elemento do meu layout
    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }
    private val correntita by lazy {
       intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IlegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}

class IlegalArgumentException : Throwable() {

}
