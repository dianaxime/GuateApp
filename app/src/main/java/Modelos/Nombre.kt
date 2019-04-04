package Modelos

class Nombre(internal var elnombre: String) {
    fun setelnombre(nuevo: String) {
        elnombre = nuevo
    }

    fun getelnombre(): String {
        return elnombre
    }
}
