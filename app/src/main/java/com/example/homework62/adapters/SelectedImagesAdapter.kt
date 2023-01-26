package com.example.homework62.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework62.databinding.ItemPhotosBinding

class SelectedImagesAdapter: RecyclerView.Adapter<SelectedImagesViewHolder>() {
    private val selectedImages = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectedImagesViewHolder {
        return SelectedImagesViewHolder(ItemPhotosBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SelectedImagesViewHolder, position: Int) {
        holder.bind(selectedImages[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addImage(newImages: ArrayList<String>){
        selectedImages.clear()
        selectedImages.addAll(newImages)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = selectedImages.size
}

class SelectedImagesViewHolder(binding: ItemPhotosBinding) : RecyclerView.ViewHolder(binding.root){
fun bind(click: String){}
}
