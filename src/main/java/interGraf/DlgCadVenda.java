/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interGraf;

import Dominio.Cliente;
import Dominio.Produto;
import gerenTarefas.FuncoesUteis;
import gerenTarefas.GerInterGraf;
import java.awt.Color;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class DlgCadVenda extends javax.swing.JDialog {

    private GerInterGraf gerIg;
    private Cliente cliSelecionado;
    private Produto proSelecionado;
    float valorTotal = 0;
    
    public DlgCadVenda(java.awt.Frame parent, boolean modal, GerInterGraf gerIg) {
        super(parent, modal);
        this.gerIg = gerIg;
        cliSelecionado = null;
        proSelecionado = null;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopUp = new javax.swing.JPopupMenu();
        menuInserir = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        painelPrincipalCadVendas = new javax.swing.JPanel();
        painelDadosCliente = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        botaoBuscarNome = new javax.swing.JButton();
        labelCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        painelProduto = new javax.swing.JPanel();
        labelNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        labelUnidade = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        spnQtdProduto = new javax.swing.JSpinner();
        qtdProduto = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        labelPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        botaoAddNaLista = new javax.swing.JButton();
        botaoBuscar = new javax.swing.JButton();
        painelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        botaoCancelar = new javax.swing.JButton();
        botaoConcluirVenda = new javax.swing.JButton();
        painelDadosVenda = new javax.swing.JPanel();
        labelDtCompra = new javax.swing.JLabel();
        labelDtVenc = new javax.swing.JLabel();
        txtDtCompra = new javax.swing.JFormattedTextField();
        txtDtVenc = new javax.swing.JFormattedTextField();
        labelTotalVenda = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();

        menuInserir.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Downloads\\verifica.png")); // NOI18N
        menuInserir.setText("Inserir");
        menuInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddNaListaActionPerformed(evt);
            }
        });
        menuPopUp.add(menuInserir);

        menuExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Downloads\\cancelar.png")); // NOI18N
        menuExcluir.setText("Excluir");
        menuExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        menuPopUp.add(menuExcluir);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Venda");

        painelPrincipalCadVendas.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipalCadVendas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        painelDadosCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        labelNome.setText("Nome");

        txtNome.setEditable(false);

        botaoBuscarNome.setBackground(new java.awt.Color(0, 153, 0));
        botaoBuscarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/lupa.png"))); // NOI18N
        botaoBuscarNome.setText("Buscar");
        botaoBuscarNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarNomeActionPerformed(evt);
            }
        });

        labelCpf.setText("CPF");

        txtCpf.setEditable(false);

        labelCidade.setText("Cidade");

        txtCidade.setEditable(false);

        labelEmail.setText("Email");

        txtEmail.setEditable(false);

        javax.swing.GroupLayout painelDadosClienteLayout = new javax.swing.GroupLayout(painelDadosCliente);
        painelDadosCliente.setLayout(painelDadosClienteLayout);
        painelDadosClienteLayout.setHorizontalGroup(
            painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelCpf)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosClienteLayout.createSequentialGroup()
                        .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoBuscarNome)
                            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                                .addComponent(labelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtEmail))
                .addGap(20, 20, 20))
        );
        painelDadosClienteLayout.setVerticalGroup(
            painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelProduto.setBackground(new java.awt.Color(255, 255, 255));
        painelProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        labelNomeProduto.setText("Nome");

        txtNomeProduto.setEditable(false);

        labelMarca.setText("Marca");

        txtMarca.setEditable(false);

        labelUnidade.setText("Unidade");

        txtUnidade.setEditable(false);

        spnQtdProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnQtdProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        qtdProduto.setText("Quantidade");

        labelCodigo.setText("Código");

        txtCodigo.setEditable(false);

        labelPreco.setText("Preço Unitário");

        txtPreco.setEditable(false);

        botaoAddNaLista.setBackground(new java.awt.Color(0, 153, 0));
        botaoAddNaLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/verifica.png"))); // NOI18N
        botaoAddNaLista.setText("Adicionar na Lista");
        botaoAddNaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAddNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddNaListaActionPerformed(evt);
            }
        });

        botaoBuscar.setBackground(new java.awt.Color(0, 153, 0));
        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/lupa.png"))); // NOI18N
        botaoBuscar.setText("Buscar");
        botaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutoLayout = new javax.swing.GroupLayout(painelProduto);
        painelProduto.setLayout(painelProdutoLayout);
        painelProdutoLayout.setHorizontalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelProdutoLayout.createSequentialGroup()
                        .addComponent(qtdProduto)
                        .addGap(18, 18, 18)
                        .addComponent(spnQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelProdutoLayout.createSequentialGroup()
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelProdutoLayout.createSequentialGroup()
                                    .addComponent(labelMarca)
                                    .addGap(45, 45, 45)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                                    .addComponent(labelNomeProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(txtNomeProduto))))
                            .addComponent(labelCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoBuscar)
                            .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(painelProdutoLayout.createSequentialGroup()
                                    .addComponent(labelPreco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelProdutoLayout.createSequentialGroup()
                                    .addComponent(labelUnidade)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAddNaLista)
                .addContainerGap())
        );
        painelProdutoLayout.setVerticalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelUnidade)
                        .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPreco)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtdProduto)
                    .addComponent(spnQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAddNaLista)
                .addContainerGap())
        );

        painelLista.setBackground(new java.awt.Color(255, 255, 255));
        painelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Uni. Medida", "Marca", "Preço Uni.", "Qtd.", "Preço Tot."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setComponentPopupMenu(menuPopUp);
        tabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
        painelLista.setLayout(painelListaLayout);
        painelListaLayout.setHorizontalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelListaLayout.setVerticalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoCancelar.setBackground(new java.awt.Color(204, 0, 0));
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar Venda");
        botaoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoConcluirVenda.setBackground(new java.awt.Color(0, 153, 0));
        botaoConcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interGraf/imagens/verifica.png"))); // NOI18N
        botaoConcluirVenda.setText("Concluir Venda");
        botaoConcluirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirVendaActionPerformed(evt);
            }
        });

        painelDadosVenda.setBackground(new java.awt.Color(255, 255, 255));
        painelDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        labelDtCompra.setText("Data da Compra");

        labelDtVenc.setText("Data de Vencimento");

        txtDtCompra.setEditable(false);
        try {
            txtDtCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDtVenc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelDadosVendaLayout = new javax.swing.GroupLayout(painelDadosVenda);
        painelDadosVenda.setLayout(painelDadosVendaLayout);
        painelDadosVendaLayout.setHorizontalGroup(
            painelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosVendaLayout.createSequentialGroup()
                .addGroup(painelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDtCompra)
                    .addComponent(labelDtVenc)
                    .addComponent(txtDtCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtDtVenc))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelDadosVendaLayout.setVerticalGroup(
            painelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDtVenc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTotalVenda.setText("Valor total");

        txtValorTotal.setEditable(false);

        javax.swing.GroupLayout painelPrincipalCadVendasLayout = new javax.swing.GroupLayout(painelPrincipalCadVendas);
        painelPrincipalCadVendas.setLayout(painelPrincipalCadVendasLayout);
        painelPrincipalCadVendasLayout.setHorizontalGroup(
            painelPrincipalCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadVendasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelTotalVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(botaoConcluirVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCancelar)
                .addGap(27, 27, 27))
            .addGroup(painelPrincipalCadVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalCadVendasLayout.createSequentialGroup()
                        .addComponent(painelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painelPrincipalCadVendasLayout.setVerticalGroup(
            painelPrincipalCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPrincipalCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoConcluirVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPrincipalCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCancelar)
                        .addComponent(labelTotalVenda)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalCadVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarNomeActionPerformed
       
        cliSelecionado = gerIg.abriJanelaConsultaCliente();
        
        if ( cliSelecionado != null ) {
            
            txtNome.setText( cliSelecionado.getNome() );
            txtCpf.setText( cliSelecionado.getCpf());
            txtEmail.setText(cliSelecionado.getEmail());
            txtCidade.setText( cliSelecionado.getCidade());
        }
        
    }//GEN-LAST:event_botaoBuscarNomeActionPerformed
    private void preencherCampos(Cliente cli) throws ParseException {
        if ( cli != null ) {
       
            txtNome.setText( cli.getNome() );
            txtCpf.setText( cli.getCpf());
            txtEmail.setText(cli.getEmail());
            txtCidade.setText( cli.getCidade());
        }
    }
    private void botaoAddNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddNaListaActionPerformed
        
        
        if(validarCampos()){
            
            String msgErro = "";
            int quantidade = Integer.parseInt(spnQtdProduto.getValue().toString());
            
            Produto produto = proSelecionado;
            int qtdTotal = produto.getQtdEstoque();
            if(qtdTotal >= quantidade){
                produto.setQtdEstoque(qtdTotal - quantidade);
                
                float valorProd = produto.getPreco() * quantidade;
            
                valorTotal = valorTotal + valorProd;

                String valor = String.valueOf(valorTotal);

                inserirLista( produto, quantidade);

                txtCodigo.setText("");
                txtNomeProduto.setText("");
                txtUnidade.setText("");
                txtMarca.setText("");
                txtPreco.setText("");
                txtValorTotal.setText(valor);
            }else{
                msgErro = "Quantidade do produto maior do que o estoque";
                JOptionPane.showMessageDialog(this,msgErro,"Erro no estoque", JOptionPane.ERROR_MESSAGE );
            }
        }
    }//GEN-LAST:event_botaoAddNaListaActionPerformed

     private boolean validarCampos(){
    
        String msgErro = "";
        
        if(txtNomeProduto.getText().isEmpty()){
            msgErro = msgErro + "Escolha um Produto\n";
        }
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this,msgErro,"insira um Produto", JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }
     
    void inserirLista(Produto produto, int quantidade){
        
        float preco = produto.getPreco();
        float precoTotal = preco*quantidade;
        
        ((DefaultTableModel) tabelaProdutos.getModel()).addRow(new Object[7]);
        int linha = tabelaProdutos.getRowCount()- 1;
        int col = 0;
        tabelaProdutos.setValueAt(produto, linha, col++);
        tabelaProdutos.setValueAt(produto.getUnidade(), linha, col++);
        tabelaProdutos.setValueAt(produto.getMarca(), linha, col++);
        tabelaProdutos.setValueAt(produto.getPreco(), linha, col++);
        tabelaProdutos.setValueAt(quantidade, linha, col++);
        tabelaProdutos.setValueAt(precoTotal, linha, col++);
    }
    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        
        proSelecionado = gerIg.abriJanelaConsultaProdutos();
        
        String codigo =  Integer.toString( proSelecionado.getIdProduto());
        String valor =  Float.toString( proSelecionado.getPreco());
                
        if ( proSelecionado != null ) {
            
            txtCodigo.setText(codigo);
            txtNomeProduto.setText( proSelecionado.getNome() );
            txtUnidade.setText( proSelecionado.getUnidade());
            txtMarca.setText(proSelecionado.getMarca());
            txtPreco.setText(valor);
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        int linha = tabelaProdutos.getSelectedRow();
        if(linha >= 0){
            ((DefaultTableModel) tabelaProdutos.getModel()).removeRow(linha);
        }
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void botaoConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConcluirVendaActionPerformed
        
        if (cliSelecionado != null) {
            if(validarData()){
                int idVenda;
                String dataVenc = (txtDtVenc.getText());

                try{
                    Date dtVencimento = FuncoesUteis.strToDate(dataVenc);

                    idVenda = gerIg.getGerDominio().inserirPedido(cliSelecionado, tabelaProdutos, dtVencimento);
                    JOptionPane.showMessageDialog(this, "Pedido " + idVenda + " inserido com sucesso.");


                 } catch (ParseException | HibernateException ex) {
                    JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente.");
        }
    }//GEN-LAST:event_botaoConcluirVendaActionPerformed

    private boolean validarData(){
    
        String msgErro = "";
       
        if(FuncoesUteis.isDateValid(txtDtVenc.getText()) == false){
            msgErro = msgErro + "Digite a data de Vencimento da venda.\n";
            labelDtVenc.setForeground(Color.red);
        }else
            labelDtVenc.setForeground(Color.black);
        
        if(msgErro.isEmpty()){
            return true;
        }else{
            JOptionPane.showMessageDialog(this,msgErro,"Cadastro de Venda", JOptionPane.ERROR_MESSAGE );
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddNaLista;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoBuscarNome;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConcluirVenda;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDtCompra;
    private javax.swing.JLabel labelDtVenc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeProduto;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelTotalVenda;
    private javax.swing.JLabel labelUnidade;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuInserir;
    private javax.swing.JPopupMenu menuPopUp;
    private javax.swing.JPanel painelDadosCliente;
    private javax.swing.JPanel painelDadosVenda;
    private javax.swing.JPanel painelLista;
    private javax.swing.JPanel painelPrincipalCadVendas;
    private javax.swing.JPanel painelProduto;
    private javax.swing.JLabel qtdProduto;
    private javax.swing.JSpinner spnQtdProduto;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JFormattedTextField txtDtCompra;
    private javax.swing.JFormattedTextField txtDtVenc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
