package example.myApp

class Operador:HorasYGananciasTrabajadas,Roles {
    override var bonus = 30
    override var gananciasXHora = 10
    override var horasTrabajadas = 230
    override fun calcularSalario() {
        println("El operador se gana en total de : " + gananciasXHora*horasTrabajadas + bonus)
    }
}