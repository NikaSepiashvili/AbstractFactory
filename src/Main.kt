import kotlin.*

fun main() {
    val factory : CarFactory = Carr.Factory
    val audi = factory.create("Audi")
    val maserati = factory.create("Maserati")

    audi?.drive()
    maserati?.drive()

    val factory1 : AircraftFactory = Aircraftt.Factory
    val boeing737 = factory1.create("Boeing737")
    val boeing777 = factory1.create("Boeing777")

    boeing737?.fly()
    boeing777?.fly()
}