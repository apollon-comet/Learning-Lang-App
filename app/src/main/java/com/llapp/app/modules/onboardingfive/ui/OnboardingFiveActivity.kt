package com.llapp.app.modules.onboardingfive.ui

import androidx.activity.viewModels
import com.llapp.app.R
import com.llapp.app.appcomponents.base.BaseActivity
import com.llapp.app.databinding.ActivityOnboardingFiveBinding
import com.llapp.app.modules.onboardingfive.`data`.viewmodel.OnboardingFiveVM
import kotlin.String
import kotlin.Unit

class OnboardingFiveActivity :
    BaseActivity<ActivityOnboardingFiveBinding>(R.layout.activity_onboarding_five) {
  private val viewModel: OnboardingFiveVM by viewModels<OnboardingFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_FIVE_ACTIVITY"

  }
}
