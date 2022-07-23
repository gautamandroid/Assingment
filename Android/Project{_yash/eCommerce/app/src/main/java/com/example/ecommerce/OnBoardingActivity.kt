package com.example.ecommerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.example.ecommerce.adapter.IntroPagerAdapter
import com.example.ecommerce.databinding.ActivityOnBoardingBinding
import com.example.ecommerce.model.Item
import com.example.ecommerce.sharepref.PrefManager

class OnBoardingActivity : AppCompatActivity() {

    lateinit var binding: ActivityOnBoardingBinding
    var itemList = mutableListOf<Item>()

    lateinit var adapter: IntroPagerAdapter
    var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        itemList.add(
            Item(
                R.drawable.on1,
                "Our service makes easy for you to work anywhare.",
                "Looking for Item"
            )
        )
        itemList.add(
            Item(
                R.drawable.on2,
                "Easy and relatable payment methods available.",
                "Make a Payment"
            )
        )
        itemList.add(Item(R.drawable.on3, "Also delivery service is flexible.", "Send item"))


        adapter = IntroPagerAdapter(this, itemList)
        binding.viewPager.adapter = adapter
        updateIndicator(0)


        binding.tvSkip.setOnClickListener {
            updateIntro()
            //startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        binding.ivNext.setOnClickListener {
            if (index != adapter.count - 1) {
                index++
                binding.viewPager.currentItem = index
            } else {
                updateIntro()
                //startActivity(Intent(this,LoginActivity::class.java))
                finish()
            }
        }

        binding.ivBack.setOnClickListener {
            if (index > 0) {
                index--
                binding.viewPager.currentItem = index
            }
        }



        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                index = position
                if (index == adapter.count - 1) {
                    binding.ivNext.setImageResource(R.drawable.finish)
                } else {
                    binding.ivNext.setImageResource(R.drawable.next)
                }

                if (index == 0) {
                    binding.ivBack.visibility = View.INVISIBLE
                    binding.ivBack.isClickable = false
                } else {
                    binding.ivBack.visibility = View.VISIBLE
                    binding.ivBack.isClickable = true
                }

                updateIndicator(index)

            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })

    }

    private fun updateIntro() {
        var prefManager = PrefManager(this)
        prefManager.setIntroStatus(true)
        startActivity(Intent(this, HomeActivity::class.java))

    }


    private fun updateIndicator(index: Int) {


        binding.layoutDots.removeAllViews()

        val dots = arrayOfNulls<ImageView>(adapter.count)

        for (i in dots.indices) {
            dots[i] = ImageView(this)
            dots[i]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.inactive_dots))
            var param = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            param.setMargins(8, 0, 8, 0)
            binding.layoutDots.addView(dots[i], param)

            if (i == index)
                dots[i]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dots))
        }

    }

}