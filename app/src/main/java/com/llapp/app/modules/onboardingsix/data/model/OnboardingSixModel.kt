package com.llapp.app.modules.onboardingsix.`data`.model

import com.llapp.app.R
import com.llapp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeyourtime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_your_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDevelopahabit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_develop_a_habit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyafillo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_a_fillo)

)
