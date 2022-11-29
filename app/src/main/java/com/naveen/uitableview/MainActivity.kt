package com.naveen.uitableview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.inflate
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import com.naveen.uitableview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val titles: ArrayList<String> = ArrayList(0)

        for (i in 1..20) {
            titles.add("Title $i")
        }

        val uiTableView: UITableView = binding.root.findViewWithTag(getString(R.string.app_name))
        val mAdapter = RowAdapter(titles)
        uiTableView.adapter = mAdapter
    }
}