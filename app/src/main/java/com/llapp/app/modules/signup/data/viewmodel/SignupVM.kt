package com.llapp.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llapp.app.modules.signup.`data`.model.SignupModel
import org.koin.core.KoinComponent

class SignupVM : ViewModel(), KoinComponent {
  val signupModel: MutableLiveData<SignupModel> = MutableLiveData(SignupModel())

  var navArguments: Bundle? = null
}
