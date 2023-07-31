package com.llapp.app.modules.onboardingfive.`data`.model

import com.llapp.app.R
import com.llapp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThelessonsyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_lessons_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsingavariety: String? =
      MyApp.getInstance().resources.getString(R.string.msg_using_a_variety)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyafillo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_a_fillo)

)
