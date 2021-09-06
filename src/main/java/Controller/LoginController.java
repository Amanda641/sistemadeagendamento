/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Agenda;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author silva
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);       
        
    }
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
       
    public void entrarNoSistema(){
     
        //pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        // pesquisar usuario no banco 
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);  
            this.view.dispose();
        }else{
            view.exibirMensagem("Usuario ou Senha invalidos");
        }
        
        
        
    }
    
    public void FizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibirMensagem("Executei o fiz tarefa");
        
    }
    
    
    
}
