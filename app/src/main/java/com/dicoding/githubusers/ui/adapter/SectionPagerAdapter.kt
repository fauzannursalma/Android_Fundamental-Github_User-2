package com.dicoding.githubusers.ui.adapter

import android.content.Context
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dicoding.githubusers.R
import com.dicoding.githubusers.ui.FollowersFragment
import com.dicoding.githubusers.ui.FollowingFragment

class SectionPagerAdapter(
    private val context: Context,
    fragmentManager: FragmentManager,
    data: Bundle
) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var fragmentBundle: Bundle = data


    @StringRes
    private val TABLAYOUT_TITLES = intArrayOf(R.string.tab_1, R.string.tab_2)
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = FollowersFragment()
            1 -> fragment = FollowingFragment()
        }

        fragment?.arguments = this.fragmentBundle
        return fragment as Fragment

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TABLAYOUT_TITLES[position])
    }
}