import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kilimoapp.LanguageSelection
import com.example.kilimoapp.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.button)

        // Set OnClickListener for the Next button
        buttonNext.setOnClickListener {
            // Navigate to the LanguageSelection activity
            val intent = Intent(this, LanguageSelection::class.java)
            startActivity(intent)
        }
    }
}
