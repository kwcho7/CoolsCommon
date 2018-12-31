package kr.co.cools.coolscommon

import android.app.Application
import kr.co.cools.common.logger.Logger

class CoolsApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Logger.init(BuildConfig.DEBUG, "Common")
    }
}