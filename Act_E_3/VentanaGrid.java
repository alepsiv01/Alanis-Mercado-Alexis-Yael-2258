package Act_Ex_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame {
    private Label lbletiqueta1;
    private Label lbletiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private GridLayout layout;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        layout = new GridLayout(3,2);
        this.setSize(800,600);
        this.setLayout(layout);
        lbletiqueta1 = new Label("Etiqueta 1");
        this.add(lbletiqueta1,0);
        txtCuadro1 = new TextField(30);
        this.add(txtCuadro1,1);
        lbletiqueta2 = new Label("Etiqueta 2");
        this.add(lbletiqueta2,2);
        txtCuadro2 = new TextField(30);
        this.add(txtCuadro2,3);
        boton1 = new Button("presioname");
        this.add(boton1,4);

        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = txtCuadro1.getText() + " " + txtCuadro2.getText();
                JOptionPane.showMessageDialog(null,texto);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);


    }
}
