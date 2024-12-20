package com.example.cryptoapp.di

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.presentation.CoinViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModuleKey(CoinViewModel::class)
    @Binds
    fun bindCoinViewModel(viewModel: CoinViewModel): ViewModel
}