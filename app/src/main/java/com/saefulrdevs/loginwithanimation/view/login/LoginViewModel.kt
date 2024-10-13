package com.saefulrdevs.loginwithanimation.view.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saefulrdevs.loginwithanimation.data.UserRepository
import com.saefulrdevs.loginwithanimation.data.pref.UserModel
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: UserRepository) : ViewModel() {
    fun saveSession(user: UserModel) {
        viewModelScope.launch {
            repository.saveSession(user)
        }
    }
}