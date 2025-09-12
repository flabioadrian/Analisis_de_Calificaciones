package com.example.hola_2b

import kotlin.collections.mutableListOf

class AnalizadorCalificaciones {
    val Calificaciones = mutableListOf<Float>();

    fun calcularPromedio() : Float{
        return Calificaciones.average().toFloat();
    }

    fun contarAprobadas() : Int{
        return Calificaciones.count { it >= 7f};
    }

    fun contarReprobadas() : Int{
        return Calificaciones.count { it < 7f};
    }

    fun obtenerCalificacionMaxima():Float{
        return Calificaciones.maxOrNull()?:0f;
    }

    fun obtenerCalificacionMinima():Float{
        return Calificaciones.minOrNull()?:0f;
    }
}