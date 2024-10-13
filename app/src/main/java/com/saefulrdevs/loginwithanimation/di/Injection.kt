package com.saefulrdevs.loginwithanimation.di

import android.content.Context
import com.saefulrdevs.loginwithanimation.data.UserRepository
import com.saefulrdevs.loginwithanimation.data.pref.UserPreference
import com.saefulrdevs.loginwithanimation.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}