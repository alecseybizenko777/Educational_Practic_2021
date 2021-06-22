package Practic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactEditor extends javax.swing.JFrame {

    public ContactEditor() {
        initComponents();
    }


    private void initComponents() {

        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jSeparator1 = new JSeparator();
        jButton = new JButton();
        jButton1 = new JButton();
        jButton2 = new JButton();

        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jScrollBar1 = new JScrollBar();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jSeparator2 = new JSeparator();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jFormattedTextField1 = new JFormattedTextField();
        jFormattedTextField2 = new JFormattedTextField();
        jFormattedTextField3 = new JFormattedTextField();
        jFormattedTextField4 = new JFormattedTextField();
        jFormattedTextField5 = new JFormattedTextField();
        jFormattedTextField6 = new JFormattedTextField();
        jFormattedTextField7 = new JFormattedTextField();
        jFormattedTextField8 = new JFormattedTextField();
        jFormattedTextField9 = new JFormattedTextField();
        jFormattedTextField10 = new JFormattedTextField();
        jFormattedTextField11 = new JFormattedTextField();
        jFormattedTextField12 = new JFormattedTextField();
        jButton3 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setTitle("Application");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width/2 - 450, dimension.height/2 - 365, 900, 730);

        jLabel2.setFont(new Font("Times New Roman", 0, 36));
        jPanel2.setBackground(new Color(102, 102, 102));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Сводка отчётов:");
        jLabel2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jButton.setFont(new Font("Times New Roman", 0, 18));
        jButton.setText("Ахременков А. С.");
        jButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Times New Roman", 0, 18));
        jButton1.setText("Быценко А. В.");
        jButton1.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Times New Roman", 0, 18));
        jButton2.setText("Шугин В.В..");
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new Color(255, 255, 255));
        jButton7.setFont(new Font("Times New Roman", 0, 18));
        jButton7.setText("Дударенко Д. А.");
        jButton7.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jButton5.setFont(new Font("Times New Roman", 0, 18));
        jButton5.setText("Ельчанинов Н. А.");
        jButton5.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new Font("Times New Roman", 0, 18));
        jButton6.setText("Кабыченко А. С.");
        jButton6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jButton8.setFont(new Font("Times New Roman", 0, 18));
        jButton8.setText("Хмелёв В. Д.");
        jButton8.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jButton9.setBackground(new Color(51, 51, 255));
        jButton9.setFont(new Font("Times New Roman", 0, 18));
        jButton9.setText("Зацепина В. А.");
        jButton9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jScrollBar1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jLabel1.setFont(new Font("Times New Roman", 0, 24));
        jLabel1.setText("Имя");

        jLabel3.setFont(new Font("Times New Roman", 0, 24));
        jLabel3.setText("Фамилия");

        jLabel4.setFont(new Font("Times New Roman", 0, 24));
        jLabel4.setText("Отчество");

        jLabel5.setFont(new Font("Times New Roman", 0, 24));
        jLabel5.setText("Номер телефона");

        jLabel6.setFont(new Font("Times New Roman", 0, 24));
        jLabel6.setText("Электронный адресс");

        jLabel7.setFont(new Font("Times New Roman", 0, 24));
        jLabel7.setText("Город");

        jLabel8.setFont(new Font("Times New Roman", 0, 24));
        jLabel8.setText("Улица");

        jLabel9.setFont(new Font("Times New Roman", 0, 24));
        jLabel9.setText("Номер дома");

        jLabel10.setFont(new Font("Times New Roman", 0, 24));
        jLabel10.setText("Квартира");

        jLabel11.setFont(new Font("Times New Roman", 0, 24));
        jLabel11.setText("Номер водительских прав");

        jLabel12.setFont(new Font("Times New Roman", 0, 24));
        jLabel12.setText("Водительский стаж");

        jSeparator2.setOrientation(SwingConstants.VERTICAL);

        jLabel13.setFont(new Font("Times New Roman", 0, 24));
        jLabel13.setText("Количество обращений");

        jLabel14.setFont(new Font("Times New Roman", 0, 24));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.setCursor(new Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField1.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField6ActionPerformed(evt);
            }
        });

        jFormattedTextField2.setEditable(false);
        jFormattedTextField2.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField7ActionPerformed(evt);
            }
        });

        jFormattedTextField3.setEditable(false);
        jFormattedTextField3.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField3.setToolTipText("");
        jFormattedTextField3.setCursor(new java.awt.Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField3.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField8ActionPerformed(evt);
            }
        });

        jFormattedTextField4.setEditable(false);
        jFormattedTextField4.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField4.setToolTipText("");
        jFormattedTextField4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField4.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField9ActionPerformed(evt);
            }
        });

        jFormattedTextField5.setEditable(false);
        jFormattedTextField5.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField5.setToolTipText("");
        jFormattedTextField5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField5.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField10ActionPerformed(evt);
            }
        });

        jFormattedTextField6.setEditable(false);
        jFormattedTextField6.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField6.setToolTipText("");
        jFormattedTextField6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField6.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField11ActionPerformed(evt);
            }
        });

        jFormattedTextField7.setEditable(false);
        jFormattedTextField7.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField7.setToolTipText("");
        jFormattedTextField7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField7.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField12ActionPerformed(evt);
            }
        });

        jFormattedTextField8.setEditable(false);
        jFormattedTextField8.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField8.setToolTipText("");
        jFormattedTextField8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField8.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField14ActionPerformed(evt);
            }
        });

        jFormattedTextField9.setEditable(false);
        jFormattedTextField9.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField9.setToolTipText("");
        jFormattedTextField9.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField9.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField15ActionPerformed(evt);
            }
        });

        jFormattedTextField10.setEditable(false);
        jFormattedTextField10.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField10.setToolTipText("");
        jFormattedTextField10.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField10.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField16ActionPerformed(evt);
            }
        });

        jFormattedTextField11.setEditable(false);
        jFormattedTextField11.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField11.setToolTipText("");
        jFormattedTextField11.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField11.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField17ActionPerformed(evt);
            }
        });

        jFormattedTextField12.setEditable(false);
        jFormattedTextField12.setHorizontalAlignment(JTextField.LEFT);
        jFormattedTextField12.setToolTipText("");
        jFormattedTextField12.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jFormattedTextField12.setFont(new Font("Times New Roman", 0, 24));
        jFormattedTextField12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jFormattedTextField18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                    .addGap(29, 29, 29))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField2, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField3, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField4, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField5, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField6, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField7, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField8, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField9, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField10, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField11, GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField12, GroupLayout.Alignment.TRAILING))
                    .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 20,GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jFormattedTextField10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jFormattedTextField9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38))
        );

        jButton3.setFont(new Font("Times New Roman", 0, 18));
        jButton3.setText("Загрузить");

        jButton10.setFont(new Font("Times New Roman", 0, 18));
        jButton10.setText("Выгрузить");

        jButton11.setFont(new Font("Times New Roman", 0, 18));
        jButton11.setText("Сохранить");
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 342, Short.MAX_VALUE)
                    .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                    .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton10, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton11, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton11ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField6ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField7ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField8ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField9ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField10ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField11ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField12ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField14ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField15ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField16ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField17ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jFormattedTextField18ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

        private JButton jButton1, jButton2, jButton3, jButton, jButton5,
                jButton6, jButton7, jButton8, jButton9, jButton10, jButton11;

        private JFormattedTextField jFormattedTextField1, jFormattedTextField2, jFormattedTextField3, jFormattedTextField4,
                jFormattedTextField5, jFormattedTextField6, jFormattedTextField7, jFormattedTextField8,
                jFormattedTextField9, jFormattedTextField10, jFormattedTextField11, jFormattedTextField12;

        private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7,
                jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14;

        private JPanel jPanel1, jPanel2;

        private JScrollBar jScrollBar1;

        private JSeparator jSeparator1, jSeparator2;


}