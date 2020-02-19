package net.custom.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.custom.simpletoast.MySimpleToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MySimpleToast.toast(this,"sunilkumar")
    }
}
