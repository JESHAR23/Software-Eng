import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.BoxLayout.LINE_AXIS;

public class Login implements ActionListener {

    JFrame loginpage = new JFrame();

    JPanel btnlayout = new JPanel();
    JPanel detaillayout = new JPanel();
    JPanel imagelogo = new JPanel();

    JLabel lblName = new JLabel("Full Name: ");
    JLabel lblPass = new JLabel("Password : ");

    JTextField txtName = new JTextField();
    JTextField txtPass = new JTextField();

    JRadioButton rbStaff = new JRadioButton("Staff");
    JRadioButton rbPatient = new JRadioButton("Patient");

    ButtonGroup rbGroup = new ButtonGroup();

    JButton btnLogin = new JButton("Login");
    JButton btnSignup = new JButton("Signup");

    ImageIcon logoicon = new ImageIcon("logo.png");

    Login(){
        loginpage.setVisible(true);
        loginpage.setSize(650,350);
        loginpage.setResizable(false);
        loginpage.setTitle("MentCare Login");
        loginpage.setIconImage(logoicon.getImage());
        loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnlayout.setLayout(new FlowLayout(FlowLayout.CENTER,75,25));
        btnlayout.setBackground(Color.black);
        detaillayout.setLayout(new GridLayout(3,2));
        detaillayout.setBackground(Color.black);
        loginpage.setLayout(new BorderLayout(200,100));
        loginpage.setBackground(Color.black);

        btnLogin.setSize(75,30);
        btnLogin.setVisible(true);
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.setBackground(Color.white);
        btnLogin.addActionListener(this::actionPerformed);

        btnSignup.setSize(75,30);
        btnSignup.setVisible(true);
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSignup.setBackground(Color.white);
        btnSignup.addActionListener(this::actionPerformed);

        rbStaff.setBackground(Color.black);
        rbPatient.setBackground(Color.black);
        rbGroup.add(rbStaff);
        rbGroup.add(rbPatient);

        btnlayout.add(btnSignup);
        btnlayout.add(btnLogin);

        detaillayout.add(lblName);
        detaillayout.add(txtName);
        detaillayout.add(lblPass);
        detaillayout.add(txtPass);
        detaillayout.add(rbStaff);
        detaillayout.add(rbPatient);

        //loginpage.add(,BorderLayout.NORTH);
        loginpage.add(detaillayout,BorderLayout.CENTER);
        loginpage.add(btnlayout,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
