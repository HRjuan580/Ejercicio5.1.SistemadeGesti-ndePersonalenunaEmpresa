open class Empleado(
    nombre: String,
    edad: Int,
    salarioBase: Number,
    var porcentajeImpuestos: Number = 10.0
) : Persona(nombre, edad) {

    var salarioBase: Double = salarioBase.toDouble()

    fun calcularSalario(): Double {
        return salarioBase * (1 - porcentajeImpuestos.toDouble() / 100)
    }

    override fun toString(): String {
        return "${super.toString()}, Salario: ${"%.2f".format(calcularSalario())}€"
    }

    fun trabajar(): String {
        return "$nombre está trabajando en la empresa."
    }
}