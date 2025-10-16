import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDash implements ActionListener {

    JFrame Patientpage = new JFrame();

    JPanel pnlLeft = new JPanel();
    JPanel pnlRight = new JPanel();

    JPanel pnlChatbot = new JPanel();
    JPanel pnlChatSouth = new JPanel();
    JPanel pnlChatNorth = new JPanel();
    JPanel pnlChatCentre = new JPanel();
    JPanel pnlLeftSouth = new JPanel();
    JPanel pnlLeftNorth = new JPanel();

    JPanel pnlRightSouth = new JPanel();
    JPanel pnlRightNorth = new JPanel();
    JPanel pnlRightCenter = new JPanel();
    JPanel pnlRightCentreNorth = new JPanel();
    JPanel pnlRightCentreSouth = new JPanel();
    JPanel pnlRightCentreCentre = new JPanel();
    JPanel pnlRightCentreNorthRight = new JPanel();
    JPanel pnlRightCentreNorthLeft = new JPanel();

    JLabel imglog = new JLabel();
    JLabel imguserPic = new JLabel();

    ImageIcon userPic = new ImageIcon();
    ImageIcon logoicon = new ImageIcon("logoinverted.png");
    ImageIcon smallicon = new ImageIcon("logo.png");

    JButton btnSignout = new JButton("Sign Out");
    JButton btnAdd = new JButton("Add");
    JButton btnCancel = new JButton("Cancel");
    JButton btnEdit = new JButton("Edit");
    JButton btnSend = new JButton("-->");

    JLabel lblName = new JLabel("Full Name : ");
    JLabel lblID = new JLabel("ID : ");
    JLabel lbldob = new JLabel("Date of Birth : ");
    JLabel lblNumber = new JLabel("Contact Number : ");
    JLabel lblemail = new JLabel("Email : ");
    JLabel lblMedicalAid = new JLabel("Medical Aid : ");
    JLabel lblAppoint = new JLabel("Appointments : ");
    JLabel lblTitle = new JLabel("Patient Records");
    JLabel lblChatTitle = new JLabel("MentCare Chat Bot");
    JLabel lbllogoicon = new JLabel();
    JLabel lbluserpic = new JLabel();

    JTextField txtUserInput = new JTextField();

    JTextField txtName = new JTextField();
    JTextField txtID = new JTextField();
    JTextField txtdob = new JTextField();
    JTextField txtNumber = new JTextField();
    JTextField txtemail = new JTextField();
    JTextField txtMedicalAid = new JTextField();

    JTable dbtAppoint = new JTable();

    PatientDash() {
        Patientpage.setVisible(true);
        Patientpage.setSize(1550,650);
        Patientpage.setResizable(false);
        Patientpage.setTitle("MentCare Signup");
        Patientpage.setIconImage(smallicon.getImage());
        Patientpage.setLayout(new GridLayout(1,2));
        Patientpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlLeft.setLayout(new BorderLayout());
        pnlRight.setLayout(new BorderLayout());
        pnlChatbot.setLayout(new BorderLayout());
        pnlRightNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlRightSouth.setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
        pnlRightCenter.setLayout(new BorderLayout());
        pnlRightCentreNorth.setLayout(new GridLayout(1,2));
        pnlRightCentreNorthRight.setLayout(new GridLayout(6,2));


        pnlChatSouth.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlLeftNorth.setPreferredSize(new Dimension(120,250));
        pnlLeftSouth.setPreferredSize(new Dimension(120,200));


        btnAdd.setPreferredSize(new Dimension(150,30));
        btnEdit.setPreferredSize(new Dimension(150,30));
        btnSignout.setPreferredSize(new Dimension(150,30));
        btnSend.setPreferredSize(new Dimension(50,30));
        btnCancel.setPreferredSize(new Dimension(150,30));

        btnAdd.addActionListener(this);
        btnEdit.addActionListener(this);
        btnSignout.addActionListener(this);
        btnSend.addActionListener(this);
        btnCancel.addActionListener(this);

        txtUserInput.setColumns(50);
        pnlChatNorth.add(lblChatTitle);
        pnlChatSouth.add(txtUserInput);
        pnlChatSouth.add(btnSend);

        pnlChatbot.add(pnlChatNorth,BorderLayout.NORTH);
        pnlChatbot.add(pnlChatSouth,BorderLayout.SOUTH);
        pnlChatbot.add(pnlChatCentre,BorderLayout.CENTER);

        lbllogoicon.setIcon(logoicon);
        lbluserpic.setIcon(userPic);
        pnlLeftNorth.add(lbllogoicon);
        pnlLeftNorth.setPreferredSize(new Dimension(23, 100));
        pnlLeftSouth.setPreferredSize(new Dimension(23,150));
        pnlRightCentreNorthLeft.add(lbluserpic);

        pnlRightCentreNorthRight.add(lblName);
        pnlRightCentreNorthRight.add(txtName);
        pnlRightCentreNorthRight.add(lblID);
        pnlRightCentreNorthRight.add(txtID);
        pnlRightCentreNorthRight.add(lbldob);
        pnlRightCentreNorthRight.add(txtdob);
        pnlRightCentreNorthRight.add(lblMedicalAid);
        pnlRightCentreNorthRight.add(txtMedicalAid);
        pnlRightCentreNorthRight.add(lblNumber);
        pnlRightCentreNorthRight.add(txtNumber);
        pnlRightCentreNorthRight.add(lblemail);
        pnlRightCentreNorthRight.add(txtemail);

        //pnlRightCentreNorthLeft.add((Component) imguserPic.getIcon());

        pnlRightCentreNorth.add(pnlRightCentreNorthLeft);
        pnlRightCentreNorth.add(pnlRightCentreNorthRight);
        pnlRightCentreCentre.add(lblAppoint);


        pnlRightSouth.add(btnAdd);
        pnlRightSouth.add(btnCancel);
        pnlRightSouth.add(btnEdit);

        pnlRightNorth.add(lblTitle);

        dbtAppoint.setVisible(true);
        dbtAppoint.setShowGrid(true);

        pnlRightCentreSouth.add(dbtAppoint);

        pnlRightCenter.add(pnlRightCentreNorth,BorderLayout.NORTH);
        pnlRightCenter.add(pnlRightCentreSouth,BorderLayout.SOUTH);
        pnlRightCenter.add(pnlRightCentreCentre,BorderLayout.CENTER);

        pnlRight.add(pnlRightNorth,BorderLayout.NORTH);
        pnlRight.add(pnlRightSouth,BorderLayout.SOUTH);
        pnlRight.add(pnlRightCenter,BorderLayout.CENTER);

        pnlLeft.add(btnSignout,BorderLayout.SOUTH);
        pnlLeft.add(pnlLeftNorth,BorderLayout.NORTH);
        pnlLeft.add(pnlChatbot,BorderLayout.CENTER);

        Patientpage.add(pnlLeft);
        Patientpage.add(pnlRight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
