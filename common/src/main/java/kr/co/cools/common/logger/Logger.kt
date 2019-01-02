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
                        val exception = Throwable()
                        if(exception.stackTrace.size > 7){
                            val stringBuffer = StringBuffer()
                            val stackElements = exception.stackTrace[7]
                            stringBuffer
                                .append(stackElements.fileName)
                                .append("(").append(stackElements.lineNumber)
                                .append(")")

                            return stringBuffer.toString()
                        }
                        else {
                            return super.createStackElementTag(element)
                        }
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