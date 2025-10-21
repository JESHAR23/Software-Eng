import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDash implements ActionListener {

    JFrame AdminDpage = new JFrame();

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
    JButton btnExPDF = new JButton("Export PDF");
    JButton btnPrint = new JButton("Print");
    JButton btnReportT = new JButton("Report Type");
    JButton btnAddStaff = new JButton("Add Staff Member");

    JLabel lblRepType = new JLabel("Report Type : ");
    JLabel lblDaterange = new JLabel("Date Range : ");
    JLabel lblNoMissApp = new JLabel("Number of Missed Appointments : ");
    JLabel lblTitle = new JLabel("Admin Dashboard");

    JTextField txtRepType = new JTextField();
    JTextField txtDaterange = new JTextField();
    JTextField txtNoMissApp = new JTextField();

    ImageIcon imglogo = new ImageIcon("logoinverted.png");
    ImageIcon smallicon = new ImageIcon("logo.png");

    JLabel lbllogoicon = new JLabel();

    JTable AppTable = new JTable();

    AdminDash(){
        AdminDpage.setVisible(true);
        AdminDpage.setSize(1000,550);
        AdminDpage.setResizable(false);
        AdminDpage.setTitle("MentCare Admin Dashboard");
        AdminDpage.setIconImage(smallicon.getImage());
        AdminDpage.setLayout(new BorderLayout());
        AdminDpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AdminDpage.setLayout(new BorderLayout());
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

        pnlRCNorth.add(lblRepType);
        pnlRCNorth.add(txtRepType);
        pnlRCNorth.add(lblDaterange);
        pnlRCNorth.add(txtDaterange);
        pnlRCNorth.add(lblNoMissApp);
        pnlRCNorth.add(txtNoMissApp);

        pnlRCSouth.add(AppTable);

        lbllogoicon.setIcon(imglogo);

        btnPrint.addActionListener(this);
        btnSignOut.addActionListener(this);
        btnExPDF.addActionListener(this);
        btnAddStaff.addActionListener(this);
        btnReportT.addActionListener(this);

        //Right
        pnlRightCentre.add(pnlRCNorth,BorderLayout.NORTH);
        pnlRightCentre.add(pnlRCSouth,BorderLayout.SOUTH);

        pnlRightNorth.add(lblTitle);
        pnlRightSouth.add(btnExPDF);
        pnlRightSouth.add(btnPrint);

        //Right
        pnlRight.add(pnlRightNorth,BorderLayout.NORTH);
        pnlRight.add(pnlRightCentre,BorderLayout.CENTER);
        pnlRight.add(pnlRightSouth,BorderLayout.SOUTH);
        pnlRight.add(pnlRightWest,BorderLayout.WEST);
        pnlRight.add(pnlRightEast,BorderLayout.EAST);

        //Left
        pnlLeftSouth.add(btnSignOut);
        pnlLeftNorth.add(lbllogoicon);
        pnlLeftCentre.add(btnReportT);
        pnlLeftCentre.add(btnAddStaff);

        //Left
        pnlLeft.add(pnlLeftNorth,BorderLayout.NORTH);
        pnlLeft.add(pnlLeftSouth,BorderLayout.SOUTH);
        pnlLeft.add(pnlLeftCentre,BorderLayout.CENTER);

        AdminDpage.add(pnlLeft,BorderLayout.WEST);
        AdminDpage.add(pnlRight,BorderLayout.EAST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
