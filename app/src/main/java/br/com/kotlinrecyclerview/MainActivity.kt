package br.com.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.kotlinrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var liveAdapter: LiverAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.liveAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {
        this.liveAdapter = LiverAdapter()
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = liveAdapter
    }
}
