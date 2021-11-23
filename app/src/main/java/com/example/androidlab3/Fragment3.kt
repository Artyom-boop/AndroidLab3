package com.example.androidlab3

import android.os.Bundle
import android.view.MenuItem
import com.example.androidlab3.databinding.Fragment3Binding
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.view.*


class Fragment3 : Fragment() {
    private val navigationController by lazy{ findNavController() }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment3Binding.inflate(layoutInflater)

        binding.bnToFirst.setOnClickListener {
            navigationController.navigate(R.id.fragment3_to_fragment1)
        }
        binding.bnToSecond.setOnClickListener {
            navigationController.navigate(R.id.fragment3_to_fragment2)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.activity_about -> {
                navigationController.navigate(R.id.menu_about)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}