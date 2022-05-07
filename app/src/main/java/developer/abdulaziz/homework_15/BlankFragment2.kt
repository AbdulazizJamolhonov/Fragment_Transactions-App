package developer.abdulaziz.homework_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import developer.abdulaziz.homework_15.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank2Binding.inflate(layoutInflater)
        binding.bnt2.setOnClickListener {
            Toast.makeText(
                binding.root.context, "Dynamically fragment", Toast.LENGTH_SHORT
            ).show()
        }
        return binding.root
    }

}