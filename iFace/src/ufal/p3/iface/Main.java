package ufal.p3.iface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int max_users = 100;
        String[] username = new String[max_users];
        String[] password = new String[max_users];
        String[] realname = new String[max_users];
        String[] email = new String[max_users];
        int[] birth_year = new int[max_users];
        int[] birth_month = new int[max_users];
        int[] birth_day = new int[max_users];
        String[] about = new String[max_users];


        Scanner scan = new Scanner(System.in);

        int user_amount = 0;
        int option = 0;

        while (option != 3) {
            System.out.println("");
            System.out.println("Welcome to iFace");
            System.out.println("There are currently " + user_amount + " registered users");
            System.out.println("");

            boolean invalid_option = true;
            while (invalid_option) {

                invalid_option = false;
                System.out.println("Choose one of the options below:");
                System.out.println("1: Register");
                System.out.println("2: Login");
                System.out.println("3: Quit iFace");

                System.out.print("Type your option: ");
                option = scan.nextInt();
                scan.nextLine(); //eliminate line ending

                if (option == 3) {
                    System.out.println("Quitting iFace. Until next time!");
                    break;
                } else if (option == 1) {
                    System.out.println("NEW USER REGISTRATION");

                    System.out.print("Username: ");
                    username[user_amount] = scan.nextLine();

                    System.out.print("Password: ");
                    password[user_amount] = scan.nextLine();

                    System.out.print("Your name: ");
                    realname[user_amount] = scan.nextLine();


                    user_amount++;

                    System.out.println("Thanks for registering!");
                    System.out.println("Please login to proceed.");


                } else if (option == 2){
                    System.out.println("USER LOGIN");
                    System.out.print("Username: ");
                    String new_login = scan.nextLine();
                    System.out.print("Password: ");
                    String new_pass = scan.nextLine();

                    boolean user_found = false;
                    int j;
                    for (j = 0; j < max_users; j++){
                        if ( new_login.equals(username[j]) ){
                            user_found = true;
                            break;
                        }
                    }
                    if (user_found){
                        if (new_pass.equals(password[j]) ){
                            System.out.println("Successful login");

                            /* MENU */
                            while (true){

                                System.out.println("");
                                System.out.println("Select an option below");
                                System.out.println("1: Edit your profile");
                                System.out.println("2: Add a friend");
                                System.out.println("3: Send a message");
                                System.out.println("4: Create a community");
                                System.out.println("5: Invite friends to a community");
                                System.out.println("6: Visit a profile or community");
                                System.out.println("7: Exit/Logoff");
                                System.out.println("8: Delete your account");

                                System.out.print("Type your option: ");
                                int menu_option = scan.nextInt();
                                scan.nextLine(); //eliminate line ending
                                System.out.println("");

                                if (menu_option == 1){//edit profile

                                    while (true) {
                                        System.out.println("What do you want to edit?");
                                        System.out.println("1: Username");
                                        System.out.println("2: Password");
                                        System.out.println("3: Name");
                                        System.out.println("4: Birthday");
                                        System.out.println("5: Email");
                                        System.out.println("6: About me");
                                        System.out.println("7: Return to menu");

                                        System.out.print("Type your option: ");
                                        int edit_option = scan.nextInt();
                                        scan.nextLine(); //eliminate line ending
                                        System.out.println("");

                                        if (edit_option == 1){ //edit user
                                            System.out.print("New Username: ");
                                            username[j] = scan.nextLine();
                                        }
                                        else if (edit_option == 2){ //edit pass
                                            System.out.print("New Password: ");
                                            password[j] = scan.nextLine();
                                        }
                                        else if (edit_option == 3){//edit name
                                            System.out.print("New Name: ");
                                            realname[j] = scan.nextLine();
                                        }
                                        else if (edit_option == 4){//edit birth
                                            System.out.println("Enter your birthday:");
                                            System.out.print("Day: ");
                                            birth_day[j] = scan.nextInt();
                                            scan.nextLine(); //eliminate line ending
                                            System.out.print("Month: ");
                                            birth_month[j] = scan.nextInt();
                                            scan.nextLine(); //eliminate line ending
                                            System.out.print("Year: ");
                                            birth_year[j] = scan.nextInt();
                                            scan.nextLine(); //eliminate line ending

                                        }
                                        else if (edit_option == 5){
                                            System.out.print("New Email: ");
                                            email[j] = scan.nextLine();
                                        }
                                        else if (edit_option == 6){
                                            System.out.println("Write something about yourself:");
                                            about[j] = scan.nextLine();
                                        }
                                        else if (edit_option == 7){
                                            break;
                                        }
                                        else {
                                            System.out.println("Invalid option");
                                        }


                                    }

                                }
                                else if (menu_option == 2){//add friend

                                }
                                else if (menu_option == 3){//send message

                                }
                                else if (menu_option == 4){//create community

                                }
                                else if (menu_option == 5){//invite to community

                                }
                                else if (menu_option == 6){//visit
                                    System.out.println("");
                                    System.out.println("1: Visit a user profile");
                                    System.out.println("2: Visit a community page");

                                    System.out.print("Type your option: ");
                                    int visit_option = scan.nextInt();
                                    scan.nextLine(); //eliminate line ending
                                    System.out.println("");

                                    if (visit_option == 1){//visit user
                                        System.out.print("Enter the username: ");
                                        String visit_username = scan.nextLine();

                                        int v;
                                        for (v = 0; v < max_users; v++){
                                            if ( visit_username.equals(username[v]) ){
                                                break;
                                            }
                                        }
                                        if ( v == max_users){
                                            System.out.println("User not found");
                                        }
                                        else{
                                            System.out.println("Name: " + realname[v]);
                                            System.out.println("Email: " + email[v]);
                                            System.out.println("Birthday: " +birth_day[v]+"/"+birth_month[v]+"/"+birth_year[v]  );
                                            System.out.println("About: " + about[v]);
                                        }
                                    }
                                    else if (visit_option == 2){//visit community

                                    }
                                    else{
                                        System.out.println("Invalid option");
                                    }

                                }
                                else if (menu_option == 7){//logoff
                                    System.out.println("Logging off");
                                    System.out.println("Returning to main menu");
                                    break;
                                }
                                else if (menu_option == 8){//delete account

                                }
                                else {
                                    System.out.println("Invalid option");
                                }


                            }
                        }
                        else {
                            System.out.println("Wrong password");
                        }
                    }
                    else {
                        System.out.println("User not found");
                    }

                } else {
                    System.out.println("Invalid option, please try again.");
                    invalid_option = true;
                }
            }

        }
    }
}
