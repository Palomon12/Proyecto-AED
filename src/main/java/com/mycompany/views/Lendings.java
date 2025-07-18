package com.mycompany.views;

import com.mycompany.sgbiblioteca.DAOBooksImpl;
import com.mycompany.sgbiblioteca.DAOLendingsImpl;
import com.mycompany.sgbiblioteca.DAOUsersImpl;
import com.mycompany.interfaces.DAOBooks;
import com.mycompany.interfaces.DAOLendings;
import com.mycompany.interfaces.DAOUsers;
import com.mycompany.utils.Utils;
import java.awt.Color;

public class Lendings extends javax.swing.JPanel {

    public Lendings() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        folioLbl.putClientProperty("FlatLaf.styleClass", "large");
        folioLbl.setForeground(Color.black);
        libroIdLbl.putClientProperty("FlatLaf.styleClass", "large");
        libroIdLbl.setForeground(Color.black);
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el folio del usuario.");
        libroIdTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del Libro a prestar.");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        folioLbl = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        libroIdLbl = new javax.swing.JLabel();
        libroIdTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        folioLbl.setText("Folio Usuario");

        folioTxt.setToolTipText("");

        libroIdLbl.setText("Libro ID");

        button.setBackground(new java.awt.Color(255, 102, 102));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Prestar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(199, 199, 199))
                    .addComponent(folioTxt)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(223, 223, 223))
                    .addComponent(libroIdTxt)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String folio = folioTxt.getText();
        String bookId = libroIdTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        }

        try {
            DAOUsers daoUsers = new DAOUsersImpl();
            
            // Validamos existencia del usuario
            com.mycompany.models.Users currentUser = daoUsers.getUserById(Integer.parseInt(folio));
            if (currentUser == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                folioTxt.requestFocus();
                return;
            }
            
            DAOBooks daoBooks = new DAOBooksImpl();
            
            // Validamos existencia del libro
            com.mycompany.models.Books currentBook = daoBooks.getBookById(Integer.parseInt(bookId));
            if (currentBook == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            // Validamos disponibilidad del libro.
            else if (currentBook.getAvailable() < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ya no hay más libros disponibles con esa ID para prestar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            
            DAOLendings daoLendings = new DAOLendingsImpl();
            
            // Validamos que el usuario no tenga ya ese libro prestado.
            com.mycompany.models.Lendings currentLending = daoLendings.getLending(currentUser, currentBook);
            if (currentLending != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con el préstamo de ese mismo Libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }

            // Todo OK: Prestamos libro.
            com.mycompany.models.Lendings lending = new com.mycompany.models.Lendings();
            lending.setBook_id(currentBook.getId());
            lending.setUser_id(currentUser.getId());
            lending.setDate_out(Utils.getFechaActual());
            daoLendings.registrar(lending);
            
            // Modificamos el libro restandole 1 en disponibilidad.
            currentBook.setAvailable(currentBook.getAvailable() - 1);
            daoBooks.modificar(currentBook);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " prestado exitosamente a " + currentUser.getName() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroIdTxt.setText("");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel libroIdLbl;
    private javax.swing.JTextField libroIdTxt;
    // End of variables declaration//GEN-END:variables
}
