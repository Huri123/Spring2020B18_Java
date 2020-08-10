package day35_Static;

/*Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers
 */
public class Offer {
    String location;
    String company;
    double salary;
    boolean isFulltime;

    public void setInfo(String location,String company,double salary,boolean isFulltime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFulltime=isFulltime;

    }
    public String toString(){
        return "Location: "+location+", Company: "+company+", Salary: $"+salary+", FullTime: "+isFulltime;
    }

}
