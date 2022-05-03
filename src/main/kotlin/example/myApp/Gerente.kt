package example.myApp

class Gerente:HorasYGananciasTrabajadas(),Roles{
    override var bonus = 0
    override var gananciasXHora = 200
    override var horasTrabajadas = 200
    override fun calcularSalario() {
        println("El Gerente se gana en total de : " + gananciasXHora*horasTrabajadas + bonus)
    }
}