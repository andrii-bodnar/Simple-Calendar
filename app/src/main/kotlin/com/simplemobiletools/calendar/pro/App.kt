package com.simplemobiletools.calendar.pro

import androidx.multidex.MultiDexApplication
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import com.simplemobiletools.commons.extensions.checkUseEnglish

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()

        checkUseEnglish()

        Crowdin.init(
            applicationContext,
            CrowdinConfig.Builder()
                .withDistributionHash("2f1ba0f58f6e7146fa8e9b7uo3a")
                .build()
        )
    }
}
