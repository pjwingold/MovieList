package au.com.pjwin.movielist.ui

import android.content.Context
import au.com.pjwin.commonlib.ui.adapter.DataListAdapter
import au.com.pjwin.movielist.R
import au.com.pjwin.movielist.databinding.NameListBinding

class NameListAdapter(context: Context, names: List<String>) :
    DataListAdapter<String, NameListBinding>(context, names) {

    override fun layoutId() = R.layout.name_list

    override fun bindData(binding: NameListBinding, data: String, position: Int) {
        binding.name = data
    }
}