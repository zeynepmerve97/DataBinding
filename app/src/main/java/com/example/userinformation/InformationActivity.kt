package com.example.userinformation



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.userinformation.databinding.ActivityInformationBinding


class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        var customData: CustomData? = null
        val binding: ActivityInformationBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_information)



        customData = intent.extras?.getSerializable(DATA_SEND) as CustomData

        val checkmark = "https://cdn2.iconfinder.com/data/icons/funtime-objects-part-2/60/005_056_okay_approve_check_test_good_vote-1024.png"
        val cancel = "https://cdn2.iconfinder.com/data/icons/funtime-objects-part-2/60/005_055_delete_cross_close_cancel_exit_vote-512.png"
        if (customData.isApproved == true) {
            binding.customView.bindData(
                customData.name.toString(),
                customData.age.toString(),
                checkmark
            )
        } else {
            binding.customView.bindData(
                customData.name.toString(),
                customData.age.toString(),
                cancel
            )
        }


    }

}




