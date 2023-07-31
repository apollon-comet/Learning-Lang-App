package com.llapp.app.modules.onboardingsix.ui

import androidx.activity.viewModels
import com.llapp.app.R
import com.llapp.app.appcomponents.base.BaseActivity
import com.llapp.app.databinding.ActivityOnboardingSixBinding
import com.llapp.app.modules.onboardingsix.`data`.viewmodel.OnboardingSixVM
import kotlin.String
import kotlin.Unit

class OnboardingSixActivity :
    BaseActivity<ActivityOnboardingSixBinding>(R.layout.activity_onboarding_six) {
  private val viewModel: OnboardingSixVM by viewModels<OnboardingSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_SIX_ACTIVITY"

  }
}
