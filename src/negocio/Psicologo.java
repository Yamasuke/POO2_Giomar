/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Yan
 */
public class Psicologo {
    
    private int idPsicologo;
    private String nome;
    private String cpf;
    private String crp;
    private String telefone;
    private String login;
    private String senha;

    @Override
    public String toString() {
        return "Psicologo{" + "idPsicologo=" + idPsicologo + ", nome=" + nome + ", cpf=" + cpf + ", crp=" + crp + ", telefone=" + telefone + ", login=" + login + ", senha=" + senha + '}';
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        cpf = cpf.replaceAll("[^0-9]+", "");
        this.cpf = cpf;
    }

    public void setCrp(String crp) {
        crp = crp.replaceAll("[^0-9]+", "");
        this.crp = crp;
    }

    public void setTelefone(String telefone) {
        telefone = telefone.replaceAll("[^0-9]+", "");
        this.telefone = telefone;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdPsicologo() {
        return idPsicologo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCrp() {
        return crp;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
