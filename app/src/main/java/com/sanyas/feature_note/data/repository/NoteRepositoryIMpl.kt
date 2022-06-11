package com.sanyas.feature_note.data.repository

import com.sanyas.feature_note.data.data_source.NoteDao
import com.sanyas.feature_note.domain.model.Note
import com.sanyas.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryIMpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return  dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return  dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNotes(note: Note) {
        dao.deleteNote(note)
    }
}