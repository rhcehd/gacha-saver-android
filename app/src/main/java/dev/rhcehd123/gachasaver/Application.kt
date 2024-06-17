package dev.rhcehd123.gachasaver

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        //PlayGamesSdk.initialize(this)
    }
}