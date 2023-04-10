fun main(args: Array<String>) {
    val tim = Player("Tim")
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val gr8 = Player("gr8", 4, 8)
    val one2watch = Player("Ace",2, 5, 1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    tim.weapon = Weapon("Sword", 10)
//    println(tim.weapon.name)
    tim.show()

    louise.weapon = tim.weapon
    louise.show()

    tim.weapon = Weapon("Spear", 14)
//    println(tim.weapon.name)
    tim.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    tim.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    tim.getLoot(chestArmor)
    tim.showInventory()

    tim.getLoot((Loot("Ring of Protection +2", LootType.RING, 40.25)))
    tim.getLoot((Loot("Invisibility Potion", LootType.POTION, 35.95)))
    tim.showInventory()

    if (tim.dropLoot(redPotion)) {
        tim.showInventory()
    } else {
        println("you don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if (tim.dropLoot(bluePotion)) {
        tim.showInventory()
    } else {
        println("You don't have ${bluePotion.name}")
    }

    if (tim.dropLoot("Invisibility Potion")) {
        tim.showInventory()
    } else {
        println("You don't have an Invisibility Potion")
    }

}