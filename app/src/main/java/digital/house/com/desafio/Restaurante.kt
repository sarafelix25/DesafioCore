package digital.house.com.desafio

class Restaurante (var nome : String, val endereco: String, val horario: String, val foto: Int){
    override fun toString(): String {
        return "Restaurante(nome=$nome, endereco=$endereco, horario=$horario, foto=$foto)"
    }
}