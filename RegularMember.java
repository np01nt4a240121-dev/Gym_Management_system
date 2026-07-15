public class RegularMember extends GymMember{
    
    //Attributes
    private final int attendanceLimit;  //Constant value
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    
    //Constructor
    public RegularMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate, String referralSource){
        
        //Calling superclass
        super(id, name, location, phone, email, gender, DOB, membershipStartDate);
        
        //Initializing specific attributes
        this.referralSource = referralSource;
        this.isEligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = "";
        this.attendanceLimit = 30;
    }
    
    //Accessor method
    public int getAttendanceLimit(){
        return attendanceLimit;
    }
    public boolean getIsEligibleFoeUpgrade(){
        return isEligibleForUpgrade;
    }
    public String getRemovalReason(){
        return removalReason;
    }
    public String getReferralSource(){
        return referralSource;
    }
    public String getPlan(){
        return plan;
    }
    public double getPrice(){
        return price;
    }
    
    //Implementation of abstract method
    @Override
    public void markAttendance(){
        //Attendance increment
        attendance++;
        loyaltyPoints += 5;  //Increasing loyalty points by 5
    }
    
    //Method to get the price of the plan
    public double getPlanPrice(String plan){
        switch(plan.toLowerCase()) {
            
            case "basic":
                return 6500;
            case "standard":
                return 12500;
            case "deluxe":
                return 18500;
                
            default:
                return -1; //Invalid plan
    }
    }
    
    //Method to upgrade the plan
    public String upgradePlan(String newPlan){
        if(getPlanPrice(newPlan) == -1){
            return"Invalid plan has been selected.";
        }
        
        if(newPlan.equals(plan)){
            return "You are already upgraded to the" + newPlan + "plan.";
        }
        
        if(getAttendance() >= attendanceLimit ==true){
            isEligibleForUpgrade = true;
            return"Your plan has been upgraded to" + newPlan+ "at the price" +price+ ".";
        }
        
        else{
            return"You are not eligible for an upgrade."; 
        }
    }
    
    //Method reverting the RegularMember
    public void revertRegularMember(String removalReason){
        super.resetMember();
        
        this.isEligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = removalReason;
    }
    
    //Method displaying the details of RegularMember
    @Override
    public void display(){
        super.display();
        
        System.out.println("Plan:" + plan);
        System.out.println("Price:" + price);
        
        if(removalReason.isBlank() ==false){
            System.out.println("The reason of removal is" + removalReason);
        }
    }
}
    
