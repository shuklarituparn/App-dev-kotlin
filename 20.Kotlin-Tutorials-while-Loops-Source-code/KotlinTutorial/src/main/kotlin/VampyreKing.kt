import java.util.*

/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */
class VampyreKing(name: String) : Vampyre(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives <2
    }

    fun dodges(): Boolean {
        val rand = Random()
        val chance = rand.nextInt(6)
        if (chance > 3) {
            println("Dracula dodges")
            return true
        }
        return false
    }
}