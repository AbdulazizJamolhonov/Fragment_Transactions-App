package developer.abdulaziz.homework_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import developer.abdulaziz.homework_15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var a = true
    private var b = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blankFragment2 = BlankFragment2()
        val blankFragment = BlankFragment()

        binding.apply {

            btnAdd.setOnClickListener {
                if (a) {
                    a = false
                    val fragmentManager = supportFragmentManager
                    val transaction = fragmentManager.beginTransaction()
                    transaction.add(R.id.my_container, blankFragment2)
                    transaction.commit()
                }
            }
            btnRemove.setOnClickListener {
                a = true
                if (b) {
                    val fragmentManager = supportFragmentManager
                    val transaction = fragmentManager.beginTransaction()
                    transaction.remove(blankFragment2)
                    transaction.commit()
                } else {
                    val fragmentManager = supportFragmentManager
                    val transaction = fragmentManager.beginTransaction()
                    transaction.remove(blankFragment)
                    transaction.commit()
                }
            }
            btnHide.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.hide(blankFragment2)
                transaction.commit()
            }
            btnShow.setOnClickListener {
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.show(blankFragment2)
                transaction.commit()
            }
            btnReplace.setOnClickListener {
                if (!a) {
                    if (b) {
                        b = false
                        val fragmentManager = supportFragmentManager
                        val transaction = fragmentManager.beginTransaction()
                        transaction.replace(R.id.my_container, blankFragment)
                        transaction.commit()
                    } else {
                        b = true
                        val fragmentManager = supportFragmentManager
                        val transaction = fragmentManager.beginTransaction()
                        transaction.replace(R.id.my_container, blankFragment2)
                        transaction.commit()
                    }
                }
            }
        }
    }
}