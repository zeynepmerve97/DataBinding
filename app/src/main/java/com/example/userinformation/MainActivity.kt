package com.example.userinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.userinformation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var customData: CustomData

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)




        binding.btnSave.setOnClickListener {

            if(binding.editAge.text.toString() == ""){
                customData = CustomData(
                    binding.editName.text.toString(),
                    0,
                    binding.switchButton.isChecked,


                    )
            }else{
                customData = CustomData(
                    binding.editName.text.toString(),
                    binding.editAge.text.toString().toInt(),
                    binding.switchButton.isChecked,


                    )
            }




            if (customData.name!!.isEmpty() || customData.age==0){

                Toast.makeText(this,"Please enter your information", Toast.LENGTH_LONG).show()

            } else {


                val intent = Intent(this,InformationActivity::class.java)
                intent.putExtra(DATA_SEND,customData)
                startActivity(intent)
                finish()
            }
            }
        }



}







