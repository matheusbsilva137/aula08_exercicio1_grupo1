package br.digital.com

public class Professor(var nome: String, var rd: Int){

    fun darAula(aula: Aula){
        println("Professor $nome com o registro $rd ministrando a aula ${aula.materia.nome}")
    }

    fun fazerChamada(turma: Turma){
        for(aluno in turma.curso.listaDeAlunos) println("O aluno ${aluno.nome} está presente")
    }
}