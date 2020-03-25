package castro.jhostin.thecheezery2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_combos.*
import kotlinx.android.synthetic.main.combo_view.view.*

class Combos : AppCompatActivity() {
    var combos = ArrayList<Combo>()
    var adaptador: AdaptadorCombos? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combos)
        cargarCombos()
        adaptador = AdaptadorCombos(this,combos)
        gridview.adapter = adaptador
    }

    fun cargarCombos(){
        combos.add(Combo("Blueberry Cake + Latte",15,R.drawable.blueberrylattecombo))
        combos.add(Combo("Hot Chocolate + Chocolate Cupcake",12,R.drawable.hotchocolatecupcakecombo))
        combos.add(Combo("Two Espressos",5,R.drawable.twoespressoscombo))
        combos.add(Combo("Sandwich + Coffee",8,R.drawable.coffesandwichcombo))
        combos.add(Combo("Chicken Crepes + Cold Brew",6,R.drawable.chickencrepescoldbrewcombo))
        combos.add(Combo("Tiramisu + Coffee",10,R.drawable.tiramisucoffeecombo))
        combos.add(Combo("Nachos + Cold Brew",10,R.drawable.nachoscoldbrewcombo))
        combos.add(Combo("Red Velvet Cake + Cappuccino",7,R.drawable.redvelvetcakecappuccinocombo))
        combos.add(Combo("Lemon Tart + Cold Brew",10,R.drawable.lemontartcoldbrewcombo))
    }

    class AdaptadorCombos: BaseAdapter {

        var combos = ArrayList<Combo>()
        var contexto: Context?=null

        constructor(contexto: Context, combos: ArrayList<Combo>){
            this.contexto = contexto
            this.combos = combos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var combo = combos[position]
            var inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflater.inflate(R.layout.combo_view,null)

            vista.comboImage.setImageResource(combo.img)
            vista.comboNombre.setText(combo.name)
            vista.comboPrecio.setText("$"+combo.precio.toString())

            return vista

        }

        override fun getItem(position: Int): Any {
            return combos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return combos.size
        }


    }

}
