/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaGerenciadordeConsultas.apresentacao;

import br.com.SistemaGerenciadordeConsultas.entidade.Especialidade;
import br.com.SistemaGerenciadordeConsultas.entidade.Medico;
import br.com.SistemaGerenciadordeConsultas.excecao.CampoObrigatorioException;
import br.com.SistemaGerenciadordeConsultas.negocio.EspecialidadeBO;
import br.com.SistemaGerenciadordeConsultas.negocio.MedicoBO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rayssa
 */
public class AlterarMedicoForm extends javax.swing.JFrame {

    /**
     * Creates new form AlterarMedicoForm
     */
    private Medico medico;

    public AlterarMedicoForm(Medico medico) {
        initComponents();
        this.medico = medico;
        txtNome.setText(medico.getNome());
        txtCpf.setText(medico.getCpf());
        txtCrm.setText(medico.getCrm());
        txtTelefone.setText(medico.getTelefone());
        txtEndereco.setText(medico.getEndereco());
        if (medico.getSexo().equals("F")) {
            rdoF.setSelected(true);
        } else {
            rdoM.setSelected(true);
        }
        try {
            carregarCmb();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgbSexo = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblCrm = new javax.swing.JLabel();
        lblEspecialidade = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtCrm = new javax.swing.JFormattedTextField();
        cmbEspecialidade = new javax.swing.JComboBox();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        rdoF = new javax.swing.JRadioButton();
        rdoM = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR MÉDICO");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaGerenciadordeConsultas/apresentacao/icones/medicos.png"))); // NOI18N

        lblNome.setText("Nome:");

        lblCpf.setText("Cpf:");

        lblCrm.setText("CRM:");

        lblEspecialidade.setText("Especialidade");

        lblTelefone.setText("Telefone:");

        lblEndereco.setText("Endereço:");

        lblSexo.setText("Sexo:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCrm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbEspecialidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspecialidadeActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rgbSexo.add(rdoF);
        rdoF.setText("F");

        rgbSexo.add(rdoM);
        rdoM.setText("M");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCpf)
                    .addComponent(lblEspecialidade)
                    .addComponent(lblTelefone)
                    .addComponent(lblCrm)
                    .addComponent(lblEndereco)
                    .addComponent(lblSexo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoF)
                                .addGap(77, 77, 77)
                                .addComponent(rdoM))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrm)
                    .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidade)
                    .addComponent(cmbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblSexo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoM)
                            .addComponent(rdoF))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(713, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEspecialidadeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Recupera Campos Tela
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String crm = txtCrm.getText().trim();
        Especialidade especialidade = (Especialidade) cmbEspecialidade.getSelectedItem();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereco.getText().trim();
        String sexo = "";
        if (rdoF.isSelected()) {
            sexo = "F";
        } else if (rdoM.isSelected()) {
            sexo = "M";
        }
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setCrm(crm);
        medico.setEspecialidade(especialidade);
        medico.setTelefone(telefone);
        medico.setEndereco(endereco);
        medico.setSexo(sexo);
        try {
            MedicoBO medicoBO = new MedicoBO();
            medicoBO.editar(medico);
            JOptionPane.showMessageDialog(this, "Médico Alterado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        } catch (CampoObrigatorioException e) {
            JOptionPane.showMessageDialog(this, "\"Preencha Todos os Campos para Cadastar Médico!\"!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(NovoMedicoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbEspecialidade;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCrm;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JRadioButton rdoF;
    private javax.swing.JRadioButton rdoM;
    private javax.swing.ButtonGroup rgbSexo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtCrm;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void carregarCmb() throws SQLException {
        EspecialidadeBO especialidadeBO = new EspecialidadeBO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbEspecialidade.getModel();
        model.removeAllElements();
        model.addElement(medico.getEspecialidade());
        for (Especialidade especialidade : especialidadeBO.buscarTodos()) {
            model.addElement(especialidade);
        }
    }
}
