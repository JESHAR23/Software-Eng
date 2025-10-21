import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStaff implements ActionListener {

    JFrame AddSpage = new JFrame();

    JPanel pnlNorth = new JPanel();
    JPanel pnlSouth = new JPanel();
    JPanel pnlCentre = new JPanel();
    JPanel pnlWest = new JPanel();
    JPanel pnlEast = new JPanel();

    ImageIcon imglogo = new ImageIcon("logoinverted.png");
    ImageIcon smallicon = new ImageIcon("logo.png");

    JButton btnGoBack = new JButton("Go Back");
    JButton btnAddStaff = new JButton("Add Staff");


    JLabel lblName = new JLabel("Full Name : ");
    JLabel lblPass = new JLabel("Password : ");
    JLabel lbldob = new JLabel("Date of Birth : ");
    JLabel lblNumber = new JLabel("Contact Number : ");
    JLabel lblemail = new JLabel("Email : ");
    JLabel lblPosition = new JLabel("Position : ");
    JLabel lblCV = new JLabel("CV : ");

    JLabel companylogo = new JLabel();

    JTextField txtName = new JTextField();
    JTextField txtPass = new JTextField();
    JTextField txtdob = new JTextField();
    JTextField txtNumber = new JTextField();
    JTextField txtemail = new JTextField();
    JTextField txtPosition = new JTextField();
    JTextField txtCV = new JTextField();

    AddStaff(){
        AddSpage.setVisible(true);
        AddSpage.setSize(750,450);
        AddSpage.setResizable(false);
        AddSpage.setTitle("MentCare Add Staff Member to System");
        AddSpage.setIconImage(smallicon.getImage());
        AddSpage.setLayout(new BorderLayout(0,0));

        pnlCentre.setLayout(new GridLayout(7,2));
        pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER,175,10));

        pnlNorth.setPreferredSize(new Dimension(1,100));
        pnlSouth.setPreferredSize(new Dimension(1,55));
        pnlEast.setPreferredSize(new Dimension(100,1));
        pnlWest.setPreferredSize(new Dimension(100,1));

        pnlCentre.add(lblName);
        pnlCentre.add(txtName);
        pnlCentre.add(lblPass);
        pnlCentre.add(txtPass);
        pnlCentre.add(lbldob);
        pnlCentre.add(txtdob);
        pnlCentre.add(lblNumber);
        pnlCentre.add(txtNumber);
        pnlCentre.add(lblemail);
        pnlCentre.add(txtemail);
        pnlCentre.add(lblPosition);
        pnlCentre.add(txtPosition);
        pnlCentre.add(lblCV);
        pnlCentre.add(txtCV);

        companylogo.setIcon(imglogo);

        pnlNorth.add(companylogo);

        btnGoBack.setPreferredSize(new Dimension(120,30));
        btnAddStaff.setPreferredSize(new Dimension(120,30));

        btnGoBack.addActionListener(this);
        btnAddStaff.addActionListener(this);

        pnlSouth.add(btnGoBack);
        pnlSouth.add(btnAddStaff);

        AddSpage.add(pnlNorth,BorderLayout.NORTH);
        AddSpage.add(pnlSouth,BorderLayout.SOUTH);
        AddSpage.add(pnlCentre,BorderLayout.CENTER);
        AddSpage.add(pnlWest,BorderLayout.WEST);
        AddSpage.add(pnlEast,BorderLayout.EAST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
