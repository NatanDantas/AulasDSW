package br.senac.tads.dsw.dadospessoais;

import java.time.LocalDate;
import java.util.*;

public class DadosPessoais {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private List<Conhecimentos> conhecimentos;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Conhecimentos> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<Conhecimentos> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public DadosPessoais() {
    }

}
