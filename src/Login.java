import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    JFrame Loginpage = new JFrame();

    JPanel pnlsouth = new JPanel();
    JPanel pnlcentre = new JPanel();
    JPanel pnlnorth = new JPanel();
    JPanel pnleast = new JPanel();
    JPanel pnlwest = new JPanel();
    JPanel pnlsouthsouth = new JPanel();
    JPanel pnlnorthsouth = new JPanel();

    JLabel lblName = new JLabel("Full Name: ");
    JLabel lblPass = new JLabel("Password : ");

    JLabel companyimage = new JLabel();

    JTextField txtName = new JTextField();
    JTextField txtPass = new JTextField();

    JRadioButton rbStaff = new JRadioButton("Staff");
    JRadioButton rbPatient = new JRadioButton("Patient");

    ButtonGroup rbGroup = new ButtonGroup();

    JButton btnLogin = new JButton("Login");
    JButton btnSignup = new JButton("Signup");
    JButton btnForgotpass = new JButton("Forgot Password");

    ImageIcon logoicon = new ImageIcon("logoinverted.png");
    ImageIcon smallicon = new ImageIcon("logo.png");

    Login(){
        Loginpage.setVisible(true);
        Loginpage.setSize(750,450);
        Loginpage.setResizable(false);
        Loginpage.setTitle("MentCare Login");
        Loginpage.setIconImage(smallicon.getImage());
        Loginpage.setLayout(new BorderLayout(0,0));
        Loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlsouthsouth.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        pnlnorthsouth.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        pnlsouth.setLayout(new GridLayout(2,1));
        pnlcentre.setLayout(new GridLayout(6,2,10,15));

        pnlnorth.setPreferredSize(new Dimension(100,100));
        pnlsouth.setPreferredSize(new Dimension(100,55));
        pnleast.setPreferredSize(new Dimension(100,200));
        pnlwest.setPreferredSize(new Dimension(100,200));
        pnlcentre.setPreferredSize(new Dimension(250,275));

        pnlnorth.setBackground(Color.black);
        pnlsouth.setBackground(Color.black);
        pnleast.setBackground(Color.black);
        pnlwest.setBackground(Color.black);
        pnlcentre.setBackground(Color.black);

        companyimage.setIcon(logoicon);
        companyimage.createImage(180,75);

        rbStaff.setBackground(Color.black);
        rbPatient.setBackground(Color.black);
        rbStaff.setForeground(Color.white);
        rbPatient.setForeground(Color.white);
        rbStaff.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rbPatient.setCursor(new Cursor(Cursor.HAND_CURSOR));

        rbGroup.add(rbStaff);
        rbGroup.add(rbPatient);

        btnSignup.setBackground(Color.white);
        btnLogin.setBackground(Color.white);
        btnForgotpass.setBackground(Color.white);
        btnForgotpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnLogin.setPreferredSize(new Dimension(150,30));
        btnSignup.setPreferredSize(new Dimension(150,30));
        btnForgotpass.setPreferredSize(new Dimension(150,30));

        pnlnorth.add(companyimage);

        pnlnorthsouth.add(btnLogin);
        pnlnorthsouth.add(btnSignup);
        pnlsouthsouth.add(btnForgotpass);

        pnlsouth.add(pnlnorthsouth);
        pnlsouth.add(pnlsouthsouth);

        lblName.setForeground(Color.white);
        lblPass.setForeground(Color.white);

        pnlcentre.add(lblName);
        pnlcentre.add(txtName);
        pnlcentre.add(lblPass);
        pnlcentre.add(txtPass);
        pnlcentre.add(rbStaff);
        pnlcentre.add(rbPatient);


        Loginpage.add(pnlcentre,BorderLayout.CENTER);
        Loginpage.add(pnlnorth,BorderLayout.NORTH);
        Loginpage.add(pnlsouth,BorderLayout.SOUTH);
        Loginpage.add(pnleast,BorderLayout.EAST);
        Loginpage.add(pnlwest,BorderLayout.WEST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
