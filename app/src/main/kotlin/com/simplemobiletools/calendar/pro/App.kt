package com.simplemobiletools.calendar.pro

import androidx.multidex.MultiDexApplication
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import com.crowdin.platform.data.model.AuthConfig
import com.simplemobiletools.commons.extensions.checkUseEnglish

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()

        checkUseEnglish()

        Crowdin.init(
            applicationContext,
            CrowdinConfig.Builder()
                .withDistributionHash("fa60deb9013a60a5c06a4e7uo3a")
                .withRealTimeUpdates()
                .withScreenshotEnabled()
                .withSourceLanguage("en")
                .withAuthConfig(AuthConfig("0ruUVVPqDpcCQ9Jhq4s4", "1iSSDxtVRJl22rE08OoPp1HMpp0fbVf6yKzjdsFt"))
                .build()
        )

        Crowdin.registerScreenShotContentObserver(this)
    }
}
