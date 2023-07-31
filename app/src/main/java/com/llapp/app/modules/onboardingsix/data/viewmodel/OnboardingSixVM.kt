package com.llapp.app.modules.onboardingsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llapp.app.modules.onboardingsix.`data`.model.OnboardingSixModel
import org.koin.core.KoinComponent

class OnboardingSixVM : ViewModel(), KoinComponent {
  val onboardingSixModel: MutableLiveData<OnboardingSixModel> =
      MutableLiveData(OnboardingSixModel())

  var navArguments: Bundle? = null
}
