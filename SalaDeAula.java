package salaula;

import java.util.*;

public class SalaDeAula {

    private int pessoas, faltas;
    private boolean aulaPratica;
    private String tipoAula, materias;

    public static void main(String[] args) {
        SalaDeAula sala = new SalaDeAula();
        sala.perguntarAulaPratica();
        sala.perguntarPessoas();
        sala.perguntarFaltas();
        sala.perguntarMateria();
        sala.perguntarTipoAula();
    }

    public void perguntarAulaPratica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A aula é prática hoje? (true/false) ");
        aulaPratica = scanner.nextBoolean();
        if (!aulaPratica) {
            System.out.println("Terá aula teórica hoje.");
        }
    }

    public void perguntarPessoas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas estão presentes? ");
        pessoas = scanner.nextInt();
    }

    public void perguntarFaltas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas faltaram hoje?");
        faltas = scanner.nextInt();

        if (faltas == 0) {
            System.out.println("Parabéns!! Ninguém faltou.");
        } else {
            int presentes = pessoas - faltas;
            System.out.println("Faltaram " + faltas + " pessoa(s).");
            System.out.println("Número de pessoas presentes: " + presentes);
        }
    }

    public void perguntarMateria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual matéria será hoje? ");
        materias = scanner.next();
    }

    public void perguntarTipoAula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tipo de aula? ");
        tipoAula = scanner.next();
    }
}
