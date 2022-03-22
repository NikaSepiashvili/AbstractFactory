interface Car {
    fun drive()
}

class Carr {
    companion object Factory : CarFactory() {
        override fun create(type: String): Car? {
            return when (type) {
                "Audi" -> Audi()
                "Maserati" -> Maserati()
                else -> null
            }
        }
    }
}

class Audi : Car {
    override fun drive() {
        println("Drive Audi!")
    }
}

class Maserati : Car {
    override fun drive() {
        println("Drive Maserati!")
    }
}

abstract class CarFactory : Factory{
    abstract fun create(type: String): Car?
}
