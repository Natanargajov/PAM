import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Mengambil data dari intent dan menampilkannya di TextView
        val inputData = intent.getStringExtra("inputData")
        textView.text = inputData
    }
}
