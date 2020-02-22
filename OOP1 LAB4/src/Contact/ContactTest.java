package Contact;

public class ContactTest {
	
	public static void main(String[] args) {
	Contact c1 = new Contact("likol", "175c", 203, "0158321", 'N');
	c1.detectMobileOperator();
	System.out.println(c1.getPersonName()+" " +c1.getPersonId()+" " +c1.getMobileNumber()+ " " +c1.getGender()+ " " +c1.getAge());
	}
}
