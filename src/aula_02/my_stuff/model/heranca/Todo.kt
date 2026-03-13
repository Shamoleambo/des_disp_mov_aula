package aula_02.my_stuff.model.heranca

import java.time.LocalDateTime

class Todo {

    var noteText: String = ""
    var status: Boolean = false
    lateinit var date: LocalDateTime

    override fun toString(): String {
        return "Note: $noteText"
    }
}