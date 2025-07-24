package com.ukesh.mynoteapp.data.models.ui_states

import com.ukesh.mynoteapp.data.models.NotesModel
import com.ukesh.mynoteapp.data.repository.Resources

data class HomeUiState(
    val notesData: Resources<List<NotesModel>> = Resources.Loading(),
    val notesDeletedStatus: Boolean = false
)
