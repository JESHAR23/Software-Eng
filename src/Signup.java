import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup implements  ActionListener {

    JFrame Signuppage = new JFrame();

    JPanel pnlsouth = new JPanel();
    JPanel pnlcentre = new JPanel();
    JPanel pnlnorth = new JPanel();
    JPanel pnleast = new JPanel();
    JPanel pnlwest = new JPanel();

    JLabel lblName = new JLabel("Full Name : ");
    JLabel lblPass = new JLabel("Password : ");
    JLabel lbldob = new JLabel("Date of Birth : ");
    JLabel lblNumber = new JLabel("Contact Number : ");
    JLabel lblemail = new JLabel("Email : ");
    JLabel companyimage = new JLabel();

    JTextField txtName = new JTextField();
    JTextField txtPass = new JTextField();
    JTextField txtdob = new JTextField();
    JTextField txtNumber = new JTextField();
    JTextField txtemail = new JTextField();

    JRadioButton rbMedAid = new JRadioButton("Medical Aid");
    JRadioButton rbCashCard = new JRadioButton("Cash / Card");

    ButtonGroup rbGroup = new ButtonGroup();

    JButton btnGoBack = new JButton("Go Back");
    JButton btnSignup = new JButton("Signup");

    ImageIcon logoicon = new ImageIcon("logoinverted.png");
    ImageIcon smallicon = new ImageIcon("logo.png");

    Signup(){
        Signuppage.setVisible(true);
        Signuppage.setSize(750,450);
        Signuppage.setResizable(false);
        Signuppage.setTitle("MentCare Signup");
        Signuppage.setIconImage(smallicon.getImage());
        Signuppage.setLayout(new BorderLayout(0,0));
        Signuppage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlsouth.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
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

        rbMedAid.setBackground(Color.black);
        rbCashCard.setBackground(Color.black);
        rbMedAid.setForeground(Color.white);
        rbCashCard.setForeground(Color.white);
        rbMedAid.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rbCashCard.setCursor(new Cursor(Cursor.HAND_CURSOR));

        rbGroup.add(rbMedAid);
        rbGroup.add(rbCashCard);

        btnSignup.setBackground(Color.white);
        btnGoBack.setBackground(Color.white);
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGoBack.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnGoBack.setPreferredSize(new Dimension(150,30));
        btnSignup.setPreferredSize(new Dimension(150,30));

        btnSignup.addActionListener(this);
        btnGoBack.addActionListener(this);

        pnlnorth.add(companyimage);

        pnlsouth.add(btnGoBack);
        pnlsouth.add(btnSignup);

        lblName.setForeground(Color.white);
        lblPass.setForeground(Color.white);
        lbldob.setForeground(Color.white);
        lblNumber.setForeground(Color.white);
        lblemail.setForeground(Color.white);

        pnlcentre.add(lblName);
        pnlcentre.add(txtName);
        pnlcentre.add(lblPass);
        pnlcentre.add(txtPass);
        pnlcentre.add(lbldob);
        pnlcentre.add(txtdob);
        pnlcentre.add(lblNumber);
        pnlcentre.add(txtNumber);
        pnlcentre.add(lblemail);
        pnlcentre.add(txtemail);
        pnlcentre.add(rbMedAid);
        pnlcentre.add(rbCashCard);


        Signuppage.add(pnlcentre,BorderLayout.CENTER);
        Signuppage.add(pnlnorth,BorderLayout.NORTH);
        Signuppage.add(pnlsouth,BorderLayout.SOUTH);
        Signuppage.add(pnleast,BorderLayout.EAST);
        Signuppage.add(pnlwest,BorderLayout.WEST);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
