package br.digital.com

fun main(){
    val aluno1 = Aluno(111, "Ananda", "Câmara")
    val aluno2 = Aluno(112, "Arthur", "Rodrigues")
    val aluno3 = Aluno(112, "Rodrigo", "Vaz")

    val professor1 = Professor("Renan", 1)

    val curso1 = Curso("BCC", professor1)

    val turma1 = Turma("Turma 01", curso1)

    val materia1 = Materia("Matematica")

    val aula1 = Aula(materia1, "15:00", "16:00")

    curso1.adicionarAula(aula1)
    curso1.adicionarAluno(aluno1, aluno2, aluno3)
    professor1.darAula(aula1)
    professor1.fazerChamada(turma1)

    aluno1.assistirAula(aula1)
    aluno2.fazerLicaoDeCasa(materia1)

}