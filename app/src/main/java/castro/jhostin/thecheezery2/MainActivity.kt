package castro.jhostin.thecheezery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Codigo para iniciar otra activity
        btn_inicio.setOnClickListener{
            var intent = Intent(this,RegistroActivity::class.java)
            startActivity(intent)

        }

    }
}
