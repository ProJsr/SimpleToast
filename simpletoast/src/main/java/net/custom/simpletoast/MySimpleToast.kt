package net.custom.simpletoast

import android.content.Context
import android.widget.Toast

class MySimpleToast {
    companion object{
        fun toast(context: Context,ab:String){
            Toast.makeText(context,ab,Toast.LENGTH_LONG).show()
        }
    }

}