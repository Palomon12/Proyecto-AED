package com.mycompany.views;

import com.mycompany.sgbiblioteca.DAOBooksImpl;
import com.mycompany.sgbiblioteca.Dashboard;
import com.mycompany.interfaces.DAOBooks;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class Books extends javax.swing.JPanel {
    
    public Books() {
        initComponents();
        InitStyles();
        LoadBooks();
    }
    private final Stack<com.mycompany.models.Books> pilaEliminados = new Stack<>();
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        bookSearch.putClientProperty("JTextField.placeholderText", "Ingrese el título del libro a buscar.");
    }
    
    private void LoadBooks() {
        try {
            DAOBooks dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitle(), u.getDate(), u.getAuthor(), u.getCategory(), u.getEdit(), u.getLang(), u.getPages(), u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        bookSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        undoDeleteButton = new javax.swing.JButton();
        sortBooksButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Libros");

        searchButton.setBackground(new java.awt.Color(255, 102, 102));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Borrar");
        deleteButton.setBorderPainted(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 102, 102));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(255, 102, 102));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Nuevo");
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplaresl", "Stock", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        undoDeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        undoDeleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        undoDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        undoDeleteButton.setText("Undo");
        undoDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoDeleteButtonActionPerformed(evt);
            }
        });

        sortBooksButton.setBackground(new java.awt.Color(255, 102, 102));
        sortBooksButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sortBooksButton.setForeground(new java.awt.Color(255, 255, 255));
        sortBooksButton.setText("Sort");
        sortBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBooksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(sortBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(undoDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(bookSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)))
                        .addGap(50, 50, 50))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(editButton)
                    .addComponent(addButton)
                    .addComponent(undoDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
    }//GEN-LAST:event_jTable1MousePressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Dashboard.ShowJPanel(new UpBooks());
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    DAOBooks dao = new DAOBooksImpl();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if (jTable1.getSelectedRows().length < 1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más libros a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
    } else {
        for (int i : jTable1.getSelectedRows()) {
            try {
                int idLibro = (int) jTable1.getValueAt(i, 0);
                com.mycompany.models.Books libro = dao.getBookById(idLibro);
                pilaEliminados.push(libro); 
                dao.eliminar(idLibro);
                model.removeRow(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }  
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            try {
                int bookId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOBooks dao = new DAOBooksImpl();
                Dashboard.ShowJPanel(new UpBooks(dao.getBookById(bookId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el libro a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            DAOBooks dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(bookSearch.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitle(), u.getDate(), u.getAuthor(), u.getCategory(), u.getEdit(), u.getLang(), u.getPages(), u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void undoDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoDeleteButtonActionPerformed
       if (!pilaEliminados.isEmpty()) {
        DAOBooks dao = new DAOBooksImpl();
        com.mycompany.models.Books libroRecuperado = pilaEliminados.pop();
        try {
            dao.insertar(libroRecuperado);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                libroRecuperado.getId(),
                libroRecuperado.getTitle(),
                libroRecuperado.getDate(),
                libroRecuperado.getAuthor(),
                libroRecuperado.getCategory(),
                libroRecuperado.getEdit(),
                libroRecuperado.getLang(),
                libroRecuperado.getPages(),
                libroRecuperado.getDescription(),
                libroRecuperado.getEjemplares(),
                libroRecuperado.getStock(),
                libroRecuperado.getAvailable()
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay libros eliminados para restaurar.");
    }
    }//GEN-LAST:event_undoDeleteButtonActionPerformed

    private void sortBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBooksButtonActionPerformed
        try {
        DAOBooks dao = new DAOBooksImpl();
        List<com.mycompany.models.Books> lista = dao.listar("");
        mergeSortBooks(lista, 0, lista.size() - 1);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (com.mycompany.models.Books u : lista) {
            model.addRow(new Object[]{
                u.getId(), u.getTitle(), u.getDate(), u.getAuthor(),
                u.getCategory(), u.getEdit(), u.getLang(), u.getPages(),
                u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()
            });
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_sortBooksButtonActionPerformed
private void mergeSortBooks(List<com.mycompany.models.Books> list, int left, int right) {
    if (left < right) {
        int middle = (left + right) / 2;
        mergeSortBooks(list, left, middle);
        mergeSortBooks(list, middle + 1, right);
        mergeBooks(list, left, middle, right);
    }
}

private void mergeBooks(List<com.mycompany.models.Books> list, int left, int middle, int right) {
    List<com.mycompany.models.Books> leftList = new ArrayList<>(list.subList(left, middle + 1));
    List<com.mycompany.models.Books> rightList = new ArrayList<>(list.subList(middle + 1, right + 1));
    int i = 0, j = 0, k = left;

    while (i < leftList.size() && j < rightList.size()) {
        if (leftList.get(i).getTitle().compareToIgnoreCase(rightList.get(j).getTitle()) <= 0) {
            list.set(k++, leftList.get(i++));
        } else {
            list.set(k++, rightList.get(j++));
        }
    }

    while (i < leftList.size()) list.set(k++, leftList.get(i++));
    while (j < rightList.size()) list.set(k++, rightList.get(j++));
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField bookSearch;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sortBooksButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton undoDeleteButton;
    // End of variables declaration//GEN-END:variables
}