package example.myapp

import example.myApp.Contador
import example.myApp.Gerente
import example.myApp.Operador


fun crearRol(){
    print("Que Rol desea elegir:digite 1 para Gerente,2 para Operador y 3 para Contador:  ")
    var opcion = readLine()!!.toInt()
    if (opcion == 1){
        var gerente = Gerente()
        gerente.calcularSalario()
    }else if (opcion == 2){
        var operador = Operador()
        operador.calcularSalario()

    }else if (opcion == 3){
        val contador = Contador()
        contador.calcularSalario()

    }else {
        print("Error al digitar rol")
    }
}




fun main(args: Array<String>) {
    crearRol()
}