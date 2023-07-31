package com.llapp.app.modules.onboardingseven.`data`.model

import com.llapp.app.R
import com.llapp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfidenceiny: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confidence_in_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWithconversati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_with_conversati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyafillo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_a_fillo)

)
