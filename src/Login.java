import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.BoxLayout.LINE_AXIS;

public class Login implements ActionListener {

    JFrame loginpage = new JFrame();
    JPanel btnlayout = new JPanel();
    Container cp = new Container();
    JButton btnLogin = new JButton("Login");
    JButton btnSignup = new JButton("Signup");

    Login(){
        loginpage.setVisible(true);
        loginpage.setSize(650,350);
        loginpage.setResizable(false);
        loginpage.setTitle("MentCare Login");
        loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnlayout.setLayout(new FlowLayout(FlowLayout.CENTER,75,25));
        loginpage.setLayout(new BorderLayout(200,100));

        btnLogin.setSize(75,30);
        //btnLogin.setBounds(225,50,75,30);
        btnLogin.setVisible(true);
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.addActionListener(this::actionPerformed);

        btnSignup.setSize(75,30);
        //btnSignup.setBounds(225,50,75,30);
        btnSignup.setVisible(true);
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSignup.addActionListener(this::actionPerformed);

        btnlayout.add(btnSignup);
        btnlayout.add(btnLogin);
        loginpage.add(btnlayout,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
