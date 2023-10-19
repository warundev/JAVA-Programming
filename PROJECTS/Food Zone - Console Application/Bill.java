import java.util.Scanner;
public class Bill extends List{

    final double Service=50;
    //double delivery;
    //char distance;//to get the distane from shop 5km or more;
	//public double fullp;
	


    public void User_Details()
    {
		
		//fullp=meal_price();
		
        Scanner sc=new Scanner(System.in);

        String Name,NIC,Address;
        int Tel_no;
        

        System.out.println("Enter Youer Details Here:");
        System.out.println("Name: ");
        Name=sc.next();
		setName(Name);
        System.out.println("NIC Number: ");
        NIC=sc.next();
		setNIC(NIC);
        System.out.println("Telephone Number: ");
        Tel_no=sc.nextInt();
		setTel_no(Tel_no);
        System.out.println("Address: ");
        Address=sc.next();
		setAddress(Address);


        /*System.out.println("Is your place inside 5km? (Y - Yes/ N- No)");
        distance=sc.next().charAt(0);

	
        if(distance=='Y'||distance=='y')
        {
            fullp=fullp+100+50;
        }
        else{
           fullp=fullp+150+50;
        }*/

        System.out.println("Bill summery :    ");
        System.out.println("\n");
       
		System.out.println("Customer name : "+Name);
        System.out.println("Address : "+Address);
        System.out.println("Telephone Number "+ Tel_no);
        System.out.println("\n");
        /*System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Full price: "+fullp);*/
        


    } 

}