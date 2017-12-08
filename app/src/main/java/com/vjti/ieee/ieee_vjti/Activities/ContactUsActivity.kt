package com.vjti.ieee.ieee_vjti.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.text.TextUtils
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.vjti.ieee.ieee_vjti.R

class ContactUsActivity : AppCompatActivity() {

    var inputName: EditText? = null
    var inputEmail: EditText? = null
    var inputSubject: EditText? = null
    var inputMessage: EditText? = null
    var inputLayoutName: TextInputLayout? = null
    var inputLayoutEmail: TextInputLayout? = null
    var inputLayoutSubject: TextInputLayout? = null
    var inputLayoutMessage: TextInputLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_contact_us)

        inputName = findViewById<EditText>(R.id.input_name) as EditText
        inputEmail = findViewById<EditText>(R.id.input_email) as EditText
        inputSubject = findViewById<EditText>(R.id.input_subject) as EditText
        inputMessage = findViewById<EditText>(R.id.input_message) as EditText
        inputLayoutName = findViewById<TextInputLayout>(R.id.name_layout) as TextInputLayout
        inputLayoutEmail = findViewById<TextInputLayout>(R.id.email_layout) as TextInputLayout
        inputLayoutSubject = findViewById<TextInputLayout>(R.id.subject_layout) as TextInputLayout
        inputLayoutMessage = findViewById<TextInputLayout>(R.id.message_layout) as TextInputLayout
        val submitButton : Button = findViewById(R.id.submitButton)
    }

    public fun sendMessage(viwe : View) {
        if(!validateName()) return
        if(!validateEmail()) return
        if(!validateSubject()) return
        if(!validateMesage()) return
        //code to send data to email ids
        //1)harsh.kokane13@gmail.com
        //2)shivani.a.972@gmail.com
        val name = inputName!!.text.toString()
        val subject = inputSubject!!.text.toString() + "(sent from app)"
        val message = "Name of sender : " + name + "\n" + inputMessage!!.text.toString()
        val emailIntent = Intent(Intent.ACTION_SEND)
        try {
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("harsh.kokane13@gmail.com", "shivani.a.972@gmail.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
            emailIntent.putExtra(Intent.EXTRA_TEXT, message)
            emailIntent.setType("message/rfc822")
            startActivity(Intent.createChooser(emailIntent, "Choose an Email client"))
        }catch (e : Exception){
            Toast.makeText(this, "Failed to send Email", Toast.LENGTH_SHORT).show();
        }
    }

    private fun validateMesage(): Boolean {
        if(inputMessage!!.text.toString().trim().isEmpty()){
            inputLayoutMessage!!.error = "Message cannot be left blank"
            requestFocus(inputMessage!!)
            return false
        }else{
            inputLayoutMessage!!.setErrorEnabled(false)
        }
        return true
    }

    private fun validateSubject(): Boolean {
        if(inputSubject!!.text.toString().trim().isEmpty()){
            inputLayoutSubject!!.error = "Subject cannot be left blank"
            requestFocus(inputSubject!!)
            return false
        }else{
            inputLayoutSubject!!.setErrorEnabled(false)
        }
        return true
    }

    private fun validateEmail(): Boolean {
        val email = inputEmail!!.text.toString().trim()
        if(email.isEmpty()){
            inputLayoutEmail!!.error = "Email Id field cannot be left blank"
            requestFocus(inputEmail!!)
            return false
        }else{
            inputLayoutEmail!!.setErrorEnabled(false)
        }
        if(!isValidEmail(email)){
            inputLayoutEmail!!.error = "Email Id is incorrect"
            requestFocus(inputEmail!!)
            return false
        }else{
            inputLayoutEmail!!.setErrorEnabled(false)
        }
        return true
    }

    private fun isValidEmail(email: String): Boolean = !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    private fun validateName(): Boolean{
        if(inputName!!.text.toString().trim().isEmpty()){
            inputLayoutName!!.error = "Name field cannot be left blank"
            requestFocus(inputName!!)
            return false
        }else{
            inputLayoutName!!.setErrorEnabled(false)
        }
        return true
    }

    private fun requestFocus(view : View) {
        if(view.requestFocus()){
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}
