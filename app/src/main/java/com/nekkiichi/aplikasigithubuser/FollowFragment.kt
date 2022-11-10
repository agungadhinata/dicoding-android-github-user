package com.nekkiichi.aplikasigithubuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.nekkiichi.aplikasigithubuser.datas.models.DetailViewModel
import com.nekkiichi.aplikasigithubuser.datas.models.MainViewModel

class FollowFragment : Fragment() {
    private var username: String? = null
    private var isFollower = false
    private val viewModel: DetailViewModel by activityViewModels()
    companion object {
        val USERNAME = "username"
        val IS_FOLLOWER = "is_follower"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            username = it.getString(USERNAME)
            isFollower = it.getBoolean(IS_FOLLOWER)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_follow, container, false)
    }
}