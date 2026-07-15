public abstract class GymMember{
    
    //Attributes with their data type
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    //Construtor with parameters
    public GymMember(int id, String name, String location, String phone, String email, String gender, String DOB,String membershipStartDate){
        this.id = id;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.membershipStartDate = membershipStartDate;
        this.attendance = 0;      
        this.loyaltyPoints = 0.0;
        this.activeStatus = false;   
    }
    
    // Accessor method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public String getDOB(){
        return DOB;
    }
    public String getMemberShipStartDate(){
        return membershipStartDate;
    }
    public int getAttendance(){
        return attendance;
    }
    public double getLoyaltyPoints(){
        return loyaltyPoints;
    }
    public boolean getActiveStatus(){
        return activeStatus;
    }
    
    //Abstract method
    public abstract void markAttendance();
    
    //Active Membership
    public void activeMembership(){
        if(activeStatus==false){
            activeStatus = true;
            System.out.println("Your Membership has been activated.");
        }
        else{
            System.out.println("Your Membership is already active.");
        }
    }
    
    //Deactive Membership
    public void deactivateMembership(){
        if(activeStatus==true){
            activeStatus = false;
            System.out.println("Your Membership has been deactivated.");
        }
        else{
            System.out.println("Your Membership is already inactive.");
        }
    }
    
    //To reset the member's status
    public void resetMember(){
        activeStatus = false;
        attendance = 0;
        loyaltyPoints = 0.0;
        System.out.println(name +"data has been reset.");
    }
    
    //Display method
    public void display(){
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Location:" + location);
        System.out.println("Phone:" + phone);
        System.out.println("Email:" + email);
        System.out.println("Gender:" + gender);
        System.out.println("DOB:" + DOB);
        System.out.println("Membership Start Date:" + membershipStartDate);
        System.out.println("Attendance:" + attendance);
        System.out.println("Loyalty Points:" + loyaltyPoints);
        System.out.println("Active Status:" + (activeStatus ? "Active" : "Inactive"));
    }
}