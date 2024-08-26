/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenTarefas;

import Dominio.Cliente;
import Dominio.Produto;
import interGraf.DlgCadCliente;
import interGraf.DlgCadProduto;
import interGraf.DlgCadVenda;
import interGraf.DlgConsultaCliente;
import interGraf.DlgConsultaProdutos;
import interGraf.DlgConsultaVenda;
import interGraf.FrmPrincipal;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import org.hibernate.HibernateException;


public class GerInterGraf {
    
    private FrmPrincipal frmPrincipal  = null;
    private DlgCadCliente dlgCadCliente = null;
    private DlgCadProduto dlgCadProduto = null;
    private DlgCadVenda dlgCadVenda = null;
    private DlgConsultaCliente dlgConsutaCliente = null;
    private DlgConsultaProdutos dlgConsultaProdutos = null;
    private DlgConsultaVenda dlgConsultaVenda = null;;

    
    GerenciadorDominio gerDom;
    GerenciadorRelatorios gerRel;
    
    public GerInterGraf() {
        try {
            gerDom = new GerenciadorDominio();
            gerRel = new GerenciadorRelatorios();
        } catch (HibernateException  ex) {
            JOptionPane.showMessageDialog(frmPrincipal, "Erro de conexão com o banco. " + ex.getMessage() );
                System.exit(-1);
        } 
    }
    
    public GerenciadorDominio getGerDominio() {
        return gerDom;
    }
    
    public GerenciadorRelatorios getGerRelatorios() {
        return gerRel;
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerInterGraf.class ).newInstance(parent,true,this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            } 
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    public void abriJanelaPrincipal(){
        
        frmPrincipal = new FrmPrincipal(this);
        frmPrincipal.setVisible(true);
    }
    
    public void abriJanelaCadCliente(){
       
        abrirJanela(frmPrincipal, dlgCadCliente, DlgCadCliente.class);
    }
     
    public void abriJanelaCadProduto(){
        
        abrirJanela(frmPrincipal, dlgCadProduto, DlgCadProduto.class);
    }
   
    public void abriJanelaCadVenda(){
        
        abrirJanela(frmPrincipal, dlgCadVenda, DlgCadVenda.class);      
    }
    
    public Cliente abriJanelaConsultaCliente(){
   
        dlgConsutaCliente = (DlgConsultaCliente) abrirJanela(frmPrincipal, dlgConsutaCliente, DlgConsultaCliente.class);
        return dlgConsutaCliente.getCliente();
    }
    
    public Produto abriJanelaConsultaProdutos(){
        
        dlgConsultaProdutos = (DlgConsultaProdutos) abrirJanela(frmPrincipal, dlgConsultaProdutos, DlgConsultaProdutos.class);
        return dlgConsultaProdutos.getProduto();
    }
    
    public void abriJanelaConsultaVenda(){
        
        abrirJanela(frmPrincipal, dlgConsultaVenda, DlgConsultaVenda.class);
    }
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       

       GerInterGraf gerIg = new GerInterGraf();
       gerIg.abriJanelaPrincipal();
    }
}
