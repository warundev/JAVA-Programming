import java.util.Scanner;

public class List {
    // According to the potion;
    public final double large = 200;
    public final double medium = 150;
    // final double small=100;
    // According to the ingredient
    public final double Vegi = 150;
    public final double Egg = 200;
    public final double Chicken = 250;
    public final double Beaf = 300;
    public final double Mutton = 300;

    public final double C_onion = 190;
    public final double C_tomato = 190;
    public final double D_Chicken = 250;
    public final double T_chicken = 350;
    public final double Sausage = 200;
    public final double H_Spicy = 200;
    // According tho the food type
    public final double F_rice = 200;
    public final double Rice_Curry = 150;
    public final double Koththu = 250;
    public final double Pizza = 800;
    public final double Submarine = 960;
    public final double Devels = 150;
    public final double Vegi_Chop = 350;

    // Selections from lists
    int menu_selection;
    int food_type;
    int food_type_2;
    int size;

    char close_or_ok;// to close the app or go forward

    public double meal_price = 0;
    /*
     * final double Service=50;
     * double delivery;
     * String distance;//to get the distane from shop 5km or more;
     */
    char distance;
    double fullp;
    int Quantity;

    private String Name;
    private String NIC;
    private int Tel_no;
    private String Address;

    public String choice; // return to program

    public List() {
        Name = null;
        NIC = null;
        Tel_no = 0;
        Address = null;
    }

    public List(String Name, String NIC, int Tel_no, String Address) {
        this.Name = Name;
        this.NIC = NIC;
        this.Tel_no = Tel_no;
        this.Address = Address;
    }

    // getters
    String getName() {
        return Name;
    }

    String NIC() {
        return NIC;
    }

    int getTel_no() {
        return Tel_no;
    }

    String getAddress() {
        return Address;
    }

    // Setters
    void setName(String Name) {
        this.Name = Name;
    }

    void setNIC(String nic) {
        this.NIC = NIC;
    }

    void setTel_no(int Tel_no) {
        this.Tel_no = Tel_no;
    }

    void setAddress(String Address) {
        this.Address = Address;
    }

    public void Display_list() {
        System.out.println("---Welcome the Food Zone Hotel & Restaurant---\n");
        System.out.println("---We know what taste is---");
        System.out.println("---Oreder your meal and enjoy it!!!---\n");

        System.out.println("1.Check The Menu ->");
        System.out.println("2.Delivery Detail ->");
        System.out.println("3.About Us ->");
        System.out.println("4.Contact Us->");
        System.out.println("Enter the number of opiton you need....");
        Scanner sc = new Scanner(System.in);
        menu_selection = sc.nextInt();
    }

    public void Menu_Selections() {
        if (menu_selection == 1) {
            Food_menu();
        } else if (menu_selection == 2) {
            System.out.println(
                    "Hello Customer!!.\n According tho our Hottel guidlines\n to deliver around 5km area from our hottel we charge Rs.100/= and otherwice we charge Rs.150/=.");
            System.out.println("\n Thank You!!");
        } else if (menu_selection == 3) {
            System.out.println("(o)  Owner : Mr.D.W.Amarasingha\n");
            System.out.println("(o)  Location : No.11C.Collombo road,Galle.\n");
            System.out.println("(o)  Opened date : 2000/06/27.");
            System.out.println("(o)  Hottel Ratings: 3 Stars!!");
        } else if (menu_selection == 4) {
            System.out.println("(o) Tel.Number : 076 XXXXXXX\n");
            System.out.println("(o) Email : foodzone@gmail.com\n");
            System.out.println("(o) Facebook : foodzone hotel & restaurant");
        } else if (menu_selection > 4) {
            System.out.println("Error!");
        }

        /*
         * System.out.println("Do you need go back(Yes/No):");
         * Scanner sc=new Scanner(System.in);
         * choice=sc.next();
         */

    }

    public double Food_menu()

    {
        System.out.println("1. Fried rice");
        System.out.println("2. Rice and Curry");
        System.out.println("3. Kotthu");
        System.out.println("4. Pizza");
        System.out.println("5. Sumarine");
        System.out.println("6. Devels");
        System.out.println("7. Vegetable Chopsuey");
        System.out.println("\n");
        System.out.println("Select your food category:");
        Scanner sc = new Scanner(System.in);
        food_type = sc.nextInt();

        if (food_type == 1 || food_type == 2 || food_type == 3) {
            System.out.println("1.Vegetable");
            System.out.println("2.Chicken");
            System.out.println("3.Beaf");
            System.out.println("4.Mutton");
            System.out.println("5.Egg");

            if (food_type == 1) {
                meal_price = meal_price + F_rice;
            } else if (food_type == 2) {
                meal_price = meal_price + Rice_Curry;
            } else if (food_type == 3) {
                meal_price = meal_price + Koththu;
            }

            System.out.println("Select your choice:");
            food_type_2 = sc.nextInt();

            if (food_type_2 == 1) {
                meal_price = meal_price + Vegi;
            } else if (food_type_2 == 2) {
                meal_price = meal_price + Chicken;
            } else if (food_type_2 == 3) {
                meal_price = meal_price + Beaf;
            } else if (food_type_2 == 4) {
                meal_price = meal_price + Mutton;
            } else if (food_type_2 == 5) {
                meal_price = meal_price + Egg;
            } else {
                System.out.println("Error!!");
                Food_menu();
            }
        } else if (food_type == 4) {
            System.out.println("1.Cheasy Onion");
            System.out.println("2.Cheasy Tomato");
            System.out.println("3.Double Chiken");
            System.out.println("4.Tandoori Chicken");
            System.out.println("5.Sausage");
            System.out.println("6.Hot & Spicy");

            System.out.println("Select your choice:");
            food_type_2 = sc.nextInt();

            if (food_type_2 == 1) {
                meal_price = meal_price + C_onion;
            } else if (food_type_2 == 2) {
                meal_price = meal_price + C_tomato;
            } else if (food_type_2 == 3) {
                meal_price = meal_price + D_Chicken;
            } else if (food_type_2 == 4) {
                meal_price = meal_price + T_chicken;
            } else if (food_type_2 == 5) {
                meal_price = meal_price + Sausage;
            } else if (food_type_2 == 6) {
                meal_price = meal_price + H_Spicy;
            }

            else {
                System.out.println("Error!!");
                Food_menu();
            }
        } else if (food_type == 5) {
            meal_price = meal_price + Submarine;
        } else if (food_type == 6) {
            System.out.println("1.Chicken");
            System.out.println("2.Beaf");
            System.out.println("3.Mutton");

            System.out.println("Select your choice:");
            food_type_2 = sc.nextInt();

            if (food_type_2 == 1) {
                meal_price = meal_price + Chicken;
            } else if (food_type_2 == 2) {
                meal_price = meal_price + Beaf;
            } else if (food_type_2 == 3) {
                meal_price = meal_price + Mutton;
            }

            else {
                System.out.println("Error!!");
                Food_menu();
            }
        } else if (food_type == 7) {
            meal_price = meal_price + Vegi_Chop;
        } else {
            System.out.println("Error!!");
            Food_menu();
        }

        System.out.println("Select the size you need:");
        System.out.println("1.Large");
        System.out.println("2.Medium");
        System.out.println("3.Small");
        System.out.println("\n");
        System.out.println("Number you need :");
        size = sc.nextInt();

        if (size == 1) {
            meal_price = meal_price + large;
        } else if (size == 2) {
            meal_price = meal_price + medium;
        } else if (size == 3) {
            meal_price = meal_price + 0;
        }

        System.out.println("Enter the Quantity you need:");
        Quantity = sc.nextInt();
        meal_price = meal_price * Quantity;

        return meal_price;

    }

    public double meal_price() {
        Scanner sc = new Scanner(System.in);
        fullp = meal_price;
        System.out.println("Is your place inside 5km? (Y - Yes/ N- No)");
        distance = sc.next().charAt(0);

        if (distance == 'Y' || distance == 'y') {
            fullp = fullp + 100 + 50;
        } else {
            fullp = fullp + 150 + 50;
        }
        return fullp;
    }

    public void Print_Price() {
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.println("Full price: " + fullp);
    }

}