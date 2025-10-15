package com.vantari.questarlauncher

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Load URL from resources. Change default_url in res/values/strings.xml
        val url = getString(R.string.default_url)

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        // Prefer Oculus Browser if present
        intent.setPackage("com.oculus.browser")

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Fallback to any browser
            intent.setPackage(null)
            startActivity(intent)
        }

        // Close this launcher activity so user lands in browser only
        finish()
    }
}
