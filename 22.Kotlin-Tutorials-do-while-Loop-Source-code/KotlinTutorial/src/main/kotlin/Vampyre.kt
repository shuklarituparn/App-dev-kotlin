/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */
open class Vampyre(name: String) : Enemy(name, 20, 3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}