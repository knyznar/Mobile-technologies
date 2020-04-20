package com.example.android_course_lab4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var myDataset: Array<ListElement> = arrayOf<ListElement>(
        ListElement("Email", android.R.drawable.ic_dialog_email),
        ListElement("Info", android.R.drawable.ic_dialog_info),
        ListElement("Delete", android.R.drawable.ic_delete),
        ListElement("Dialer", android.R.drawable.ic_dialog_dialer),
        ListElement("Alert", android.R.drawable.ic_dialog_alert),
        ListElement("Map", android.R.drawable.ic_dialog_map),
        ListElement("Map", R.drawable.ic_extension_24dp),
        ListElement("Email", R.drawable.ic_android_black_24dp),
        ListElement("Info", android.R.drawable.arrow_up_float),
        ListElement("Delete", android.R.drawable.arrow_down_float),
        ListElement("Dialer", R.drawable.ic_network_wifi_black_24dp),
        ListElement("Alert", android.R.drawable.ic_menu_report_image)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myDataset)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}
