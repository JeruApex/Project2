package com.example.Project2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Project2.network.DogImage
import com.example.Project2.network.DogImageApi
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {

    private val _currentlyDisplayedImage = MutableLiveData<DogImage>()
    val currentlyDisplayedImage: LiveData<DogImage> = _currentlyDisplayedImage

    init {
        getNewDog()
    }

    fun getNewDog(){
        viewModelScope.launch{
            _currentlyDisplayedImage.value = DogImageApi.retrofitService.getRandomDogImage()
        }
    }
}