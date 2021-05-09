import java.util.Calendar;

public class InterestCalc {

    private int principal;
    private int month;
    private double rate;
    private double interest;
    private double totalAmount;
    private double amountReceived;
    private double remainingAmount;
    boolean isPaid;
    private String startDate;
    private String dueDate;
    private String name;
    private String number;
    private int ID = 0;
    private Calendar calendar;

    public InterestCalc(String name,String number,int principal, int month, double rate) {
        this.principal = principal;
        this.month = month;
        this.rate = rate;
        this.name = name;
        this.number = number;
        this.isPaid = false;
        this.amountReceived = 0;
        this.remainingAmount = 0;
        this.ID +=  1;
        this.calendar = Calendar.getInstance();
        calculateInterest();
        setStartDate();

    }

    private void calculateInterest() {
        interest = (principal * month * rate);
        totalAmount = interest + principal;
    }

    /* setMethod */

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public void setMonth(int month) {
        this.month = month;
        calcEnddate();
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived += amountReceived;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /* getMethod */

    public int getPrincipal() {
        return principal;
    }

    public int getMonth() {
        return month;
    }

    public double getRate() {
        return rate;
    }

    public double getInterest() {
        return interest;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getAmountReceived() {
        return amountReceived;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    private void setStartDate() {
        this.startDate = String.valueOf(calendar.getTime());
        calcEnddate();
    }

    private void calcEnddate(){
        calendar.add(calendar.MONTH,this.month);
        this.dueDate = String.valueOf(calendar.getTime());
    }

}
