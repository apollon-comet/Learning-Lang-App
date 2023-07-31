package com.llapp.app.modules.signupone.ui

import androidx.activity.viewModels
import com.llapp.app.R
import com.llapp.app.appcomponents.base.BaseActivity
import com.llapp.app.databinding.ActivitySignupOneBinding
import com.llapp.app.modules.signupone.`data`.viewmodel.SignupOneVM
import kotlin.String
import kotlin.Unit

class SignupOneActivity : BaseActivity<ActivitySignupOneBinding>(R.layout.activity_signup_one) {
  private val viewModel: SignupOneVM by viewModels<SignupOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGNUP_ONE_ACTIVITY"

  }
}
