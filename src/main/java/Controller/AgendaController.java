/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import Model.DAO.PacienteDAO;
import Model.DAO.ServicoDAO;
import Model.Paciente;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author silva
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    
    public void atualizaTabela(){
        
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //EXIBIR LISTA NA VIEW
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaPaciente(){
        
        //buscar Paciente no DAo
        PacienteDAO pacienteDAO =  new PacienteDAO();
        ArrayList<Paciente> pacientes = pacienteDAO.selectAll();
        
        // exibir pacientes
        helper.preencherPacientes(pacientes);
                
    }

    public void atualizaServico(){
        
        //buscar serivco no DAo
        ServicoDAO servicoDAO =  new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        // exibir servicos
        helper.preencherServicos(servicos);
                
    }
    
    public void atualizaValor(){
    Servico servico = helper.obterServico();
    helper.setarValor(servico.getValor());
    
    }
    
    public void agendar(){
        //buscar agendamento
        Agendamento agendamento = helper.obterModelo();
              
        //salvar no banco
        new AgendamentoDAO().insert(agendamento);
        
        //inserir elemento
        atualizaTabela();
        helper.limparTela();
        
        
        
    }
}
