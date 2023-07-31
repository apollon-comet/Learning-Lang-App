package com.llapp.app.modules.onboardingfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llapp.app.modules.onboardingfive.`data`.model.OnboardingFiveModel
import org.koin.core.KoinComponent

class OnboardingFiveVM : ViewModel(), KoinComponent {
  val onboardingFiveModel: MutableLiveData<OnboardingFiveModel> =
      MutableLiveData(OnboardingFiveModel())

  var navArguments: Bundle? = null
}
