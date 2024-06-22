package dev.rhcehd123.feature.gachahistory

import android.icu.text.SimpleDateFormat
import java.util.Locale

object Utils {
    private val inputDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.KOREA)
    private val outputDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA)
    fun String.formatDate(): String {
        try {
            val temp = inputDateFormat.parse(this)
            return outputDateFormat.format(temp)
        } catch (e: Exception) {
            return this
        }
    }
}