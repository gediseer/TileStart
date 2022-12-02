package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.telephony.SubscriptionManager
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class StartUpActivity : Activity() {
    @SuppressLint("MissingPermission")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        initChannel();
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, SecActivity::class.java))
        finish()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initChannel() {
        val channel = NotificationChannel(
            "HIGH_PRIORITY_CHANNEL_ID",
            "mmx_agent_notification_high_priority_channel_name",
            NotificationManager.IMPORTANCE_HIGH
        )
        channel.description = "mmx_agent_notification_high_priority_channel_description"
        channel.enableVibration(true)
        (getSystemService(NOTIFICATION_SERVICE) as NotificationManager).createNotificationChannel(channel)
    }
}