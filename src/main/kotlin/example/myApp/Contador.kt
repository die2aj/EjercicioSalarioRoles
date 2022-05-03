package example.myApp

class Contador: HorasYGananciasTrabajadas(),Roles {
    override var bonus = 0
    override var gananciasXHora = 50
    override var horasTrabajadas = 200

    override fun calcularSalario() {
        println("El Contador se gana en total de :" + gananciasXHora*horasTrabajadas + bonus)
    }

}