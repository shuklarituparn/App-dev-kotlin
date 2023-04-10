/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */
class Weapon(val name: String, var damageInflicted: Int) {

    override fun toString(): String {
        return "$name inflicts $damageInflicted points of damage"
    }

}