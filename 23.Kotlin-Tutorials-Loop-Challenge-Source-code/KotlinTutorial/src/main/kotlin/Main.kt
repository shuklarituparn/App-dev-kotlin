fun main(args: Array<String>) {


    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
//    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    val dropped = conan.dropLoot("Something not present")
    println(dropped)

    println(conan.dropLoot("Something else"))

    if (conan.dropLoot("A bit of junk")) {
        println("junk dropped")
    } else {
        println("You don't have any junk")
    }
}