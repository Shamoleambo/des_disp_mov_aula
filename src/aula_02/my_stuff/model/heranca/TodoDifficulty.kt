package aula_02.my_stuff.model.heranca

import java.time.LocalDateTime

class TodoDifficulty(noteText: String, status: Boolean, date: LocalDateTime, val isTaskHard: Boolean) :
    Todo(noteText, status, date) {

    override fun toString(): String {
        return "Note:\n\t$noteText\n\t$status\n\t$date\n\t$isTaskHard"
    }

}