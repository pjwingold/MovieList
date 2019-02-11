package au.com.pjwin.movielist.binding

import android.databinding.BindingAdapter
import android.graphics.Color
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

class ViewBindingAdapter {

    companion object {
        @BindingAdapter("background")
        @JvmStatic
        fun View.setBackground(backgroundColor: String?) {
            try {
                backgroundColor?.let {
                    setBackgroundColor(Color.parseColor(backgroundColor))
                }

            } catch (e: IllegalArgumentException) {
                Log.e("BndingAdapter", "Unknow color", e)
            }
        }

        @BindingAdapter("imageUrl")
        @JvmStatic
        fun ImageView.setImageUrl(imageUrl: String?) {
            Glide.with(context).load(imageUrl).into(this)
        }
    }

}