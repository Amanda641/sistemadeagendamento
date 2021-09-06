/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;



/**
 *
 * @author silva
 */
public class Paciente extends Pessoa{
       
    private String endereco;

    public Paciente( int id, String nome, char sexo, String dataNascimento, String telefone, String email,String cpf, String endereco) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.endereco = endereco;
    }

    public Paciente(String endereco, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
    }
    
    
    
    
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Override
    public String toString(){
        return getNome();
    }
    
    
    
}
