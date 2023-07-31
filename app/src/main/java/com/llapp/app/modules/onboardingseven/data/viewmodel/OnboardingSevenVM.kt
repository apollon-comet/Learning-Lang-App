package com.llapp.app.modules.onboardingseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llapp.app.modules.onboardingseven.`data`.model.OnboardingSevenModel
import org.koin.core.KoinComponent

class OnboardingSevenVM : ViewModel(), KoinComponent {
  val onboardingSevenModel: MutableLiveData<OnboardingSevenModel> =
      MutableLiveData(OnboardingSevenModel())

  var navArguments: Bundle? = null
}
