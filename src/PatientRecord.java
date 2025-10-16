import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientRecord implements ActionListener {

    JFrame PatientRpage = new JFrame();

    JPanel pnlLeft = new JPanel();
    JPanel pnlRight = new JPanel();

    //right side
    JPanel pnlRightSouth = new JPanel();
    JPanel pnlRightNorth = new JPanel();
    JPanel pnlRightCentre = new JPanel();

    //Right side Centre
    JPanel pnlRCNorth = new JPanel();
    JPanel pnlRCCentre = new JPanel();
    JPanel pnlRCSouth = new JPanel();

    //RCNorth
    JPanel pnlRCNLeft = new JPanel();
    JPanel pnlRCNRight = new JPanel();

    //Left side
    JPanel pnlLeftNorth = new JPanel();
    JPanel pnlLeftSouth = new JPanel();
    JPanel pnlLeftCentre = new JPanel();

    JButton btnGoBack = new JButton("Go Back");
    JButton btnEdit = new JButton("Edit");
    JButton btnSave = new JButton("Save");
    JButton btnDash = new JButton("Dashboard");

    ImageIcon imglogo = new ImageIcon("logoinverted.png");
    ImageIcon imguser = new ImageIcon();
    ImageIcon smallicon = new ImageIcon("logo.png");

    JLabel lblName = new JLabel("Full Name : ");
    JLabel lblID = new JLabel("ID : ");
    JLabel lbldob = new JLabel("Date of Birth : ");
    JLabel lblNumber = new JLabel("Contact Number : ");
    JLabel lblemail = new JLabel("Email : ");
    JLabel lblmedicalAid = new JLabel("Medical Aid : ");
    JLabel lblPatientnote = new JLabel("Patient Notes : ");
    JLabel lblTitle = new JLabel("Patient Record : ");
    JLabel lbllogoicon = new JLabel();
    JLabel lbluserpic = new JLabel();

    JTextField txtName = new JTextField();
    JTextField txtID = new JTextField();
    JTextField txtdob = new JTextField();
    JTextField txtNumber = new JTextField();
    JTextField txtemail = new JTextField();
    JTextField txtPatNote = new JTextField();
    JTextField txtmedicalAid = new JTextField();

    PatientRecord(){
        PatientRpage.setVisible(true);
        PatientRpage.setSize(1000,550);
        PatientRpage.setResizable(false);
        PatientRpage.setTitle("MentCare Patient Record");
        PatientRpage.setIconImage(smallicon.getImage());
        PatientRpage.setLayout(new BorderLayout());
        PatientRpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlLeft.setLayout(new BorderLayout());
        pnlLeftCentre.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlLeft.setPreferredSize(new Dimension(300,1));
        pnlLeftNorth.setPreferredSize(new Dimension(1,100));
        pnlLeftSouth.setPreferredSize(new Dimension(1,55));

        pnlRight.setLayout(new BorderLayout());
        pnlRight.setPreferredSize(new Dimension(700,1));
        pnlRightSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlRightNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlRightCentre.setLayout(new BorderLayout());

        pnlRightNorth.setPreferredSize(new Dimension(1,55));
        pnlRightSouth.setPreferredSize(new Dimension(1,55));

        pnlRCNorth.setLayout(new FlowLayout(FlowLayout.LEFT,50,0));
        pnlRCSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlRCCentre.setLayout(new FlowLayout(FlowLayout.CENTER,40,0));
        pnlRCNRight.setLayout(new GridLayout(6,2));
        pnlRCNLeft.setPreferredSize(new Dimension(100,200));

        //pnlRCNorth.setPreferredSize(new Dimension(1,100));
        pnlRCSouth.setPreferredSize(new Dimension(1,50));

        btnDash.addActionListener(this);
        btnGoBack.addActionListener(this);
        btnEdit.addActionListener(this);
        btnSave.addActionListener(this);

        lbluserpic.setIcon(imguser);

        pnlRCNLeft.add(lbluserpic);

        pnlRCNRight.add(lblName);
        pnlRCNRight.add(txtName);
        pnlRCNRight.add(lblID);
        pnlRCNRight.add(txtID);
        pnlRCNRight.add(lbldob);
        pnlRCNRight.add(txtdob);
        pnlRCNRight.add(lblmedicalAid);
        pnlRCNRight.add(txtmedicalAid);
        pnlRCNRight.add(lblNumber);
        pnlRCNRight.add(txtNumber);
        pnlRCNRight.add(lblemail);
        pnlRCNRight.add(txtemail);

        txtPatNote.setColumns(50);
        pnlRCSouth.add(txtPatNote);
        pnlRCCentre.add(lblPatientnote);

        pnlRightNorth.add(lblTitle);
        pnlRightSouth.add(btnEdit);
        pnlRightSouth.add(btnSave);
        pnlRightSouth.add(btnDash);

        lbllogoicon.setIcon(imglogo);

        pnlLeftSouth.add(btnGoBack);
        pnlLeftNorth.add(lbllogoicon);
        pnlLeftCentre.add(btnDash);

        //Right Centre North
        pnlRCNorth.add(pnlRCNLeft,BorderLayout.WEST);
        pnlRCNorth.add(pnlRCNRight,BorderLayout.EAST);

        //Right Centre
        pnlRightCentre.add(pnlRCNorth,BorderLayout.NORTH);
        pnlRightCentre.add(pnlRCSouth,BorderLayout.SOUTH);
        pnlRightCentre.add(pnlRCCentre,BorderLayout.CENTER);

        //Right
        pnlRight.add(pnlRightNorth,BorderLayout.NORTH);
        pnlRight.add(pnlRightSouth,BorderLayout.SOUTH);
        pnlRight.add(pnlRightCentre,BorderLayout.CENTER);

        //Left
        pnlLeft.add(pnlLeftNorth,BorderLayout.NORTH);
        pnlLeft.add(pnlLeftSouth,BorderLayout.SOUTH);
        pnlLeft.add(pnlLeftCentre,BorderLayout.CENTER);

        PatientRpage.add(pnlLeft,BorderLayout.WEST);
        PatientRpage.add(pnlRight,BorderLayout.EAST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
