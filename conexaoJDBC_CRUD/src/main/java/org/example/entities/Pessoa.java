package org.example.entities;

public class Pessoa {
    private Long id;
    private String name;
    private int idade;

    // g / s


    public Pessoa(Long id, String name, int idade) {
        this.id = id;
        this.name = name;
        setIdade(idade);
    }

    private boolean isMaiorIdade(int idade){
        this.idade = idade;
        return idade >= 18;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(int idade) {
        if(isMaiorIdade(idade)) {
            this.idade = idade;
        } else {
            throw new RuntimeException();
        }
    }

    public int getIdade() {
        return idade;
    }
}

