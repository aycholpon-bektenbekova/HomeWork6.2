package com.example.homework62.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.homework62.R
import com.example.homework62.databinding.ItemPhotosBinding

class ImageAdapter(val onClick: (click: String) -> Unit) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    private var images = arrayListOf(
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg",
        "https://www.hsi.org/wp-content/uploads/975x-for-press-releases/animal-testing/rabbit-iStock_000007421599_314156-scaled.jpg"
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(ItemPhotosBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
       holder.bind(images[position])
    }

    override fun getItemCount(): Int {
       return images.size
    }

inner class ImageViewHolder(private val binding: ItemPhotosBinding) : RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("ResourceAsColor")
    fun bind(click: String){
        binding.photo.load(images)
        binding.photo.setOnClickListener {
            binding.photo.setBackgroundColor(R.color.transparent)
            onClick
        }
    }

}

}
