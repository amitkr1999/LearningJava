package com.company.Advance.Exception;

public class DivideTwoNumbersExceptionApp {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("Some thing went wrong!" + e);
        }
        System.out.println(j);

    }

}

// What is Exception Handling?
// Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
// for example : when we divide a zero with another number then Arithmetic exception occur.
// Three type of Exceptions
// Checked Exception, Unchecked Exception, Error.