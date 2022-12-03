package br.edu.ifnmg.webdev.beanvalidation;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 *
 * @author dayan
 */
public class Usuario implements Serializable {

    @NotBlank(message = "Nome não pode ficar em branco.")
    private String nome;

    //@NotEmpty(message = "Senha não pode ser vazio.")
    @Size(min = 6, message = "Senha deve conter no mínimo 6 caracteres.")
    private String senha;

    @NotEmpty(message = "Email não pode ser vazio.")
    @Email(message = "Email deve ser válido.")
    private String email;

    private String cpf;
    
    @Past(message = "A data de nascimento deve ser anterior a data atual.")
    @NotNull(message = "Data de nascimento não pode ser nula.")
    private Date nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public Date getNascimento() {

        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
