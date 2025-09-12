package com.example.hola_2b

fun main(){
    var utilidad = AnalizadorCalificaciones();
    agregarCalificacion(utilidad.Calificaciones);

    println("El promedio es: ${utilidad.calcularPromedio()}")
    println("La cantidad de materias aprobadas es: ${utilidad.contarAprobadas()}")
    println("La cantidad de materias reprobadas es: ${utilidad.contarReprobadas()}")
    println("La calificación más alta fue de: ${utilidad.obtenerCalificacionMaxima()}")
    println("La calificación más baja fue de: ${utilidad.obtenerCalificacionMinima()}")

}

fun agregarCalificacion(calificaciones: MutableList<Float>) {
    for (i in 1 .. 7) {
        print("Ingresa la calificación ${i}: ")
        val input = readln().toFloat();
        calificaciones.add(input);
    }
}
