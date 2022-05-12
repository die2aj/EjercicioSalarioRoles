package example.myapp

import example.myApp.Contador
import example.myApp.Gerente
import example.myApp.Operador

fun crearRol(){
    var gerente = Gerente()
    var operador = Operador()
    var contador =  Contador()

    print("Que Rol desea elegir:digite 1 para Gerente,2 para Operador y 3 para Contador:  ")
    var opcion = readLine()!!.toInt()

    when(opcion){
        1 ->   gerente.calcularSalario()
        2 -> operador.calcularSalario()
        3 -> contador.calcularSalario()
        else -> print("Error al digitar rol")
    }
}

fun main(args: Array<String>) {
    crearRol()
}