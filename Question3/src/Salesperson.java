public class Salesperson{
    private int IDNumber;
    private double annualSalesAmount;

    Salesperson(int IDNumber, double annualSalesAmount){
        this.IDNumber = IDNumber;
        this.annualSalesAmount = annualSalesAmount;
    }
    Salesperson(){
        IDNumber = 9999;
        annualSalesAmount = 0.0;
    }

    public double getAnnualSalesAmount() {
        return annualSalesAmount;
    }
    public void setAnnualSalesAmount(double annualSalesAmount) {
        this.annualSalesAmount = annualSalesAmount;
    }
    public int getIDNumber() {
        return IDNumber;
    }
    public void setIDNumber(int iDNumber) {
        IDNumber = iDNumber;
    }

}
