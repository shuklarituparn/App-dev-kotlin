/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */
class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)

    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            """)
    }
}