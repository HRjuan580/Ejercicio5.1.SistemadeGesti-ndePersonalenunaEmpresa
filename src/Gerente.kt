class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Number,
    val bonus: Double,
    val exentoImpuestos: Boolean = false
) : Empleado(nombre, edad, salarioBase) {

    init {
        porcentajeImpuestos = 33.99
    }

    override fun calcularSalario(): Double {
        val salarioBaseConImpuestos = if (exentoImpuestos) salarioBase else super.calcularSalario()
        return salarioBaseConImpuestos + bonus
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}