import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan1.R

class MainActivity : AppCompatActivity() {

    private lateinit var increment: Button
    private lateinit var decrement: Button
    private lateinit var display: TextView

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increment = findViewById(R.id.tambah)
        decrement = findViewById(R.id.kurang)
        display = findViewById(R.id.tampilan_angka)

        increment.setOnClickListener {
            count++
            display.text = count.toString()
        }

        decrement.setOnClickListener {
            if (count <= 8)
                count = 0
            else
                count--
            display.text = count.toString()
        }
    }
}
