/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */

enum class LootType {
    POTION, RING, ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): String {
        return "$name is $type and is worth $value"
    }
}