package br.digital.com

class Aluno (val registroAcademico: Int, val nome: String, val sobrenome: String) {

    fun assistirAula (aula: Aula) {
        println("Oi! Eu sou o $nome $sobrenome, e eu estou assisindo a aula ${aula.materia.nome}!")
    }

    fun fazerLicaoDeCasa (materia: Materia) {
        println("Estou fazendo a lição da matéria ${materia.nome}, mas eu queria estar jogando video-game =/")
    }

}