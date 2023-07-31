package com.llapp.app.modules.onboardingseven.ui

import androidx.activity.viewModels
import com.llapp.app.R
import com.llapp.app.appcomponents.base.BaseActivity
import com.llapp.app.databinding.ActivityOnboardingSevenBinding
import com.llapp.app.modules.onboardingseven.`data`.viewmodel.OnboardingSevenVM
import kotlin.String
import kotlin.Unit

class OnboardingSevenActivity :
    BaseActivity<ActivityOnboardingSevenBinding>(R.layout.activity_onboarding_seven) {
  private val viewModel: OnboardingSevenVM by viewModels<OnboardingSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_SEVEN_ACTIVITY"

  }
}
