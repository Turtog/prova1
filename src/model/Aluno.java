package model;

public class Aluno {
    private Integer id;
    private int cpf;
    private String nome;
    private String sobrenome;
    private String email;


    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Aluno(int id, int cpf, String nome, String sobrenome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\nAluno [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email
                + "]";
    }


}
g