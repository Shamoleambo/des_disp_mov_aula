package aula_02.my_stuff.model.heranca

import java.time.LocalDateTime

open class Todo() {

    var noteText: String = ""
    var status: Boolean = false
    lateinit var date: LocalDateTime

    constructor(noteText: String, status: Boolean) : this() {
        this.noteText = noteText
        this.status = status
        this.date = LocalDateTime.now()
    }

    override fun toString(): String {
        return "Note: $noteText"
    }
}