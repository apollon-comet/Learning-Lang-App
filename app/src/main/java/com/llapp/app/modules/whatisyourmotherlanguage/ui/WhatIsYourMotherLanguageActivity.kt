package com.llapp.app.modules.whatisyourmotherlanguage.ui

import androidx.activity.viewModels
import com.llapp.app.R
import com.llapp.app.appcomponents.base.BaseActivity
import com.llapp.app.databinding.ActivityWhatIsYourMotherLanguageBinding
import com.llapp.app.modules.whatisyourmotherlanguage.`data`.viewmodel.WhatIsYourMotherLanguageVM
import kotlin.String
import kotlin.Unit

class WhatIsYourMotherLanguageActivity :
    BaseActivity<ActivityWhatIsYourMotherLanguageBinding>(R.layout.activity_what_is_your_mother_language)
    {
  private val viewModel: WhatIsYourMotherLanguageVM by viewModels<WhatIsYourMotherLanguageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.whatIsYourMotherLanguageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WHAT_IS_YOUR_MOTHER_LANGUAGE_ACTIVITY"

  }
}
