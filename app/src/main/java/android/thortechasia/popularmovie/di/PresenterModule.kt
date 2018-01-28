package android.thortechasia.popularmovie.di

import android.thortechasia.popularmovie.ui.detail.DetailPresenter
import android.thortechasia.popularmovie.ui.movie.MoviePresenter
import org.koin.dsl.module.module

val presenterModule = module {

    factory { MoviePresenter(get()) }

    factory { DetailPresenter(get()) }
}