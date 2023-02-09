
package Calculation;


public class Calculator extends javax.swing.JFrame {

    double firstNumber;
    double secondNumber;
    double result;
    
    String operations;
    
    public Calculator() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jBtn15 = new javax.swing.JButton();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn10 = new javax.swing.JButton();
        jBtn11 = new javax.swing.JButton();
        jBtn12 = new javax.swing.JButton();
        jBtn13 = new javax.swing.JButton();
        jBtn14 = new javax.swing.JButton();
        jBtn16 = new javax.swing.JButton();
        jBtn17 = new javax.swing.JButton();
        jBtn18 = new javax.swing.JButton();
        jBtn19 = new javax.swing.JButton();
        jBtn20 = new javax.swing.JButton();
        jBtn21 = new javax.swing.JButton();
        jBtn22 = new javax.swing.JButton();
        jBtn23 = new javax.swing.JButton();
        jBtn24 = new javax.swing.JButton();
        jBtn25 = new javax.swing.JButton();
        jBtn26 = new javax.swing.JButton();
        jBtn27 = new javax.swing.JButton();

        jBtn15.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn15.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtn1.setBackground(new java.awt.Color(204, 204, 204));
        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn1.setText("1");
        jBtn1.setBorder(null);
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setBackground(new java.awt.Color(204, 204, 204));
        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn2.setText("2");
        jBtn2.setBorder(null);
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setBackground(new java.awt.Color(204, 204, 204));
        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn3.setText("3");
        jBtn3.setBorder(null);
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setBackground(new java.awt.Color(204, 204, 204));
        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn4.setText("4");
        jBtn4.setBorder(null);
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setBackground(new java.awt.Color(204, 204, 204));
        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn5.setText("5");
        jBtn5.setBorder(null);
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setBackground(new java.awt.Color(204, 204, 204));
        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn6.setText("6");
        jBtn6.setBorder(null);
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setBackground(new java.awt.Color(204, 204, 204));
        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn7.setText("7");
        jBtn7.setBorder(null);
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setBackground(new java.awt.Color(204, 204, 204));
        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn8.setText("8");
        jBtn8.setBorder(null);
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setBackground(new java.awt.Color(204, 204, 204));
        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn9.setText("+");
        jBtn9.setBorder(null);
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn10.setBackground(new java.awt.Color(204, 204, 204));
        jBtn10.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn10.setText("9");
        jBtn10.setBorder(null);
        jBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn10ActionPerformed(evt);
            }
        });

        jBtn11.setBackground(new java.awt.Color(204, 204, 204));
        jBtn11.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn11.setText("0");
        jBtn11.setBorder(null);
        jBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn11ActionPerformed(evt);
            }
        });

        jBtn12.setBackground(new java.awt.Color(204, 204, 204));
        jBtn12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn12.setText("-");
        jBtn12.setBorder(null);
        jBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn12ActionPerformed(evt);
            }
        });

        jBtn13.setBackground(new java.awt.Color(204, 204, 204));
        jBtn13.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn13.setText("+/-");
        jBtn13.setBorder(null);
        jBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn13ActionPerformed(evt);
            }
        });

        jBtn14.setBackground(new java.awt.Color(204, 204, 204));
        jBtn14.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn14.setText("/");
        jBtn14.setBorder(null);
        jBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn14ActionPerformed(evt);
            }
        });

        jBtn16.setBackground(new java.awt.Color(204, 204, 204));
        jBtn16.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn16.setText("*");
        jBtn16.setToolTipText("");
        jBtn16.setBorder(null);
        jBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn16ActionPerformed(evt);
            }
        });

        jBtn17.setBackground(new java.awt.Color(204, 204, 204));
        jBtn17.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn17.setText(".");
        jBtn17.setBorder(null);
        jBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn17ActionPerformed(evt);
            }
        });

        jBtn18.setBackground(new java.awt.Color(204, 204, 204));
        jBtn18.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn18.setText("c");
        jBtn18.setBorder(null);
        jBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn18ActionPerformed(evt);
            }
        });

        jBtn19.setBackground(new java.awt.Color(204, 204, 204));
        jBtn19.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn19.setText("=");
        jBtn19.setToolTipText("");
        jBtn19.setBorder(null);
        jBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn19ActionPerformed(evt);
            }
        });

        jBtn20.setBackground(new java.awt.Color(204, 204, 204));
        jBtn20.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn20.setText("X^n");
        jBtn20.setBorder(null);
        jBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn20ActionPerformed(evt);
            }
        });

        jBtn21.setBackground(new java.awt.Color(204, 204, 204));
        jBtn21.setFont(new java.awt.Font("Tahoma", 1, 24));
        jBtn21.setText("X^2");
        jBtn21.setBorder(null);
        jBtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn21ActionPerformed(evt);
            }
        });

        jBtn22.setBackground(new java.awt.Color(204, 204, 204));
        jBtn22.setFont(new java.awt.Font("Tahoma", 1, 24));
        jBtn22.setText("sqrt");
        jBtn22.setToolTipText("");
        jBtn22.setBorder(null);
        jBtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn22ActionPerformed(evt);
            }
        });

        jBtn23.setBackground(new java.awt.Color(204, 204, 204));
        jBtn23.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn23.setText("log");
        jBtn23.setBorder(null);
        jBtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn23ActionPerformed(evt);
            }
        });

        jBtn24.setBackground(new java.awt.Color(204, 204, 204));
        jBtn24.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn24.setText("cos");
        jBtn24.setToolTipText("");
        jBtn24.setBorder(null);
        jBtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn24ActionPerformed(evt);
            }
        });

        jBtn25.setBackground(new java.awt.Color(204, 204, 204));
        jBtn25.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn25.setText("sin");
        jBtn25.setBorder(null);
        jBtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn25ActionPerformed(evt);
            }
        });

        jBtn26.setBackground(new java.awt.Color(204, 204, 204));
        jBtn26.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jBtn26.setText("%");
        jBtn26.setBorder(null);
        jBtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn26ActionPerformed(evt);
            }
        });

        jBtn27.setBackground(new java.awt.Color(204, 204, 204));
        jBtn27.setFont(new java.awt.Font("Tahoma", 1, 24));
        jBtn27.setText("tan");
        jBtn27.setBorder(null);
        jBtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBtn27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn20, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn12ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "-";
        
        
    }

    private void jBtn13ActionPerformed(java.awt.event.ActionEvent evt) {
        double neg = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        neg = neg * (-1);
        jtxtDisplay.setText(String.valueOf(neg));
    }

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);
        
    }

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn10ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn10.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn11ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn11.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn18ActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDisplay.setText("");
    }

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "+";
    }

    private void jBtn14ActionPerformed(java.awt.event.ActionEvent evt) {/
        firstNumber = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "/";
    }

    private void jBtn16ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "*";
    }

    private void jBtn17ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jtxtDisplay.getText() + jBtn17.getText();
        jtxtDisplay.setText(EnterNumber);
    }

    private void jBtn19ActionPerformed(java.awt.event.ActionEvent evt) {
        String answer;
        secondNumber = Double.parseDouble(jtxtDisplay.getText());
        
        if(operations == "+"){
            result = firstNumber + secondNumber;
            answer = String.format("%2.2f", result);
            jtxtDisplay.setText(answer);
        }else if(operations == "-"){
            result = firstNumber - secondNumber;
            answer = String.format("%2.2f", result);
            jtxtDisplay.setText(answer);
        }else if(operations == "/"){
            result = firstNumber / secondNumber;
            answer = String.format("%2.2f", result);
            jtxtDisplay.setText(answer);
        }else if(operations == "*"){
            result = firstNumber * secondNumber;
            answer = String.format("%2.2f", result);
            jtxtDisplay.setText(answer);
        }else if(operations == "Math.sqrt"){
            result = Math.sqrt(secondNumber);
            answer = String.format("%2.2f", result);
            jtxtDisplay.setText(answer);
        }
    }

    private void jBtn20ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jBtn21ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "X^2";
    }

    private void jBtn22ActionPerformed(java.awt.event.ActionEvent evt) {
        firstNumber = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "sqrt";
                
    }

    private void jBtn23ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jBtn24ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jBtn25ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jBtn26ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jBtn27ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn10;
    private javax.swing.JButton jBtn11;
    private javax.swing.JButton jBtn12;
    private javax.swing.JButton jBtn13;
    private javax.swing.JButton jBtn14;
    private javax.swing.JButton jBtn15;
    private javax.swing.JButton jBtn16;
    private javax.swing.JButton jBtn17;
    private javax.swing.JButton jBtn18;
    private javax.swing.JButton jBtn19;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn20;
    private javax.swing.JButton jBtn21;
    private javax.swing.JButton jBtn22;
    private javax.swing.JButton jBtn23;
    private javax.swing.JButton jBtn24;
    private javax.swing.JButton jBtn25;
    private javax.swing.JButton jBtn26;
    private javax.swing.JButton jBtn27;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JTextField jtxtDisplay;
    
}
