package com.sanyas.feature_note.presentation.notes

import com.sanyas.feature_note.domain.model.Note
import com.sanyas.feature_note.domain.util.NoteOrder
import com.sanyas.feature_note.domain.util.OrderType

class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder:NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean= false
) {
}