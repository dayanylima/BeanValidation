/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.webdev.beanvalidation;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author dayan
 */
@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean {

    private Usuario usuario;

    public UsuarioBean() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String save() {
        
        System.out.println(" >> "+usuario);
        return "saida";
    }

}
