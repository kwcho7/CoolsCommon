package kr.co.cools.common.logger

import android.util.Log
import timber.log.Timber

class Logger {

    companion object {
        fun init(isDebug: Boolean, tag: String = "Cools"){
            if(isDebug){
                Timber.plant(object: Timber.DebugTree(){
                    var prefix = "[$tag] "
                    /**
                     * add lineNumber
                     */
                    override fun createStackElementTag(element: StackTraceElement): String? {
                        return super.createStackElementTag(element).plus("(").plus(element.lineNumber).plus(")")
                    }

                    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                        super.log(priority, tag, prefix.plus(message), t)
                    }

                })
            }
        }

        fun v(message: String){
            Timber.v(message)
        }

        fun d(message: String){
            Timber.d(message)
        }

        fun i(message: String){
            Timber.i(message)
        }

        fun w(message: String){
            Timber.w(message)
        }

        fun w(throwable: Throwable){
            Timber.w(Log.getStackTraceString(throwable))
        }

        fun e(message: String){
            Timber.e(message)
        }

        fun e(throwable: Throwable){
            Timber.e(Log.getStackTraceString(throwable))
        }
    }
}