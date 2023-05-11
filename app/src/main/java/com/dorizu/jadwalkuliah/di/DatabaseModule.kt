package com.dorizu.jadwalkuliah.di

import android.content.Context
import androidx.room.Room
import com.dorizu.jadwalkuliah.data.source.local.room.ScheduleDao
import com.dorizu.jadwalkuliah.data.source.local.room.ScheduleDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): ScheduleDatabase{
        val passphrase: ByteArray = SQLiteDatabase.getBytes("schedule".toCharArray())
        val factory = SupportFactory(passphrase)
        return Room.databaseBuilder(
            context,
            ScheduleDatabase::class.java,
            "Schedule.db"
        ).fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }

    @Provides
    fun provideScheduleDao(database: ScheduleDatabase): ScheduleDao = database.scheduleDao()
}