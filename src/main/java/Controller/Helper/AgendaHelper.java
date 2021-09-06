/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Paciente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author silva
 */
public class AgendaHelper implements Ihelper {
    private final Agenda view;
    

    public AgendaHelper(Agenda view) {
        this.view = view;
        
        
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel =  (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getPaciente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
                    
            });
            
        }
        
        
        
    }

    public void preencherPacientes(ArrayList<Paciente> pacientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxPaciente().getModel();
        
        for ( Paciente paciente : pacientes){
            comboBoxModel.addElement(paciente);
        }
       
        
        
        
                
    }
    
    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
           for (Servico servico : servicos){
               comboBoxModel.addElement(servico);
           }             
    }
    public Paciente obterPaciente() {
        return (Paciente) view.getjComboBoxPaciente().getSelectedItem();
    }

    public Servico obterServico() {
        return (Servico) view.getjComboBoxServico().getSelectedItem();
                
    }    

    public void setarValor(float valor) {
    
        view.getTextValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTextID().getText();
        int id = Integer.parseInt(idString);
        Paciente paciente = obterPaciente();
        Servico servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextData().getText();
        String hora = view.getTextHora().getText();
        String dataHora = data + "" + hora;
        String observacao = view.getTextObs().getText();
        
        Agendamento agendamento = new Agendamento(id, paciente, servico, valor,dataHora, observacao);
        return agendamento;
        
        //new Agendamento(0, paciente, servico, 0, data)
    }

    @Override
    public void limparTela() {
        view.getTextID().setText("0");
        view.getTextData().setText("");
        view.getTextHora().setText("");
        view.getTextObs().setText("");
        
    }
    
    
    
}
