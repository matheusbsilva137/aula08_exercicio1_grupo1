package br.digital.com

class Aula (var materia: Materia, var horarioDeInicio: String, var horarioDeTermino: String){
    init{
        println("Aula da matéria '${materia.nome}' criada com sucesso.")
        println("Horário de Início: $horarioDeInicio")
        println("Horário de Término: $horarioDeTermino")
    }
}