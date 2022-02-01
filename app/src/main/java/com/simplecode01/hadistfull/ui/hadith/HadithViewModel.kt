package com.simplecode01.hadistfull.ui.hadith

import androidx.lifecycle.ViewModel

class HadithViewModel : ViewModel() {
    var judul: String = ""
    var id: Int = 0
    var endpoint: String = ""
    var count: Int = 0
    var coverBook: String = ""
}