package br.senac.tads.dsw.dadospessoais;

public class Conhecimentos {
    public int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conhecimentos() {
    }

    public Conhecimentos(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Conhecimentos(int id) {
        this.id = id;
    }

    public Conhecimentos(String nome) {
        this.nome = nome;
    }
}
