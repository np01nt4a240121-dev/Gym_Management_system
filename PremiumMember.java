public class PremiumMember extends GymMember{
    
    //Private attributes
    private final double premiumCharge;
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    
    //Constructor
    public PremiumMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate, String personalTrainer){
        super(id, name, location, phone, email, gender, DOB, membershipStartDate);
        
        //Initializing the subclass attributes
        this.personalTrainer = personalTrainer;
        this.isFullPayment = false;
        this.paidAmount = 0.0;
        this.discountAmount = 0.0;
        this.premiumCharge = 50000;
    }
    
    //Accessor methods 
    public double getPremiumCharge(){
        return premiumCharge;
    }
    public String getPersonalTrainer(){
        return personalTrainer;
    }
    public boolean isFullPayment(){
        return isFullPayment;
    }
    public double getPaidAmount(){
        return paidAmount;
    }
    public double getDiscountAmount(){
        return discountAmount;
    }
    
    //Implementation of abstract method
    @Override
    public void markAttendance(){
        //Attendance increment
        attendance++;
        loyaltyPoints +=10;
    }
    
    //Method to pay the due amount
    public String payDueAmount(double payment) {
        if(isFullPayment==true){
            return"Member has already paid the full amount.";
        }
        
        if(paidAmount > premiumCharge){
            return"The paid amount exeeds the premium charge of" +name;
        }
        
        if(paidAmount == premiumCharge){
            isFullPayment = true;
            return "Member has paid the full amount.";
        }
        
        else{
            double remainingAmount = premiumCharge - paidAmount;
            return "Payment is successful. The remaining amount:" +remainingAmount;
        }
        //? check
    }
    
    //Method calculating the discont
    public void calculateDiscount(){
        if(isFullPayment==true){
            discountAmount = 0.1 * premiumCharge;
            System.out.println("Discount applied.");
        }
        else{
            discountAmount = 0.0;
            System.out.println("No discount is available due to incomplete payment.");
        }
    }
    
    //Method reverting PremiumMember
    public void revertPremiumMember(){
        super.resetMember();
        
        personalTrainer = "";
        isFullPayment = false;
        paidAmount = 0.0;
        discountAmount = 0.0;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Personal Trainer:" + personalTrainer);
        System.out.println("Paid Amount:" + paidAmount);
        System.out.println("Full Payment Status:" + (isFullPayment ? "Payment is full" : "Pending"));
        
        double remainingAmount = premiumCharge - paidAmount;
        System.out.println("Remaining amount to be paid is:" + remainingAmount);
        
        if(isFullPayment==true){
            System.out.println("Discount Amount is:" + discountAmount);
        }
    }
}