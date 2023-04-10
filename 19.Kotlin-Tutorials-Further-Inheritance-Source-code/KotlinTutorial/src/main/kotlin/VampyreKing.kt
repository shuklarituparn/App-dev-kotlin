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
}