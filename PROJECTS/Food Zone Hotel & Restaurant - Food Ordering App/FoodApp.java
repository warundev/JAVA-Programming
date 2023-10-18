import java.util.Scanner;
public class FoodApp{
    public static void main(String args[])
        {
            List obj1=new List();
			Bill obj2=new Bill();
            char choice;
			Scanner sc=new Scanner(System.in);
				
			do{
				obj1.Display_list();
				obj1.Menu_Selections();
				obj1.meal_price();
			System.out.print("Do you need go back(Yes-Y/No-N):");
            
            choice=sc.next().charAt(0);
			
			}while(choice=='Y'||choice=='y');
					
			
			if(choice=='N'||choice=='n')
				{
					
					if(obj1.menu_selection==1){
						
						obj2.User_Details();
						obj1.Print_Price();
					}
					else{
						System.out.println("Thank You!!");
					}
				}
			else
				{
					System.out.println("Error!!");
				}
				
            
            
        }
}