fun main(){
    val persona = Persona("Julia", 24)
    println(persona.toString())
    println(persona.celebrarCumple())
    println()


    val empleado = Empleado("Pablo", 30, 30000)
    println(empleado.toString())
    println(empleado.trabajar())
    println()


    val gerente = Gerente("Juan", 20, 6000, 40000, true)
    println(gerente.toString)
    println(gerente.administrar())
}