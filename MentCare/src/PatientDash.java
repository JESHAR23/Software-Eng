import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDash implements ActionListener {

    JFrame Patientpage = new JFrame();

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

    //LeftCentre
    JPanel pnlLCNorth = new JPanel();
    JPanel pnlLCSouth = new JPanel();
    JPanel pnlLCCentre = new JPanel();
    JPanel pnlLCWest = new JPanel();
    JPanel pnlLCEast = new JPanel();

    //LeftCCentre
    JPanel pnlLCCCentre = new JPanel();

    JButton btnSignOut = new JButton("Sign Out");
    JButton btnAdd = new JButton("Add");
    JButton btnCancel = new JButton("Cancel");
    JButton btnEdit = new JButton("Edit");
    JButton btnSend = new JButton("-->");

    ImageIcon imglogo = new ImageIcon("logoinverted.png");
    ImageIcon imguser = new ImageIcon();
    ImageIcon smallicon = new ImageIcon("logo.png");

    JLabel lblName = new JLabel("Full Name : ");
    JLabel lblID = new JLabel("ID : ");
    JLabel lbldob = new JLabel("Date of Birth : ");
    JLabel lblNumber = new JLabel("Contact Number : ");
    JLabel lblemail = new JLabel("Email : ");
    JLabel lblmedicalAid = new JLabel("Medical Aid : ");
    JLabel lblApointments = new JLabel("Appointments : ");
    JLabel lblTitle = new JLabel("Patient Dashboard : ");
    JLabel lblChatTitle = new JLabel("MentCare Chat Bot : ");
    JLabel lblChatOut = new JLabel("Example output from AI");
    JLabel lbllogoicon = new JLabel();
    JLabel lbluserpic = new JLabel();

    JTextField txtName = new JTextField();
    JTextField txtID = new JTextField();
    JTextField txtdob = new JTextField();
    JTextField txtNumber = new JTextField();
    JTextField txtemail = new JTextField();
    JTextField txtmedicalAid = new JTextField();
    JTextField txtuserin = new JTextField();

    JTable dbtAppoint = new JTable();

    PatientDash() {
        Patientpage.setVisible(true);
        Patientpage.setSize(1000,550);
        Patientpage.setResizable(false);
        Patientpage.setTitle("MentCare Patient Record");
        Patientpage.setIconImage(smallicon.getImage());
        Patientpage.setLayout(new BorderLayout());
        Patientpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlLeft.setLayout(new BorderLayout());
        pnlLeftCentre.setLayout(new BorderLayout());
        pnlLCNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlLCSouth.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlLCCentre.setLayout(new BorderLayout());
        pnlLCCCentre.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlLCWest.setPreferredSize(new Dimension(50,0));
        pnlLCEast.setPreferredSize(new Dimension(50,0));

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

        btnEdit.addActionListener(this);
        btnSignOut.addActionListener(this);
        btnAdd.addActionListener(this);
        btnCancel.addActionListener(this);

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

        pnlRCSouth.add(dbtAppoint);
        pnlRCCentre.add(lblApointments);

        pnlRightNorth.add(lblTitle);
        pnlRightSouth.add(btnAdd);
        pnlRightSouth.add(btnCancel);

        lbllogoicon.setIcon(imglogo);

        pnlLeftSouth.add(btnSignOut);
        pnlLeftNorth.add(lbllogoicon);

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

        txtuserin.setColumns(10);

        pnlLCSouth.add(txtuserin);
        pnlLCSouth.add(btnSend);
        pnlLCCCentre.add(lblChatOut,BorderLayout.CENTER);
        pnlLCCentre.add(pnlLCCCentre);
        pnlLCNorth.add(lblChatTitle);

        //Left Centre
        pnlLeftCentre.add(pnlLCNorth,BorderLayout.NORTH);
        pnlLeftCentre.add(pnlLCSouth,BorderLayout.SOUTH);
        pnlLCCentre.add(pnlLCWest,BorderLayout.WEST);
        pnlLCCentre.add(pnlLCEast,BorderLayout.EAST);
        pnlLeftCentre.add(pnlLCCentre,BorderLayout.CENTER);

        //Left
        pnlLeft.add(pnlLeftNorth,BorderLayout.NORTH);
        pnlLeft.add(pnlLeftSouth,BorderLayout.SOUTH);
        pnlLeft.add(pnlLeftCentre,BorderLayout.CENTER);

        Patientpage.add(pnlLeft,BorderLayout.WEST);
        Patientpage.add(pnlRight,BorderLayout.EAST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
