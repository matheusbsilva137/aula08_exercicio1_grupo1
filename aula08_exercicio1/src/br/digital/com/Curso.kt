package br.digital.com

class Curso (var nome: String, var professorResponsavel: Professor) {

    val listaDeAlunos: MutableList<Aluno> = ArrayList()
    val listaDeAulas: MutableList<Aula> = ArrayList()

    fun adicionarAluno(vararg aluno: Aluno) = listaDeAlunos.addAll(aluno)

    fun adicionarAula(vararg aula: Aula) = listaDeAulas.addAll(aula)
}