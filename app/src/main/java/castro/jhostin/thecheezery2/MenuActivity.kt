package castro.jhostin.thecheezery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnColdDrink.setOnClickListener{
            var intent = Intent(this,ColdDrinks::class.java)
            startActivity(intent)
        }

        btnHotDrink.setOnClickListener{
            var intent = Intent(this,HotDrinks::class.java)
            startActivity(intent)
        }
        btnDulces.setOnClickListener{
            var intent = Intent(this,Sweeties::class.java)
            startActivity(intent)
        }
        btnSalties.setOnClickListener{
            var intent = Intent(this,Salties::class.java)
            startActivity(intent)
        }
        btnCombos.setOnClickListener{
           var intent = Intent(this,Combos::class.java)
           startActivity(intent)
       }
        btnPersonalized.setOnClickListener{
            var intent = Intent(this,Personalized::class.java)
            startActivity(intent)
        }

    }
}
