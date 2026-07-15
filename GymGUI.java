import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GymGUI{

    private ArrayList<GymMember> member = new ArrayList<GymMember>();
    private JFrame guiFrame;
    private JPanel homePanel, regularPanel, premiumPanel;
    private JLabel RidLabel, RnameLabel, RlocationLabel, RphoneLabel, RemailLabel, RgenderLabel, RDOBLabel, RyearLabel, RmonthLabel, RdateLabel, RMembershipStartDateLabel,RYearLabel, RMonthLabel, RDateLabel,RPlanLabel, RReferralSourceLabel, RPaidAmountLabel, RRemovalReasonLabel, RPlanPriceLabel, PidLabel, PnameLabel, PlocationLabel, PphoneLabel, PemailLabel, PgenderLabel, PDOBLabel, PyearLabel, PmonthLabel, PdateLabel, PMembershipStartDateLabel, PYearLabel, PMonthLabel, PDateLabel,PPlanChargeLabel,PReferralSourceLabel,PPaidAmountLabel, PTrainersNameLabel, PRemovalReasonLabel;
    private JTextField RTFid,RTFname, RTFlocation, RTFphone, RTFemail, RTFDOB, RTFMembershipStartDate, RTFReferralSource, RTFPaidAmount, RRemovalReason, RTFPlanPrice, PTFid, PTFname, PTFlocation, PTFphone, PTFemail, PTFgender, PTFDOB, PTFMembershipStartDate,PTFPlanCharge,PTFReferralSource,PTFPaidAmount, PTFTrainersName;
    private JTextArea RTARemovalReason, PTARemovalReason, resultTA;  
    private JButton  RaddButton, RActivateMembership, RDeactivateMembership, RMarkAttendance, RRevertMember, RDisplay, RClear, PaddButton, PActivateMembership, PDeactivateMembership, PMarkAttendance, PRevertMember, PDisplay, PClear;
    private JComboBox plan, RDOBYear, RDOBMonth, RDOBDate, RMembershipStartYear, RMembershipStartMonth, RMembershipStartDate,RPlan, PDOBYear, PDOBMonth, PDOBDate, PMembershipStartYear, PMembershipStartMonth, PMembershipStartDate; 
    private JRadioButton RmaleRadioButton, RfemaleRadioButton, RotherRadioButton,PmaleRadioButton, PfemaleRadioButton, PotherRadioButton;

    public GymGUI(){

        guiFrame = new JFrame("24046499 Shreya Dhakal - GymGUI");
        guiFrame.setSize(900,900);
        guiFrame.setResizable(false);
        guiFrame.setLayout(null);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel id,name,location,phone,email,gender,dob,membershipStartDate,referralSource,paidAmount,removalReason,trainersName;
        RidLabel = new JLabel("ID");
        RnameLabel = new JLabel("Name");
        RlocationLabel = new JLabel("Location");
        RphoneLabel = new JLabel("Phone");
        RemailLabel = new JLabel("Email");
        RgenderLabel = new JLabel("Gender");
        RDOBLabel = new JLabel("DOB");
        RMembershipStartDateLabel = new JLabel("MembershipStartDate");
        RReferralSourceLabel = new JLabel("ReferralSource");
        RPaidAmountLabel = new JLabel("PaidAmount");
        RRemovalReasonLabel = new JLabel("RemovalReason");
        RPlanPriceLabel = new JLabel("PlanPrice");

        JLabel Id,Name,Location,Phone,Email,Gender,DOB,MembershipStartDate,ReferralSource,PaidAmount,RemovalReason,TrainersName;
        PidLabel = new JLabel("ID");
        PnameLabel = new JLabel("Name");
        PlocationLabel = new JLabel("Location");
        PphoneLabel = new JLabel("Phone");
        PemailLabel = new JLabel("Email");
        PgenderLabel = new JLabel("Gender");
        PDOBLabel = new JLabel("DOB");
        PMembershipStartDateLabel = new JLabel("MembershipStartDate");
        PReferralSourceLabel = new JLabel("ReferralSource");
        PPaidAmountLabel = new JLabel("PaidAmount");
        PRemovalReasonLabel = new JLabel("RemovalReason");
        PTrainersNameLabel = new JLabel("TrainersName");

        //homePanel
        homePanel = new JPanel();
        homePanel.setSize(900,900);
        homePanel.setLayout(null);

        regularPanel = new JPanel();
        regularPanel.setSize(900,900);
        regularPanel.setLayout(null);

        premiumPanel = new JPanel();
        premiumPanel.setSize(900,900);
        premiumPanel.setLayout(null);

        //regular member
        JButton RegularMember = new JButton("Regular Member");
        RegularMember.setBounds(150,380,150,35);

        //premium Member
        JButton PremiumMember = new JButton("Premium Member");
        PremiumMember.setBounds(350,380,150,35);

        //regular member 
        RidLabel = new JLabel("Member ID:");
        RidLabel.setBounds(50,50,75,25);
        JTextField RTFid = new JTextField();
        RTFid.setBounds(140,50,150,25);

        RnameLabel = new JLabel("Name:");
        RnameLabel.setBounds(50,90,75,25);
        JTextField RTFname = new JTextField();
        RTFname.setBounds(140,90,150,25);

        RlocationLabel = new JLabel("Location:");
        RlocationLabel.setBounds(50,130,75,25);
        JTextField RTFlocation = new JTextField();
        RTFlocation.setBounds(140,130,150,25);

        RphoneLabel = new JLabel("Phone:");
        RphoneLabel.setBounds(50,170,75,25);
        JTextField RTFphone = new JTextField();
        RTFphone.setBounds(140,170,150,25);

        RemailLabel = new JLabel("Email:");
        RemailLabel.setBounds(50,210,75,25);
        JTextField RTFemail = new JTextField();
        RTFemail.setBounds(140,210,150,25);

        //gender
        RgenderLabel = new JLabel("Gender:");
        RgenderLabel.setBounds(50,250,75,25);

        JRadioButton RfemaleRadioButton = new JRadioButton("Female");
        RfemaleRadioButton.setBounds(140,250,100,25);

        JRadioButton RmaleRadioButton = new JRadioButton("Male");
        RmaleRadioButton.setBounds(240,250,100,25);

        JRadioButton RotherRadioButton = new JRadioButton("Other");
        RotherRadioButton.setBounds(340,250,100,25);
        
         //group the radio button
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(RfemaleRadioButton);
        genderGroup.add(RmaleRadioButton);
        genderGroup.add(RotherRadioButton);
        

        RDOBLabel = new JLabel("DOB:");
        RDOBLabel.setBounds(50,290,75,25);

        RyearLabel = new JLabel("Year:");
        RyearLabel.setBounds(140,290,50,25);

        RmonthLabel = new JLabel("Month:");
        RmonthLabel.setBounds(285,290,50,25);

        RdateLabel = new JLabel("Date:");
        RdateLabel.setBounds(470,290,50,25);

        //for DOB
        String[] Ryears = new String[40];
        for(int x = 0; x<40; x++){
            Ryears[x] = String.valueOf(1986+x);
        }
        String[] Rmonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] Rdates = new String[30];
        for (int x = 0; x<30; x++){
            Rdates[x] = String.valueOf(x + 1);
        }

        JComboBox<String> RDOBYear = new JComboBox<>(Ryears);
        RDOBYear.setBounds(185,290,65,25);

        JComboBox<String> RDOBMonth = new JComboBox<>(Rmonths);
        RDOBMonth.setBounds(345,290,90,25);

        JComboBox<String> RDOBDate = new JComboBox<>(Rdates);
        RDOBDate.setBounds(510,290,55,25);

        RMembershipStartDateLabel = new JLabel("Membership Start Date:");
        RMembershipStartDateLabel.setBounds(50,330,140,25);

        //for Membership Start Date
        RYearLabel = new JLabel("Year:");
        RYearLabel.setBounds(215,330,50,25);

        RMonthLabel = new JLabel("Month:");
        RMonthLabel.setBounds(340,330,50,25);

        RDateLabel = new JLabel("Date:");
        RDateLabel.setBounds(510,330,50,25);

        String[] RYears = new String[40];
        for(int x = 0; x<40; x++){
            RYears[x] = String.valueOf(1986+x);
        }
        String[] RMonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] RDates = new String[30];
        for (int x = 0; x<30; x++){
            RDates[x] = String.valueOf(x + 1);
        }

        JComboBox<String> RMembershipStartYear = new JComboBox<>(RYears);
        RMembershipStartYear.setBounds(260,330,65,25);

        JComboBox<String> RMembershipStartMonth = new JComboBox<>(RMonths);
        RMembershipStartMonth.setBounds(400,330,90,25);

        JComboBox<String> RMembershipStartDate = new JComboBox<>(RDates);
        RMembershipStartDate.setBounds(550,330,55,25);

        RPlanLabel = new JLabel("Plan:");
        RPlanLabel.setBounds(50,370,95,25);

        //for plan
        String[] box = {"Basic","Standard","Deluxe"};
        JComboBox<String> RPlan = new JComboBox<>(box);
        RPlan.setBounds(140,370,85,25);

        RReferralSourceLabel = new JLabel("Referral Source:");
        RReferralSourceLabel.setBounds(50,410,95,25);
        JTextField RTFReferralSource = new JTextField();
        RTFReferralSource.setBounds(195,410,150,25);

        RPaidAmountLabel = new JLabel("Paid Amount:");
        RPaidAmountLabel.setBounds(50,450,75,25);
        JTextField RTFPaidAmount = new JTextField();
        RTFPaidAmount.setBounds(195,450,150,25);

        RPlanPriceLabel = new JLabel("Plan Price:");
        RPlanPriceLabel.setBounds(50,490,90,25);
        JTextField RTFPlanPrice = new JTextField();
        RTFPlanPrice.setBounds(195,490,150,25);
        RTFPlanPrice.setEditable(false);

        RRemovalReasonLabel = new JLabel("Removal Reason:");
        RRemovalReasonLabel.setBounds(50,530,100,25);
        JTextArea RTARemovalReason = new JTextArea();
        RTARemovalReason.setBounds(195,530,200,50);
        
        JButton RActivateMembership = new JButton("Activate Membership");
        RActivateMembership.setBounds(50,600,160,25);
        
        JButton RDeactivateMembership = new JButton("Deactivate Membership");
        RDeactivateMembership.setBounds(265,600,170,25);
        
        JButton RMarkAttendance = new JButton("Mark Attendance");
        RMarkAttendance.setBounds(490,600,170,25);
        
        JButton RRevertMember = new JButton("Revert Member");
        RRevertMember.setBounds(120,650,130,25);
        
        JButton RDisplay = new JButton("Display");
        RDisplay.setBounds(300,650,80,25);
        
        JButton RClear = new JButton("Clear");
        RClear.setBounds(430,650,80,25);

        JButton RaddButton = new JButton("ADD");
        RaddButton.setBounds(275,700,130,25);

       
        
        
        
        
        
        

        //premiumPanel
        PidLabel = new JLabel("Member ID:");
        PidLabel.setBounds(50,50,75,25);
        JTextField PTFid = new JTextField();
        PTFid.setBounds(140,50,150,25);

        PnameLabel = new JLabel("Name:");
        PnameLabel.setBounds(50,90,75,25);
        JTextField PTFname = new JTextField();
        PTFname.setBounds(140,90,150,25);

        PlocationLabel = new JLabel("Location:");
        PlocationLabel.setBounds(50,130,75,25);
        JTextField PTFlocation = new JTextField();
        PTFlocation.setBounds(140,130,150,25);

        PphoneLabel = new JLabel("Phone:");
        PphoneLabel.setBounds(50,170,75,25);
        JTextField PTFphone = new JTextField();
        PTFphone.setBounds(140,170,150,25);

        PemailLabel = new JLabel("Email:");
        PemailLabel.setBounds(50,210,75,25);
        JTextField PTFemail = new JTextField();
        PTFemail.setBounds(140,210,150,25);

        //gender
        PgenderLabel = new JLabel("Gender:");
        PgenderLabel.setBounds(50,250,75,25);

        JRadioButton PfemaleRadioButton = new JRadioButton("Female");
        PfemaleRadioButton.setBounds(140,250,100,25);

        JRadioButton PmaleRadioButton = new JRadioButton("Male");
        PmaleRadioButton.setBounds(240,250,100,25);

        JRadioButton PotherRadioButton = new JRadioButton("Other");
        PotherRadioButton.setBounds(340,250,100,25);
        
         //group the radio button
        ButtonGroup GenderGroup = new ButtonGroup();
        GenderGroup.add(PfemaleRadioButton);
        GenderGroup.add(PmaleRadioButton);
        GenderGroup.add(PotherRadioButton);
        

        PDOBLabel = new JLabel("DOB:");
        PDOBLabel.setBounds(50,290,75,25);

        PyearLabel = new JLabel("Year:");
        PyearLabel.setBounds(140,290,50,25);

        PmonthLabel = new JLabel("Month:");
        PmonthLabel.setBounds(285,290,50,25);

        PdateLabel = new JLabel("Date:");
        PdateLabel.setBounds(470,290,50,25);

        //for DOB
        String[] Pyears = new String[40];
        for(int x = 0; x<40; x++){
            Pyears[x] = String.valueOf(1986+x);
        }
        String[] Pmonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] Pdates = new String[30];
        for (int x = 0; x<30; x++){
            Pdates[x] = String.valueOf(x + 1);
        }

        JComboBox<String> PDOBYear = new JComboBox<>(Pyears);
        PDOBYear.setBounds(185,290,65,25);

        JComboBox<String> PDOBMonth = new JComboBox<>(Pmonths);
        PDOBMonth.setBounds(345,290,90,25);

        JComboBox<String> PDOBDate = new JComboBox<>(Pdates);
        PDOBDate.setBounds(510,290,55,25);

        PMembershipStartDateLabel = new JLabel("Membership Start Date:");
        PMembershipStartDateLabel.setBounds(50,330,140,25);

        //for Membership Start Date
        PYearLabel = new JLabel("Year:");
        PYearLabel.setBounds(215,330,50,25);

        PMonthLabel = new JLabel("Month:");
        PMonthLabel.setBounds(340,330,50,25);

        PDateLabel = new JLabel("Date:");
        PDateLabel.setBounds(510,330,50,25);

        String[] PYears = new String[40];
        for(int x = 0; x<40; x++){
            PYears[x] = String.valueOf(1986+x);
        }
        String[] PMonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] PDates = new String[30];
        for (int x = 0; x<30; x++){
            PDates[x] = String.valueOf(x + 1);
        }

        JComboBox<String> PMembershipStartYear = new JComboBox<>(PYears);
        PMembershipStartYear.setBounds(260,330,65,25);

        JComboBox<String> PMembershipStartMonth = new JComboBox<>(PMonths);
        PMembershipStartMonth.setBounds(400,330,90,25);

        JComboBox<String> PMembershipStartDate = new JComboBox<>(PDates);
        PMembershipStartDate.setBounds(550,330,55,25);
        
        PPlanChargeLabel = new JLabel("Plan Charge:");
        PPlanChargeLabel.setBounds(50,370,95,25);
        JTextField PTFPlanCharge = new JTextField();
        PTFPlanCharge.setBounds(195,370,150,25);
        PTFPlanCharge.setEditable(false);
        
        PReferralSourceLabel = new JLabel("Referral Source:");
        PReferralSourceLabel.setBounds(50,410,95,25);
        JTextField PTFReferralSource = new JTextField();
        PTFReferralSource.setBounds(195,410,150,25);
        
        PPaidAmountLabel = new JLabel("Paid Amount:");
        PPaidAmountLabel.setBounds(50,450,95,25);
        JTextField PTFPaidAmount = new JTextField();
        PTFPaidAmount.setBounds(195,450,150,25);
        
        PTrainersNameLabel = new JLabel("Trainer's Name:");
        PTrainersNameLabel.setBounds(50,490,90,25);
        JTextField PTFTrainersName = new JTextField();
        PTFTrainersName.setBounds(195,490,150,25);
        
        PRemovalReasonLabel = new JLabel("Removal Reason:");
        PRemovalReasonLabel.setBounds(50,530,100,25);
        JTextArea PTARemovalReason = new JTextArea();
        PTARemovalReason.setBounds(195,530,200,50);
        
        JButton PActivateMembership = new JButton("Activate Membership");
        PActivateMembership.setBounds(50,600,160,25);
        
        JButton PDeactivateMembership = new JButton("Deactivate Membership");
        PDeactivateMembership.setBounds(265,600,170,25);
        
        JButton PMarkAttendance = new JButton("Mark Attendance");
        PMarkAttendance.setBounds(490,600,170,25);
        
        JButton PRevertMember = new JButton("Revert Member");
        PRevertMember.setBounds(120,650,130,25);
        
        JButton PDisplay = new JButton("Display");
        PDisplay.setBounds(300,650,80,25);
        
        JButton PClear = new JButton("Clear");
        PClear.setBounds(430,650,80,25);

        JButton PaddButton = new JButton("ADD");
        PaddButton.setBounds(275,700,130,25);

        //adding components regularPanel
        regularPanel.add(RidLabel);
        regularPanel.add(RTFid);
        regularPanel.add(RnameLabel);
        regularPanel.add(RTFname);
        regularPanel.add(RlocationLabel);
        regularPanel.add(RTFlocation);
        regularPanel.add(RphoneLabel);
        regularPanel.add(RTFphone);
        regularPanel.add(RemailLabel);
        regularPanel.add(RTFemail);
        regularPanel.add(RgenderLabel);
        regularPanel.add(RfemaleRadioButton);
        regularPanel.add(RmaleRadioButton);
        regularPanel.add(RotherRadioButton);
        regularPanel.add(RDOBLabel);
        regularPanel.add(RyearLabel);
        regularPanel.add(RDOBYear);
        regularPanel.add(RmonthLabel);
        regularPanel.add(RDOBMonth);
        regularPanel.add(RdateLabel);
        regularPanel.add(RDOBDate);
        regularPanel.add(RMembershipStartDateLabel);
        regularPanel.add(RYearLabel);
        regularPanel.add(RMembershipStartYear);
        regularPanel.add(RMonthLabel);
        regularPanel.add(RMembershipStartMonth);
        regularPanel.add(RDateLabel);
        regularPanel.add(RMembershipStartDate);
        regularPanel.add(RPlanLabel);
        regularPanel.add(RPlan);
        regularPanel.add(RReferralSourceLabel);
        regularPanel.add(RTFReferralSource);
        regularPanel.add(RPaidAmountLabel);
        regularPanel.add(RTFPaidAmount);
        regularPanel.add(RPlanPriceLabel);
        regularPanel.add(RTFPlanPrice);
        regularPanel.add(RRemovalReasonLabel);
        regularPanel.add(RTARemovalReason);
        regularPanel.add(RActivateMembership);
        regularPanel.add(RDeactivateMembership);
        regularPanel.add(RMarkAttendance);
        regularPanel.add(RRevertMember);
        regularPanel.add(RDisplay);
        regularPanel.add(RClear);
        regularPanel.add(RaddButton);
        

        //for premiumPanel
        premiumPanel.add(PidLabel);
        premiumPanel.add(PTFid);
        premiumPanel.add(PnameLabel);
        premiumPanel.add(PTFname);
        premiumPanel.add(PlocationLabel);
        premiumPanel.add(PTFlocation);
        premiumPanel.add(PphoneLabel);
        premiumPanel.add(PTFphone);
        premiumPanel.add(PemailLabel);
        premiumPanel.add(PTFemail);
        premiumPanel.add(PgenderLabel);
        premiumPanel.add(PfemaleRadioButton);
        premiumPanel.add(PmaleRadioButton);
        premiumPanel.add(PotherRadioButton);
        premiumPanel.add(PDOBLabel);
        premiumPanel.add(PyearLabel);
        premiumPanel.add(PDOBYear);
        premiumPanel.add(PmonthLabel);
        premiumPanel.add(PDOBMonth);
        premiumPanel.add(PdateLabel);
        premiumPanel.add(PDOBDate);
        premiumPanel.add(PMembershipStartDateLabel);
        premiumPanel.add(PYearLabel);
        premiumPanel.add(PMembershipStartYear);
        premiumPanel.add(PMonthLabel);
        premiumPanel.add(PMembershipStartMonth);
        premiumPanel.add(PDateLabel);
        premiumPanel.add(PMembershipStartDate);
        premiumPanel.add(PPlanChargeLabel);
        premiumPanel.add(PTFPlanCharge);
        premiumPanel.add(PReferralSourceLabel);
        premiumPanel.add(PTFReferralSource);
        premiumPanel.add(PPaidAmountLabel);
        premiumPanel.add(PTFPaidAmount);
        premiumPanel.add(PTrainersNameLabel);
        premiumPanel.add(PTFTrainersName);
        premiumPanel.add(PRemovalReasonLabel);
        premiumPanel.add(PTARemovalReason);
        premiumPanel.add(PActivateMembership);
        premiumPanel.add(PDeactivateMembership);
        premiumPanel.add(PMarkAttendance);
        premiumPanel.add(PRevertMember);
        premiumPanel.add(PDisplay);
        premiumPanel.add(PClear);
        premiumPanel.add(PaddButton);
        

        homePanel.add(RegularMember);
        homePanel.add(PremiumMember);

        guiFrame.add(homePanel);
        guiFrame.add(regularPanel);
        guiFrame.add(premiumPanel);

        //Action listener for submit button of regular member
            RaddButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                        int id = Integer.parseInt(RTFid.getText());
                        String name = RTFname.getText();
                        String location = RTFlocation.getText();
                        String phone = RTFphone.getText();
                        String email = RTFemail.getText(); 
                        String genderGroup = RmaleRadioButton.isSelected() ? "Male": RfemaleRadioButton.isSelected() ? "Female":  RotherRadioButton.isSelected() ? "Other" : "Not Selected";
                        String dob = RDOBYear.getSelectedItem() + "-" + RDOBMonth.getSelectedItem() + "-" + RDOBDate.getSelectedItem();
                        String MembershipStart = RMembershipStartYear.getSelectedItem() + "-" + RMembershipStartMonth.getSelectedItem() + "-" + RMembershipStartDate.getSelectedItem();
                        String plan = (String) RPlan.getSelectedItem();
                        String ReferralSource = RTFReferralSource.getText();
                        String PaidAmount = RTFPaidAmount.getText();
                        String PlanPrice = RTFPlanPrice.getText();
                        String RemovalReason = RTARemovalReason.getText();

                        //check if the fields are filled //have to fix this
                        if(RTFid.getText().isEmpty() || name.isEmpty() || location.isEmpty() || phone.isEmpty() || email.isEmpty() || genderGroup.equals("Not Selected") || RDOBYear.getSelectedItem() == null || RDOBMonth.getSelectedItem() == null || RDOBDate.getSelectedItem() == null || RMembershipStartYear.getSelectedItem() == null || RMembershipStartMonth.getSelectedItem() == null || RMembershipStartDate.getSelectedItem() == null || ReferralSource.isEmpty() || plan == null || PaidAmount.isEmpty() || RemovalReason.isEmpty() )
                        {
                            //showing a dialog box   
                            JOptionPane.showMessageDialog(regularPanel, "Please fill the empty fields.","Information is Missing!", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        for (GymMember x : member) {
                            if (x.id == id) {
                                JOptionPane.showMessageDialog(regularPanel, "Entered ID already exists.", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }        

                        // Create new member and add to the list regularMember
                        RegularMember newMember = new RegularMember(id, name, location, phone, email, genderGroup, dob, MembershipStart, ReferralSource);
                        member.add(newMember);
                        JOptionPane.showMessageDialog(regularPanel, "Member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }

                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(regularPanel, "Please enter the integer value for ID.", " Input is Invalid!", JOptionPane.WARNING_MESSAGE);
                    }

                }
            });    
            
            
            //clear button for regularMember
            RClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    RTFid.setText("");
                    RTFname.setText("");
                    RTFlocation.setText("");
                    RTFphone.setText("");
                    RTFemail.setText("");
                    genderGroup.clearSelection();
                    RTFReferralSource.setText("");
                    RTFPaidAmount.setText("");
                    RTARemovalReason.setText("");
                }
            });
            
            
            
            //Action listener for submit button of premium member
            PaddButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                        int id = Integer.parseInt(PTFid.getText());
                        String name = PTFname.getText();
                        String location = PTFlocation.getText();
                        String phone = PTFphone.getText();
                        String email = PTFemail.getText(); 
                        String GenderGroup = PmaleRadioButton.isSelected() ? "Male": PfemaleRadioButton.isSelected() ? "Female":  PotherRadioButton.isSelected() ? "Other" : "Not Selected";
                        String dob = PDOBYear.getSelectedItem() + "-" + PDOBMonth.getSelectedItem() + "-" + PDOBDate.getSelectedItem();
                        String MembershipStart = PMembershipStartYear.getSelectedItem() + "-" + PMembershipStartMonth.getSelectedItem() + "-" + PMembershipStartDate.getSelectedItem();
                        String ReferralSource = PTFReferralSource.getText();
                        String PaidAmount = PTFPaidAmount.getText();
                        String PlanCharge = PTFPlanCharge.getText();
                        String TrainersName = PTFTrainersName.getText();
                        String RemovalReason = PTARemovalReason.getText();

                        //check if the fields are filled //have to fix this
                        if(PTFid.getText().isEmpty() || name.isEmpty() || location.isEmpty() || phone.isEmpty() || email.isEmpty() || GenderGroup.equals("Not Selected") || PDOBYear.getSelectedItem() == null || PDOBMonth.getSelectedItem() == null || PDOBDate.getSelectedItem() == null || PMembershipStartYear.getSelectedItem() == null || PMembershipStartMonth.getSelectedItem() == null || PMembershipStartDate.getSelectedItem() == null || ReferralSource.isEmpty() || PaidAmount.isEmpty() || RemovalReason.isEmpty() || TrainersName.isEmpty() )
                        {
                            //showing a dialog box   
                            JOptionPane.showMessageDialog(premiumPanel, "Please fill the empty fields.","Information is Missing!", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        for (GymMember y : member) {
                            if (y.id == id) {
                                JOptionPane.showMessageDialog(premiumPanel, "Entered ID already exists.", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }        

                        // Create new member and add to the list premium Member
                        PremiumMember newMember = new PremiumMember (id, name, location, phone, email, GenderGroup, dob, MembershipStart, ReferralSource);
                        member.add(newMember);
                        JOptionPane.showMessageDialog(premiumPanel, "Member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }

                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(premiumPanel, "Please enter the integer value for ID.", " Input is Invalid!", JOptionPane.WARNING_MESSAGE);
                    }

                }
            }); 
            
            
            
            //clear button for regularMember
            PClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    PTFid.setText("");
                    PTFname.setText("");
                    PTFlocation.setText("");
                    PTFphone.setText("");
                    PTFemail.setText("");
                    PTFReferralSource.setText("");
                    GenderGroup.clearSelection();
                    PTFTrainersName.setText("");
                    PTFPaidAmount.setText("");
                    PTARemovalReason.setText("");
                }
            });
            
            
            RActivateMembership.addActionListener(new ActionListener (){
                @Override
                public void actionPerformed(ActionEvent e){
                try{
                    int id = Integer.parseInt(RTFid.getText());
                    for(GymMember x : member){
                        if(x.id == id) {
                            if (x.getActiveStatus() == false){
                            x.activeMembership();
                            JOptionPane.showMessageDialog(regularPanel,
                            "Membership is Activated!", "Activate Membership", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(regularPanel,
                            "Membership has already been Activated!", "Already Activated", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                
                        JOptionPane.showMessageDialog(regularPanel,
                        "Member ID not found!", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                    catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(regularPanel,
                        "Kindly enter an integer value for ID.", "Input is Invalid", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            });
        
            
            PActivateMembership.addActionListener(new ActionListener (){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                    int id = Integer.parseInt(PTFid.getText());
                    for(GymMember y : member){
                        if(y.id == id) {
                            if (y.getActiveStatus() == false){
                            y.activeMembership();
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Membership is Activated!", "Activate Membership", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Membership has already been Activated!", "Already Activated", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                        JOptionPane.showMessageDialog(premiumPanel,
                        "Member ID not found","Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(premiumPanel,
                        "Kindly enter an integer value for ID.", "Input is Invalid", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            });
        
            RDeactivateMembership.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                    int id = Integer.parseInt(RTFid.getText());
                    for(GymMember a : member){
                        if(a.id == id) {
                            if(a.getActiveStatus()){
                            a.deactivateMembership();
                            JOptionPane.showMessageDialog(regularPanel,
                            "Membership is Deactivated!", "Deactivate Membership", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(regularPanel,
                            "Membership has already been Deactivated!", "Already Deactivated", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                        JOptionPane.showMessageDialog(regularPanel,
                        "Member ID not found!", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                  }
                  catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(regularPanel,
                        "Kindly enter an integer value for ID.", "Input is Invalid", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            });
            
            
            PDeactivateMembership.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
              try{
                    int id = Integer.parseInt(PTFid.getText());
                    for(GymMember a : member){
                        if(a.id == id) {
                            if(a.getActiveStatus()){
                            a.deactivateMembership();
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Membership is Deactivated!", "Deactivate Membership", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Membership has already been Deactivated!", "Already Deactivated", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                        JOptionPane.showMessageDialog(premiumPanel,
                        "Member ID not found!", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
               catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(premiumPanel,
                        "Kindly enter an integer value for ID.", "Input is Invalid", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
            }
        });
       
            
            RMarkAttendance.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                       
                    try{
                    int id = Integer.parseInt(RTFid.getText());
                    for(GymMember t : member){
                        if(t.id == id) {
                            if (t.getActiveStatus()){
                            t.markAttendance();
                            JOptionPane.showMessageDialog(regularPanel,
                            "Attendance is marked successfully!","Mark Attendance", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else {
                        JOptionPane.showMessageDialog(regularPanel,
                        "Attendance cannot be marked!","Member inactive", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }
            //if it doesnot match the id
            JOptionPane.showMessageDialog(regularPanel,
            "Member ID is not found","Error",JOptionPane.WARNING_MESSAGE);
        }
                   catch (NumberFormatException ex){
                      JOptionPane.showMessageDialog(regularPanel,
                      "Kindly enter and integer value for ID!","Input Invalid",JOptionPane.WARNING_MESSAGE);
                      return;
                   }
        }
    });
            
            
              PMarkAttendance.addActionListener(new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e){
                    
          try{
                        int id = Integer.parseInt(PTFid.getText());
                        for(GymMember v : member){
                        if(v.id == id) {
                             if(v.getActiveStatus()){
                            v.markAttendance();
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Attendance is marked successfully!","Mark Attendance", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                         else {
                        JOptionPane.showMessageDialog(premiumPanel,
                        "Attendance cannot be marked!","Member inactive", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }   
                    //if it doesnot match the id
                    JOptionPane.showMessageDialog(premiumPanel,
                    "Member ID is not found","Error",JOptionPane.WARNING_MESSAGE);    
                }
          catch (NumberFormatException ex){
               JOptionPane.showMessageDialog(premiumPanel,
               "Kindly enter and integer value for ID!","Input Invalid",JOptionPane.WARNING_MESSAGE);
               return;
                   }
                        
                    }
    });
       
            
    RRevertMember.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int id = Integer.parseInt(RTFid.getText());
            String RemovalReason = RTARemovalReason.getText();
            if(RTFid.getText().isEmpty()){
                JOptionPane.showMessageDialog(regularPanel,
               "Kindly enter a Member ID!","ID Missing",JOptionPane.WARNING_MESSAGE);
               return;
            }
            if(RemovalReason.isEmpty()){
                JOptionPane.showMessageDialog(regularPanel,
               "Kindly provide a appropriate reason for reverting membership!","Reason",JOptionPane.WARNING_MESSAGE);
               return;
            }
            
            //comparing the id
            try{
                int ID = Integer.parseInt(RTFid.getText());
                for (GymMember d: member){
                    if(d.id == id){
                        if (d instanceof RegularMember){
                            ((RegularMember)d).revertRegularMember(RemovalReason);
                            JOptionPane.showMessageDialog(regularPanel,
                            "Membership is reverted!","Revert Membership",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(regularPanel,
                            "Membership has already been reverted!","Revert Membership",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                            JOptionPane.showMessageDialog(regularPanel,
                            "Member ID not found!","Error",JOptionPane.WARNING_MESSAGE);
                            return;
                }
            }
             catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(regularPanel,
                   "Kindly enter an integer value for ID!","Input is Invalid",JOptionPane.WARNING_MESSAGE);
                    return;
             }
            }
        });
    
        
        
        PRevertMember.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int id = Integer.parseInt(PTFid.getText());
            String RemovalReason = PTARemovalReason.getText();
            if(PTFid.getText().isEmpty()){
                JOptionPane.showMessageDialog(premiumPanel,
               "Kindly enter a Member ID!","ID Missing",JOptionPane.WARNING_MESSAGE);
               return;
            }
            if(RemovalReason.isEmpty()){
                JOptionPane.showMessageDialog(premiumPanel,
               "Kindly provide a appropriate reason for reverting membership!","Reason",JOptionPane.WARNING_MESSAGE);
               return;
            }
            
            //comparing the id
            try{
                int ID = Integer.parseInt(PTFid.getText());
                for (GymMember l: member){
                    if(l.id == id){
                        if (l instanceof PremiumMember){
                            ((PremiumMember)l).revertPremiumMember();
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Membership is reverted!","Revert Membership",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Membership has already been reverted!","Revert Membership",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                    }
                            JOptionPane.showMessageDialog(premiumPanel,
                            "Member ID not found!","Error",JOptionPane.WARNING_MESSAGE);
                            return;
                }
            }
             catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(premiumPanel,
                   "Kindly enter an integer value for ID!","Input is Invalid",JOptionPane.WARNING_MESSAGE);
                    return;
             }
            }
        });
        
        

        //ActionListener for switiching
            RegularMember.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    homePanel.setVisible(false);
                    regularPanel.setVisible(true);
                    premiumPanel.setVisible(false);
                }
            });

        //ActionListener for switiching
            PremiumMember.addActionListener(new ActionListener (){
                public void actionPerformed(ActionEvent e){
                    homePanel.setVisible(false);
                    regularPanel.setVisible(false);
                    premiumPanel.setVisible(true);
                }
            });

        //making the frame visible
        homePanel.setVisible(true);
        regularPanel.setVisible(true);
        premiumPanel.setVisible(true);
        guiFrame.setVisible(true); 

        homePanel.setVisible(true);
        regularPanel.setVisible(false);
        premiumPanel.setVisible(false); 

    }

    public static void main(String[] args){
        new GymGUI();
    }
}