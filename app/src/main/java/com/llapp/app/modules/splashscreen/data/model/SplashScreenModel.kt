package com.llapp.app.modules.splashscreen.`data`.model

import com.llapp.app.R
import com.llapp.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageApp: String? = MyApp.getInstance().resources.getString(R.string.lbl_language_app)

)
