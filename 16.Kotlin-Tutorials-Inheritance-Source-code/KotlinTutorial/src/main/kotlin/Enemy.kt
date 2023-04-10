/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */
open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives -= 1
            println("$name lost a life")
        }
    }
}

// lives = lives + 8        lives += 8
// lives = lives - damage   lives -= damage
// lives = lives * 10       lives *= 10
// lives = lives / 3        lives /= 3
// lives = lives % 2        lives %= 2