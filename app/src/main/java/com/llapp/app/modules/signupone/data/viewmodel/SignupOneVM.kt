package com.llapp.app.modules.signupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llapp.app.modules.signupone.`data`.model.SignupOneModel
import org.koin.core.KoinComponent

class SignupOneVM : ViewModel(), KoinComponent {
  val signupOneModel: MutableLiveData<SignupOneModel> = MutableLiveData(SignupOneModel())

  var navArguments: Bundle? = null
}
