/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interGraf;

import Dominio.Produto;
import gerenTarefas.GerInterGraf;
import java.awt.Color;
import java.text.ParseException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;


public class DlgCadProduto extends javax.swing.JDialog {

    private GerInterGraf gerIg;
    private Produto proSelecionado;
    
    public DlgCadProduto(java.awt.Frame parent, boolean modal, GerInterGraf gerIg) {
        super(parent, modal);
        this.gerIg = gerIg;
        proSelecionado = null;
        initComponents();
        habilitarBotoes();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        painelPrincipalCadProduto = new javax.swing.JPanel();
        painelDadosProduto = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelUnidade = new javax.swing.JLabel();
        labelQtdEstoque = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        painelImg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        painelBotoes = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);

        painelPrincipalCadProduto.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipalCadProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        painelDadosProduto.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 153, 0))); // NOI18N

        labelNome.setText("Nome");

        labelDescricao.setText("Descrição do Produto");

        labelUnidade.setText("Uni. Medida");

        labelQtdEstoque.setText("Qtd. Estoque");

        labelMarca.setText("Marca");

        labelPreco.setText("Preço (R$)");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        painelImg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/cafe-logo.png"))); // NOI18N

        javax.swing.GroupLayout painelImgLayout = new javax.swing.GroupLayout(painelImg);
        painelImg.setLayout(painelImgLayout);
        painelImgLayout.setHorizontalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImgLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(59, 59, 59))
        );
        painelImgLayout.setVerticalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImgLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosProdutoLayout = new javax.swing.GroupLayout(painelDadosProduto);
        painelDadosProduto.setLayout(painelDadosProdutoLayout);
        painelDadosProdutoLayout.setHorizontalGroup(
            painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosProdutoLayout.createSequentialGroup()
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addGap(89, 89, 89)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addComponent(labelMarca)
                                .addGap(87, 87, 87)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUnidade)
                                    .addComponent(labelQtdEstoque)
                                    .addComponent(labelPreco))
                                .addGap(52, 52, 52)
                                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        painelDadosProdutoLayout.setVerticalGroup(
            painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelNome))
                            .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addGap(9, 9, 9)
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelMarca))
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelUnidade))
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelQtdEstoque))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                        .addComponent(painelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addComponent(labelDescricao)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));

        botaoCancelar.setBackground(new java.awt.Color(204, 0, 0));
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoNovo.setBackground(new java.awt.Color(0, 153, 0));
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/verifica.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
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
                botaoNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimpar)
                .addGap(34, 34, 34)
                .addComponent(botaoNovo)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelar)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoAlterar))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalCadProdutoLayout = new javax.swing.GroupLayout(painelPrincipalCadProduto);
        painelPrincipalCadProduto.setLayout(painelPrincipalCadProdutoLayout);
        painelPrincipalCadProdutoLayout.setHorizontalGroup(
            painelPrincipalCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDadosProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalCadProdutoLayout.setVerticalGroup(
            painelPrincipalCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadProdutoLayout.createSequentialGroup()
                .addComponent(painelDadosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        
        if(validarCampos()){
            
            String nome = txtNome.getText();
            String marca = txtMarca.getText();
            String unidade = txtUnidade.getText();
            int qtdEstoque = Integer.parseInt(txtQtdEstoque.getText());
            float preco = Float.parseFloat(txtPreco.getText());
            String descricao = txtDescricao.getText();
        
            try{
                
                if ( proSelecionado == null) {
                    // INSERIR
                    int id = gerIg.getGerDominio().inserirProduto(nome, marca, unidade, qtdEstoque, preco, descricao);
                    JOptionPane.showMessageDialog(this, "Produto " + id + " inserido com sucesso.", "Inserir Produto", JOptionPane.INFORMATION_MESSAGE  );
                } else {
                    // ALTERAR
                    gerIg.getGerDominio().alterarProduto(proSelecionado, nome, marca, unidade, qtdEstoque, preco, descricao);
                    int id = proSelecionado.getIdProduto();
                    JOptionPane.showMessageDialog(this, "Produto " + id + " alterado com sucesso.", "Inserir Produto", JOptionPane.INFORMATION_MESSAGE  );                    
                }
                
            } catch ( HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Produto", JOptionPane.ERROR_MESSAGE  );
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Produto", JOptionPane.ERROR_MESSAGE  );
            }
        };
    }//GEN-LAST:event_botaoNovoActionPerformed
    
    private boolean validarCampos(){
    
        String msgErro = "";
        
        if(txtNome.getText().isEmpty()){
            msgErro = msgErro + "Digite o Nome.\n";
            labelNome.setForeground(Color.red);
        }else
            labelNome.setForeground(Color.black);
        
        if(txtMarca.getText().isEmpty()){
            msgErro = msgErro + "Digite a Marca.\n";
            labelMarca.setForeground(Color.red);
        }else
            labelMarca.setForeground(Color.black);
        
        if(txtQtdEstoque.getText().isEmpty()){
            msgErro = msgErro + "Digite a Quantidade.\n";
            labelQtdEstoque.setForeground(Color.red);
        }else
            labelQtdEstoque.setForeground(Color.black);
        
        if(txtPreco.getText().isEmpty()){
            msgErro = msgErro + "Digite o Preço.\n";
            labelPreco.setForeground(Color.red);
        }else
            labelPreco.setForeground(Color.black);
      
        if(txtUnidade.getText().isEmpty()){
            msgErro = msgErro + "Digite a Unidade.\n";
            labelUnidade.setForeground(Color.red);
        }else
            labelUnidade.setForeground(Color.black);
        
        if(txtDescricao.getText().isEmpty()){
            msgErro = msgErro + "Digite a Descrição.\n";
            labelDescricao.setForeground(Color.red);
        }else
            labelDescricao.setForeground(Color.black);
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this,msgErro,"Cadastro de Produto", JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        txtNome.setText("");
        txtMarca.setText("");
        txtUnidade.setText("");
        txtQtdEstoque.setText("");
        txtPreco.setText("");
        txtDescricao.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        proSelecionado = gerIg.abriJanelaConsultaProdutos();
        try {
            preencherCampos(proSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO Produto", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void preencherCampos(Produto pro) throws ParseException {
        if ( pro != null ) {
            txtNome.setText( pro.getNome() );
            txtMarca.setText( pro.getMarca());
            txtUnidade.setText( pro.getUnidade());
            txtQtdEstoque.setText(Integer.toString(pro.getQtdEstoque()));
            txtPreco.setText( Float.toString(pro.getPreco()));
            txtDescricao.setText( pro.getDescricao());
           
            habilitarBotoes();
        }
    }
    
    public void habilitarBotoes() {
        if ( proSelecionado == null ) {
            botaoNovo.setVisible(true);
            botaoAlterar.setVisible(false);
        } else {
            botaoNovo.setVisible(false);
            botaoAlterar.setVisible(true);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQtdEstoque;
    private javax.swing.JLabel labelUnidade;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDadosProduto;
    private javax.swing.JPanel painelImg;
    private javax.swing.JPanel painelPrincipalCadProduto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
