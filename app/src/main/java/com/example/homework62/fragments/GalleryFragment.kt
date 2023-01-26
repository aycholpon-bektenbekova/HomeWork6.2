package com.example.homework62.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.homework62.R
import com.example.homework62.adapters.ImageAdapter
import com.example.homework62.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding
    private val adapter by lazy { ImageAdapter(this::onClick) }
    private var selectedImages = arrayListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGalleryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rvPhotos.adapter = adapter
            //val manager = GridLayoutManager.HORIZONTAL
            //rvPhotos.layoutManager = manager
            btnSend.setOnClickListener {
                findNavController().navigate(R.id.selectedImagesFragment, bundleOf("select photo" to selectedImages))
            }
        }
    }

    fun onClick(click: String) {
        selectedImages.add(click)
    }
}
