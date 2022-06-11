package com.sanyas.feature_note.domain.repository

import com.sanyas.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
  // every time there is change in the Note table, a new list is emitted with the new items in the database
    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNotes(note: Note)
}