/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Paciente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Paciente> paciente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        paciente = new ArrayList<Paciente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "clinica", 'M', "09/05/1996", "30212121", "clinicavida@gmail.com", "521454123", "123456", "administrador");
        
         
        Paciente paciente1 = new Paciente(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 354 crato");
        Paciente paciente2 = new Paciente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveira@gmail.com", "5142487745", "Rua campo bom 78 Centro Juazeiro do norte");
        Paciente paciente3 = new Paciente(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardo@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - Barbalha");
        Paciente paciente4 = new Paciente(4, "Roberto Santos", 'M', "20/08/1995", "30212130", "neymarsantos@gmail.com", "2745487", "Rua Lombardi 40  Juazeiro do norte");
        Paciente paciente5 = new Paciente(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruine@gmail.com", "4742487", "Rua pedro quaresma 784 Juazeiro do norte");
        Paciente paciente6 = new Paciente(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidi@gmail.com", "78512457", "Rua champions 10 Kephas Juazeiro do norte");
        Paciente paciente7 = new Paciente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouza@gmail.com", "4658237314", "Rua tesla 215 Juazeiro do norte");
        Paciente paciente8 = new Paciente(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferrari@gmail.com", "8475123687", "Rua hyrule 32 Juazeiro do norte");
        Paciente paciente9 = new Paciente(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinho@gmail.com", "74595142487", "Rua floresta 12 Juazeiro do norte");
        Paciente paciente10 = new Paciente(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluis@gmail.com", "845713647", "Rua marechal 1023 Juazeiro do norte");
        
        Servico servico1 = new Servico(1, "Ultrassonografia", 90);
        Servico servico2 = new Servico(2, "Consulta com clinico geral", 90);
        Servico servico3 = new Servico(3, "Raio-x", 60);
        Servico servico4 = new Servico(4, "Consulta com pediatra", 150);
        Servico servico5 = new Servico(5, "Consulta com cardiologista", 180);
        Servico servico6 = new Servico(6, "Consulta com dermatologista", 150);
        Servico servico7 = new Servico(6, "Dentista", 70);
        

        Agendamento agendamento1 = new Agendamento(1, paciente1, servico2, 90, "14/09/2021 09:30");
        Agendamento agendamento2 = new Agendamento(2, paciente3, servico4, 150, "14/09/2021 10:00");
        Agendamento agendamento3 = new Agendamento(3, paciente4, servico1, 90, "14/09/2021 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
 
        
        paciente.add(paciente1);
        paciente.add(paciente2);
        paciente.add(paciente3);
        paciente.add(paciente4);
        paciente.add(paciente5);
        paciente.add(paciente6);
        paciente.add(paciente7);
        paciente.add(paciente8);
        paciente.add(paciente9);
        paciente.add(paciente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
