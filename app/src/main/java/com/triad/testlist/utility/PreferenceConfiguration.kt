package com.triad.testlist.utility

import com.triad.testlist.R
import com.triad.testlist.app.App
import com.triad.testlist.utility.UtilityMethods.decrypt
import com.triad.testlist.utility.UtilityMethods.encrypt

object PreferenceConfiguration {

    private var sharedPreferences = App.instance?.getSharedPreferences(
        App.instance?.getResources()?.getString(R.string.app_name), 0
    )


    fun getPreference(key: String): String {
        if (sharedPreferences == null) {
            sharedPreferences =
                App.instance?.getSharedPreferences(
                    App.instance!!.getResources().getString(R.string.app_name), 0
                )
        }
        val temp = sharedPreferences!!.getString(key, "")
        return if (temp !== "") {
            decrypt(temp)
        } else {
            ""
        }
    }

    fun setPreference(key: String, value: String?) {
        if (value !== "")
            sharedPreferences!!.edit().putString(key, encrypt(value)).apply()
    }
}