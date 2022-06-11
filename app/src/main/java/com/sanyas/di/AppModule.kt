package com.sanyas.di

import android.app.Application
import androidx.room.Room
import com.sanyas.feature_note.data.data_source.NoteDatabase
import com.sanyas.feature_note.data.repository.NoteRepositoryIMpl
import com.sanyas.feature_note.domain.repository.NoteRepository
import com.sanyas.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application): NoteDatabase {
       return Room.databaseBuilder(
           app,
           NoteDatabase::class.java,
           NoteDatabase.DATABASE_NAME
       ).build()
    }

    @Provides
    @Singleton
    fun providesNoteRepository(db:NoteDatabase):NoteRepository{
        return NoteRepositoryIMpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository):NoteUseCases{
        return  NoteUseCases(
            getNoteUseCases = GetNotesUseCase(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}