package aula_02.my_stuff.model

import java.time.LocalDateTime

class TodoNote() {

    var noteText: String = ""
    var status: Boolean = false
    lateinit var date: LocalDateTime

    constructor(noteText: String, status: Boolean) : this() {
        this.noteText = noteText
        this.status = status
        this.date = LocalDateTime.now();
    }

    
}