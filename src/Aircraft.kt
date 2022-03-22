interface Aircraft {
    fun fly()
}

class Aircraftt {
    companion object Factory : AircraftFactory() {
        override fun create(type: String): Aircraft? {
            return when (type) {
                "Boeing737" -> Boeing737()
                "Boeing777" -> Boeing777()
                else -> null
            }
        }
    }
}

class Boeing737 : Aircraft {
    override fun fly() {
        println("Fly Boeing737!")
    }
}

class Boeing777 : Aircraft {
    override fun fly() {
        println("Fly Boeing777!")
    }
}

abstract class AircraftFactory : Factory {
    abstract fun create(type: String): Aircraft?
}