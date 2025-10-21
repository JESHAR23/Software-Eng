import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffDashboard implements ActionListener {

    JFrame StaffDpage = new JFrame();

    JPanel pnlLeft = new JPanel();
    JPanel pnlRight = new JPanel();

    //Right
    JPanel pnlRightNorth = new JPanel();
    JPanel pnlRightSouth = new JPanel();
    JPanel pnlRightCentre = new JPanel();
    JPanel pnlRightWest = new JPanel();
    JPanel pnlRightEast = new JPanel();

    //RightCentre
    JPanel pnlRCNorth = new JPanel();
    JPanel pnlRCSouth = new JPanel();

    //Left
    JPanel pnlLeftNorth = new JPanel();
    JPanel pnlLeftSouth = new JPanel();
    JPanel pnlLeftCentre = new JPanel();

    JButton btnSignOut = new JButton("Sign Out");
    JButton btnAdd = new JButton("Add");
    JButton btnDelete = new JButton("Delete");
    JButton btnPatientRec = new JButton("Patient Records");
    JButton btnEdit = new JButton("Edit");

    JLabel lblNoofPat = new JLabel("Number of Patients : ");
    JLabel lblNoofApp = new JLabel("Number of Appointments : ");
    JLabel lblNoMissApp = new JLabel("Number of Missed Appointments : ");
    JLabel lblTitle = new JLabel("Staff Dashboard");

    JTextField txtNoofPat = new JTextField();
    JTextField txtNoofApp = new JTextField();
    JTextField txtNoMissApp = new JTextField();

    ImageIcon imglogo = new ImageIcon("logoinverted.png");
    ImageIcon smallicon = new ImageIcon("logo.png");

    JLabel lbllogoicon = new JLabel();

    JTable AppTable = new JTable();

    StaffDashboard(){
        StaffDpage.setVisible(true);
        StaffDpage.setSize(1000,550);
        StaffDpage.setResizable(false);
        StaffDpage.setTitle("MentCare Staff Dashboard");
        StaffDpage.setIconImage(smallicon.getImage());
        StaffDpage.setLayout(new BorderLayout());
        StaffDpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StaffDpage.setLayout(new BorderLayout());
        pnlLeft.setLayout(new BorderLayout());
        pnlRight.setLayout(new BorderLayout());

        pnlLeftSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlLeftNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlLeftCentre.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlRightNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlRightSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnlRightCentre.setLayout(new BorderLayout());

        pnlRCNorth.setLayout(new GridLayout(3,2));

        pnlRight.setPreferredSize(new Dimension(650,1));
        pnlLeft.setPreferredSize(new Dimension(350,1));

        pnlLeftNorth.setPreferredSize(new Dimension(1,100));
        pnlLeftSouth.setPreferredSize(new Dimension(1,55));

        pnlRightNorth.setPreferredSize(new Dimension(1,100));
        pnlRightSouth.setPreferredSize(new Dimension(1,55));

        pnlRightEast.setPreferredSize(new Dimension(20,0));
        pnlRightWest.setPreferredSize(new Dimension(30,0));

        pnlRCNorth.add(lblNoofPat);
        pnlRCNorth.add(txtNoofPat);
        pnlRCNorth.add(lblNoofApp);
        pnlRCNorth.add(txtNoofApp);
        pnlRCNorth.add(lblNoMissApp);
        pnlRCNorth.add(txtNoMissApp);

        pnlRCSouth.add(AppTable);

        lbllogoicon.setIcon(imglogo);

        btnDelete.addActionListener(this);
        btnSignOut.addActionListener(this);
        btnAdd.addActionListener(this);
        btnEdit.addActionListener(this);
        btnPatientRec.addActionListener(this);

        //Right
        pnlRightCentre.add(pnlRCNorth,BorderLayout.NORTH);
        pnlRightCentre.add(pnlRCSouth,BorderLayout.SOUTH);

        pnlRightNorth.add(lblTitle);
        pnlRightSouth.add(btnAdd);
        pnlRightSouth.add(btnDelete);
        pnlRightSouth.add(btnEdit);

        //Right
        pnlRight.add(pnlRightNorth,BorderLayout.NORTH);
        pnlRight.add(pnlRightCentre,BorderLayout.CENTER);
        pnlRight.add(pnlRightSouth,BorderLayout.SOUTH);
        pnlRight.add(pnlRightWest,BorderLayout.WEST);
        pnlRight.add(pnlRightEast,BorderLayout.EAST);

        //Left
        pnlLeftSouth.add(btnSignOut);
        pnlLeftNorth.add(lbllogoicon);
        pnlLeftCentre.add(btnPatientRec);

        //Left
        pnlLeft.add(pnlLeftNorth,BorderLayout.NORTH);
        pnlLeft.add(pnlLeftSouth,BorderLayout.SOUTH);
        pnlLeft.add(pnlLeftCentre,BorderLayout.CENTER);

        StaffDpage.add(pnlLeft,BorderLayout.WEST);
        StaffDpage.add(pnlRight,BorderLayout.EAST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
