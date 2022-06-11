package com.sanyas.feature_note.domain.use_case

data class NoteUseCases(
    val getNoteUseCases: GetNotesUseCase,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote:GetNote
)