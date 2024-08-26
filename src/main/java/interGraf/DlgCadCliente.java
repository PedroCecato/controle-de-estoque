/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interGraf;

import Dominio.Cliente;
import gerenTarefas.FuncoesUteis;
import gerenTarefas.GerInterGraf;
import java.awt.Color;
import java.util.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadCliente extends javax.swing.JDialog {

    private GerInterGraf gerIg;
    private Cliente cliSelecionado;
    
    public DlgCadCliente(java.awt.Frame parent, boolean modal, GerInterGraf gerIg) {
        super(parent, modal);
        this.gerIg = gerIg;
        cliSelecionado = null;
        initComponents();
        habilitarBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotaoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        painelPrincipalCadCliente = new javax.swing.JPanel();
        painelDadosPessoais = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        labelDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        painelSexo = new javax.swing.JPanel();
        radioButtonMasc = new javax.swing.JRadioButton();
        radioButtonFem = new javax.swing.JRadioButton();
        labelCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        labelUf = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        imgUsuario = new javax.swing.JLabel();
        botaoPesquisar = new javax.swing.JButton();
        painelDadosParceria = new javax.swing.JPanel();
        labelDtInicio = new javax.swing.JLabel();
        txtDtInicio = new javax.swing.JFormattedTextField();
        labelDtFim = new javax.swing.JLabel();
        txtDtFim = new javax.swing.JFormattedTextField();
        labelQtdCafe = new javax.swing.JLabel();
        txtQtdPeCafe = new javax.swing.JTextField();
        labelQtdPessoas = new javax.swing.JLabel();
        spnQtPessoa = new javax.swing.JSpinner();
        painelBotoes = new javax.swing.JPanel();
        botaoAddCliente = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        painelPrincipalCadCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipalCadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N
        painelPrincipalCadCliente.setToolTipText("");

        painelDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 153, 0))); // NOI18N

        labelNome.setText("Nome");

        labelCpf.setText("CPF");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataNasc.setText("Dt. Nasc.");

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        painelSexo.setBackground(new java.awt.Color(255, 255, 255));
        painelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        radioButtonMasc.setBackground(new java.awt.Color(255, 255, 255));
        grupoBotaoSexo.add(radioButtonMasc);
        radioButtonMasc.setMnemonic('M');
        radioButtonMasc.setSelected(true);
        radioButtonMasc.setText("Masculino");
        radioButtonMasc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioButtonMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonMascActionPerformed(evt);
            }
        });

        radioButtonFem.setBackground(new java.awt.Color(255, 255, 255));
        grupoBotaoSexo.add(radioButtonFem);
        radioButtonFem.setMnemonic('F');
        radioButtonFem.setText("Feminino");
        radioButtonFem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioButtonFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonFemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSexoLayout = new javax.swing.GroupLayout(painelSexo);
        painelSexo.setLayout(painelSexoLayout);
        painelSexoLayout.setHorizontalGroup(
            painelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSexoLayout.createSequentialGroup()
                .addGroup(painelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonFem)
                    .addComponent(radioButtonMasc))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        painelSexoLayout.setVerticalGroup(
            painelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSexoLayout.createSequentialGroup()
                .addComponent(radioButtonMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioButtonFem))
        );

        labelCelular.setText("Celular");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        labelEmail.setText("Email");

        labelCidade.setText("Cidade");

        labelUf.setText("UF");

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/homem-usuario.png"))); // NOI18N

        botaoPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/lupa.png"))); // NOI18N
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosPessoaisLayout = new javax.swing.GroupLayout(painelDadosPessoais);
        painelDadosPessoais.setLayout(painelDadosPessoaisLayout);
        painelDadosPessoaisLayout.setHorizontalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelCpf)
                    .addComponent(labelDataNasc)
                    .addComponent(labelCelular)
                    .addComponent(labelEmail)
                    .addComponent(labelCidade))
                .addGap(26, 26, 26)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txtCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(27, 27, 27)
                                .addComponent(painelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelDadosPessoaisLayout.setVerticalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoPesquisar)
                            .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNome)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDataNasc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCelular)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(painelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(imgUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUf)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelDadosParceria.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosParceria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Parceria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 153, 0))); // NOI18N

        labelDtInicio.setText("Data de Início");

        try {
            txtDtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDtFim.setText("Data de Fim");

        try {
            txtDtFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelQtdCafe.setText("Qtd. pé Café");

        labelQtdPessoas.setText("Qtd. Pessoas");

        spnQtPessoa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnQtPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout painelDadosParceriaLayout = new javax.swing.GroupLayout(painelDadosParceria);
        painelDadosParceria.setLayout(painelDadosParceriaLayout);
        painelDadosParceriaLayout.setHorizontalGroup(
            painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosParceriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDtFim)
                    .addComponent(labelQtdCafe)
                    .addComponent(labelDtInicio)
                    .addComponent(labelQtdPessoas))
                .addGap(33, 33, 33)
                .addGroup(painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDtFim, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtDtInicio)
                    .addComponent(txtQtdPeCafe)
                    .addComponent(spnQtPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosParceriaLayout.setVerticalGroup(
            painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosParceriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDtInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDtInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDtFim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtdPeCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQtdCafe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosParceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosParceriaLayout.createSequentialGroup()
                        .addComponent(labelQtdPessoas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spnQtPessoa))
                .addContainerGap())
        );

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));

        botaoAddCliente.setBackground(new java.awt.Color(0, 153, 0));
        botaoAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/verifica.png"))); // NOI18N
        botaoAddCliente.setText("Novo");
        botaoAddCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddClienteActionPerformed(evt);
            }
        });

        botaoCancelar.setBackground(new java.awt.Color(204, 0, 0));
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(0, 0, 0));
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/vassoura.png"))); // NOI18N
        botaoLimpar.setText("Limpar Campos");
        botaoLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimpar)
                .addGap(18, 18, 18)
                .addComponent(botaoAddCliente)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelar)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAddCliente)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoAlterar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalCadClienteLayout = new javax.swing.GroupLayout(painelPrincipalCadCliente);
        painelPrincipalCadCliente.setLayout(painelPrincipalCadClienteLayout);
        painelPrincipalCadClienteLayout.setHorizontalGroup(
            painelPrincipalCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDadosParceria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalCadClienteLayout.setVerticalGroup(
            painelPrincipalCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadClienteLayout.createSequentialGroup()
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosParceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddClienteActionPerformed
       
        if(validarCampos()){
            
            
            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String dataNasc = txtDataNasc.getText();
            String celular = txtCelular.getText();
            String email = txtEmail.getText();
            String cidade = txtCidade.getText();
            String uf = txtUf.getText();
            char sexo = (char) grupoBotaoSexo.getSelection().getMnemonic();
            String dataInicio = txtDtInicio.getText();
            String dataFim = txtDtFim.getText();
            int qtdeCafe = Integer.parseInt(txtQtdPeCafe.getText());
            int qtdePessoas = Integer.parseInt(spnQtPessoa.getValue().toString());

        
            try{
                Date dtNasc = FuncoesUteis.strToDate(dataNasc);
                Date dtInicio = FuncoesUteis.strToDate(dataInicio);
                Date dtFim = FuncoesUteis.strToDate(dataFim);
                
                if ( cliSelecionado == null) {
                    // INSERIR
                    int id = gerIg.getGerDominio().inserirCliente(nome, cpf, sexo, dtNasc, celular, email, cidade, uf, dtInicio, dtFim, qtdeCafe, qtdePessoas);
                    JOptionPane.showMessageDialog(this, "Cliente " + id + " inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );
                } else {
                    // ALTERAR
                    gerIg.getGerDominio().alterarCliente(cliSelecionado, nome, cpf, sexo, dtNasc, celular, email, cidade, uf, dtInicio, dtFim, qtdeCafe, qtdePessoas);
                    int id = cliSelecionado.getIdCliente();
                    JOptionPane.showMessageDialog(this, "Cliente " + id + " alterado com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );                    
                }
                
            } catch (ParseException | HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
        };
    }//GEN-LAST:event_botaoAddClienteActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
            this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        txtNome.setText("");
        txtCpf.setText("");
        txtDataNasc.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtCidade.setText("");
        txtUf.setText("");
        txtDtInicio.setText("");
        txtDtFim.setText("");
        txtQtdPeCafe.setText("");
        
        labelNome.setForeground(Color.black);
        labelCpf.setForeground(Color.black);
        labelDataNasc.setForeground(Color.black);
        labelCpf.setForeground(Color.black);
        labelCelular.setForeground(Color.black);
        labelEmail.setForeground(Color.black);
        labelCidade.setForeground(Color.black);
        labelUf.setForeground(Color.black);
        labelDtInicio.setForeground(Color.black);
        labelDtFim.setForeground(Color.black);
        labelQtdCafe.setForeground(Color.black);
        labelQtdPessoas.setForeground(Color.black);
        
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        cliSelecionado = gerIg.abriJanelaConsultaCliente();
        try {
            preencherCampos(cliSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void radioButtonMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonMascActionPerformed

    private void radioButtonFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonFemActionPerformed
    
    private void preencherCampos(Cliente cli) throws ParseException {
        if ( cli != null ) {
            txtNome.setText( cli.getNome() );
            txtCpf.setText( cli.getCpf());
            txtDataNasc.setText( FuncoesUteis.dateToStr(cli.getDtNascimento()));
            txtDtInicio.setText( FuncoesUteis.dateToStr(cli.getDtInicio()));
            txtDtFim.setText( FuncoesUteis.dateToStr(cli.getDtFim()));
            txtCelular.setText( cli.getCelular());
            txtEmail.setText(cli.getEmail());
            txtCidade.setText( cli.getCidade() );
            txtUf.setText( cli.getUf());
            txtQtdPeCafe.setText(Integer.toString(cli.getQtdeCafe()));
            spnQtPessoa.setValue(cli.getQtdePessoas());
            
            if ( cli.getSexo() == 'M' ) {
                radioButtonMasc.setSelected(true);
            } else {
                radioButtonFem.setSelected(true);
            }            
            habilitarBotoes();
        }
    }
    
    public void habilitarBotoes() {
        if ( cliSelecionado == null ) {
            botaoAddCliente.setVisible(true);
            botaoAlterar.setVisible(false);
        } else {
            botaoAddCliente.setVisible(false);
            botaoAlterar.setVisible(true);
        }
    }
     
    private boolean validarCampos(){
    
        String msgErro = "";
        
        if(txtNome.getText().isEmpty()){
            msgErro = msgErro + "Digite o seu Nome.\n";
            labelNome.setForeground(Color.red);
        }else
            labelNome.setForeground(Color.black);
        
        if(FuncoesUteis.isCPF(txtCpf.getText()) == false){
            msgErro = msgErro + "CPF Inválido.\n";
            labelCpf.setForeground(Color.red);
        }else
            labelCpf.setForeground(Color.black);
            
        
        if(FuncoesUteis.isDateValid(txtDataNasc.getText()) == false){
            msgErro = msgErro + "Digite a data de Nascimento.\n";
            labelDataNasc.setForeground(Color.red);
        }else
            labelCpf.setForeground(Color.black);
        
        if(FuncoesUteis.isTelefone(txtCelular.getText()) == false){
            msgErro = msgErro + "Digite o Celular.\n";
            labelCelular.setForeground(Color.red);
        }else
            labelCelular.setForeground(Color.black);
        
        if(txtEmail.getText().isEmpty()){
            msgErro = msgErro + "Digite o  Email.\n";
            labelEmail.setForeground(Color.red);
        }else
            labelEmail.setForeground(Color.black);
        
        if(txtCidade.getText().isEmpty()){
            msgErro = msgErro + "Digite a Cidade.\n";
            labelCidade.setForeground(Color.red);
        }else
            labelCidade.setForeground(Color.black);
        
        if(txtUf.getText().isEmpty()){
            msgErro = msgErro + "Digite a UF.\n";
            labelUf.setForeground(Color.red);
        }else
            labelUf.setForeground(Color.black);
        
        if(FuncoesUteis.isDateValid(txtDtInicio.getText()) == false){
            msgErro = msgErro + "Digite a data de início do contrato.\n";
            labelDtInicio.setForeground(Color.red);
        }else
            labelDtInicio.setForeground(Color.black);
        
        if(FuncoesUteis.isDateValid(txtDtFim.getText()) == false){
            msgErro = msgErro + "Digite a data de fim do contrato.\n";
            labelDtFim.setForeground(Color.red);
        }else
            labelDtFim.setForeground(Color.black);
        
        if(txtQtdPeCafe.getText().isEmpty()){
            msgErro = msgErro + "Digite a quantidade de pé de café.\n";
            labelQtdCafe.setForeground(Color.red);
        }else
            labelQtdCafe.setForeground(Color.black);
        
        if(Integer.parseInt(spnQtPessoa.getValue().toString()) == 0){
            msgErro = msgErro + "Digite a quantidade de pessoas.\n";
            labelQtdPessoas.setForeground(Color.red);
        }else
            labelQtdPessoas.setForeground(Color.black);
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this,msgErro,"Cadastro de Cliente", JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddCliente;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.ButtonGroup grupoBotaoSexo;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelDtFim;
    private javax.swing.JLabel labelDtInicio;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelQtdCafe;
    private javax.swing.JLabel labelQtdPessoas;
    private javax.swing.JLabel labelUf;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDadosParceria;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JPanel painelPrincipalCadCliente;
    private javax.swing.JPanel painelSexo;
    private javax.swing.JRadioButton radioButtonFem;
    private javax.swing.JRadioButton radioButtonMasc;
    private javax.swing.JSpinner spnQtPessoa;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JFormattedTextField txtDtFim;
    private javax.swing.JFormattedTextField txtDtInicio;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdPeCafe;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
