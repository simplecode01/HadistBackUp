package com.simplecode01.hadistfull.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.muslimdeveloper.sabilulkhayralibana.ui.common.Resource
import com.simplecode01.hadistfull.api.data.HadithRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val hadithRepository: HadithRepository) : ViewModel(){
    suspend fun getHadiths(book: String, id: Int) = hadithRepository.getHadist(book, id)

    fun getInfo(book:String, id: Int) = liveData {
        emit(Resource.loading(null))
        try{
            emit(Resource.success(hadithRepository.getHadist(book, id)))
        }catch (e: Exception){
            emit(Resource.error(data = null, message = e.message?: "Gagal memuat data"))
        }
    }
}

