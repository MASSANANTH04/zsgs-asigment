package day_9;

import java.util.Scanner;

import javax.security.sasl.AuthenticationException;

//question-8
public class exceptionquestion8 {
    public static void main(String[] args) {
        Scanner scanstr=new Scanner(System.in);
        Scanner scanint=new Scanner(System.in);
        System.out.println("Create Account");
        System.out.println();
        System.out.println("Step-1");
        System.out.println();
        System.out.print("User Name: ");
        String usernamecreate=scanstr.nextLine();
        System.out.println();
        System.out.println("Step-2");
        System.out.println();
        System.out.print("Set Password: ");
        String passwordcreate=scanstr.nextLine();
        System.out.println();
        System.out.println("Your Account is processing...login agin ");
        System.out.println();
        int chick=0;
        try{
            System.out.print("User Name: ");
            String username=scanstr.nextLine();
            if(usernamecreate.equals(username)){
                System.out.println();
                System.out.print("Enter Password :");
                String pass=scanstr.nextLine();
                if(passwordcreate.equals(pass)){
                    chick=1;
                }
                else {
                    throw new WrongThreadException();
                }
            }
            else{
                throw new AuthenticationException();

            }
        }
        catch(AuthenticationException d){
            System.out.println("User Name is incorrect...!");
        }
        catch(Exception f){
            System.out.println("PassWord is Wrong..!");
        }
        finally{
            if(chick==0){
                System.out.println("Login Failure");
            }
            else{
                System.out.println("Login Successfully............");
            }
        }
        
    }
}
