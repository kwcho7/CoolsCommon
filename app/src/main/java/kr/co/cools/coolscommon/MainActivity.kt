package kr.co.cools.coolscommon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kr.co.cools.common.logger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.v("onCreate")
    }
}
