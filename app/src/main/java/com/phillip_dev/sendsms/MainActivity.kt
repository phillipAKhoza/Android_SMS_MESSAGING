package com.phillip_dev.sendsms

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var message : EditText
    lateinit var phone: EditText
    lateinit var send: Button
    var userMessage = ""
    var userNumber = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.editTxtMessage)
        phone = findViewById(R.id.editTxtPhoneNum)
        send = findViewById(R.id.btnSend)

        send.setOnClickListener {
            userMessage= message.text.toString()
            userNumber = phone.text.toString()
            sendSMS(userMessage,userNumber)
        }
    }

    fun sendSMS(userMessage: String, userPhone: String){

        if(ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS),1)
        }else{

        }

    }
}