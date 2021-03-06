package com.sanyas.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sanyas.ui.theme.BabyBlue
import com.sanyas.ui.theme.LightGreen
import com.sanyas.ui.theme.RedOrange
import com.sanyas.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color:Int,
    @PrimaryKey val id:Int? = null
) {
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue)
    }

}
class InvalidNoteException(message:String):Exception(message)
