package gencana.com.android.data.di

import dagger.Module

/**
 * Created by Gen Cana on 20/10/2018
 */

@Module(includes = [NetworkModule::class, RepositoryModule::class])
class DataModule