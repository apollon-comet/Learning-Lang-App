package com.llapp.app.modules.signupone.`data`.model

import com.llapp.app.R
import com.llapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignupOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleted110: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseaPasswo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_a_passwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyyoumem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_you_mem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldOneValue: String? = null
)
