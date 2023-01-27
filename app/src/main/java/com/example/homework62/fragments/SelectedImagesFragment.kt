package com.example.homework62.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homework62.adapters.SelectedImagesAdapter
import com.example.homework62.databinding.FragmentSelectedImagesBinding


class SelectedImagesFragment : Fragment() {
   private lateinit var binding: FragmentSelectedImagesBinding
   private val adapter by lazy { SelectedImagesAdapter() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedImagesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            rvPhotos.adapter = adapter
            rvPhotos.layoutManager = GridLayoutManager(activity, 3)
            exBtn.setOnClickListener {
                findNavController().navigateUp()
            }
            addImages()
        }
    }

    private fun addImages(){
        val images = arguments?.getStringArrayList("select photo")
        if (images != null) {
            adapter.addImage(images)
        }
    }
}
