package br.digital.com

public class Professor(var nome: String, var rd: Integer, listaDeAlunos: Curso){

    fun darAula(){
        println("Professor $nome com o registro $rd ministrando a aula")
    }

    fun fazerChamada(listaDeAlunos: Curso){
        for(aluno in listaDeAlunos){
            println("O aluno $aluno está presente")
        }
    }
}