package com.nbd.recyclercrunchy

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbd.recyclercrunchy.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideosCrunchy: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\":\"Dragon Ball\", \"kind\":\"Series\", \"language\":\"Doblado\"}")

            )
        binding.rvVideoEntries.adapter=MainAdapter(fakeVideosCrunchy)
    }
}