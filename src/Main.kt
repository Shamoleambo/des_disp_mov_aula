import aula_02.my_stuff.model.heranca.Todo
import aula_02.my_stuff.model.heranca.TodoDifficulty
import java.time.LocalDateTime

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val todo = Todo("texto", false, LocalDateTime.now().plusDays(1))
    println(todo.toString())

    val todoWithDifficulty = TodoDifficulty("texto 2", false, LocalDateTime.now(), false)
    println(todoWithDifficulty.toString())
}