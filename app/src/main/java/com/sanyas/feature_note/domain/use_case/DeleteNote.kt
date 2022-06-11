package com.sanyas.feature_note.domain.use_case

import com.sanyas.feature_note.domain.model.Note
import com.sanyas.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNotes(note)
    }
}