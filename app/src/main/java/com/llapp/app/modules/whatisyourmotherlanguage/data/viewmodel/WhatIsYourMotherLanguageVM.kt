package com.llapp.app.modules.whatisyourmotherlanguage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.llapp.app.modules.whatisyourmotherlanguage.`data`.model.WhatIsYourMotherLanguageModel
import org.koin.core.KoinComponent

class WhatIsYourMotherLanguageVM : ViewModel(), KoinComponent {
  val whatIsYourMotherLanguageModel: MutableLiveData<WhatIsYourMotherLanguageModel> =
      MutableLiveData(WhatIsYourMotherLanguageModel())

  var navArguments: Bundle? = null
}
