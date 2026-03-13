package aula_02.my_stuff.model.heranca

import java.time.LocalDateTime

open class Todo(val noteText: String, val status: Boolean, val date: LocalDateTime) {

    init {
        println("Init the Todo class")
    }

    override fun toString(): String {
        return "Note: $noteText"
    }
}