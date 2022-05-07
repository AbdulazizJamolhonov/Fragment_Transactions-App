package developer.abdulaziz.homework_15

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import developer.abdulaziz.homework_15.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.bnt1.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "Statically fragment",
                Toast.LENGTH_SHORT
            ).show()
        }

        return binding.root
    }
}