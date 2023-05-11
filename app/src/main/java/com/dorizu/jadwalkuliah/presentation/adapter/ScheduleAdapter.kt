package com.dorizu.jadwalkuliah.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dorizu.jadwalkuliah.databinding.ItemScheduleBinding
import com.dorizu.jadwalkuliah.domain.model.Schedule

class ScheduleAdapter(
    private val items: List<Schedule>
): RecyclerView.Adapter<ScheduleAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemScheduleBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Schedule){
            binding.apply {
                tvNameCourse.text = data.courseKey
                tvTime.text = "${data.startTime} - ${data.endTime}"
                tvRoom.text = data.classKey
                tvLecture.text = data.lectureKey
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemScheduleBinding.inflate(inflater, parent, false)
        return  ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ScheduleAdapter.ViewHolder, position: Int) {
        val data = items[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = items.size
}