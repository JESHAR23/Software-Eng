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
    JLabel lblPass = new JLabel("Password : ");
    JLabel lbldob = new JLabel("Date of Birth : ");
    JLabel lblNumber = new JLabel("Contact Number : ");
    JLabel lblemail = new JLabel("Email : ");
    JLabel lblMedicalAid = new JLabel("Medical Aid : ");
    JLabel lblAppoint = new JLabel("Appointments : ");
    JLabel lblTitle = new JLabel("Patient Records");
    JLabel lblChatTitle = new JLabel("MentCare Chat Bot");

    JTextField txtUserInput = new JTextField();


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

        pnlRightSouth.add(btnAdd);
        pnlRightSouth.add(btnCancel);
        pnlRightSouth.add(btnEdit);

        pnlRightNorth.add(lblTitle);

        pnlRight.add(pnlRightNorth,BorderLayout.NORTH);
        pnlRight.add(pnlRightSouth,BorderLayout.SOUTH);


        pnlLeft.add(btnSignout,BorderLayout.SOUTH);
        pnlLeft.add(imglog,BorderLayout.NORTH);
        pnlLeft.add(pnlChatbot,BorderLayout.CENTER);

        Patientpage.add(pnlLeft);
        Patientpage.add(pnlRight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
