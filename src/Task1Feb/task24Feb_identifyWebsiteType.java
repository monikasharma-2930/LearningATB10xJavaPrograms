package Task1Feb;

import java.util.Scanner;

public class task24Feb_identifyWebsiteType {
    public static void main(String[] args) {
        String url,msg;
        String domain="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website URL:");
        url = sc.nextLine();
        if(url.trim().equals("")){
            System.out.println("Please enter url.");
        }else{
           int index = url.lastIndexOf(".");
           if(index>=0)
               domain = url.substring(index);
           else{
               System.out.println("Entered URL is not valid");
               System.exit(0);
           }
        }
        switch(domain){
            case ".com":
                msg = "Commercial website";
                break;
            case ".org":
                msg = "Non-profit organization";
                break;
            case ".edu":
                msg = "Educational institution";
                break;
            case ".gov":
                msg = "Government website";
                break;
            case ".net":
                msg = "Network-related website";
                break;
            case ".info":
                msg = " Informational website";
                break;
            default:
                msg = "Unknown or other types of websites";
                break;
        }
        System.out.println(msg);
    }
}
