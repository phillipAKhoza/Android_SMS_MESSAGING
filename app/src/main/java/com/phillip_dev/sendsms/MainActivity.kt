package com.phillip_dev.sendsms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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

    }
}