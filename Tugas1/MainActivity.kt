import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menggunakan Intent untuk pindah ke halaman kedua saat tombol disentuh
        submitButton.setOnClickListener {
            val inputText = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("inputData", inputText)
            startActivity(intent)
        }
    }
}
