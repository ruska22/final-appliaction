package com.example.finalapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Button
import androidx.core.view.setPadding
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    lateinit var Listview: ListView
    val Proverbs = listOf(
        "გველსა ხვრელით ამოიყვან ენა ტკბილად მოუბარი",
        "ბრმას ცოლი მოუკვდა - როგორ გავაგებინოთო? - გვერდს რომ აღარ მოუწვება, ხომ გაიგებსო",
        "კარგ მთქმელს კარგი გამგონეც უნდა",
        "კატას თევზი უყვარდა, მაგრამ ფეხის დასველება ეზარებოდაო",
        "მოთმინებითა შენითა მოიპოვე სული შენი"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Listview = findViewById(R.id.andazebi_listview)
        Listview.adapter = MyAdapter(this, Proverbs)

        Listview.setOnItemClickListener { _, _, position, _ ->
            //  Toast.makeText(this, Proverbs[position])

        if(position == 0){
            val intent = Intent(this, shinaarsi1::class.java)
            startActivity(intent)
        }
            else if(position == 1){
            val intent = Intent(this, shinaarsi2::class.java)
            startActivity(intent)
        }
            else if(position == 2){
            val intent = Intent(this, shinaarsi3::class.java)
            startActivity(intent)
        }
            else if(position == 3){
            val intent = Intent(this, shinaarsi4::class.java)
            startActivity(intent)
        }
            else if(position == 4){
            val intent = Intent(this, shinaarsi5::class.java)
            startActivity(intent)
        }







    }




    }


    class MyAdapter(private val mContext: Context, private val dataSource: List<String>) :
        BaseAdapter() {
        override fun getCount(): Int {
            return dataSource.size
            TODO("Not yet implemented")
        }

        override fun getItem(position: Int): Any {
            return dataSource[position]
            TODO("Not yet implemented")
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
            TODO("Not yet implemented")
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = dataSource[position]
            textView.setPadding(100);
            return textView
            TODO("Not yet implemented")
        }

    }
}









