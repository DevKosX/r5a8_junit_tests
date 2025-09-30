package r5a08.example.project;

import r5a08.example.project.exceptions.UserGreatingFailureException;

public class UserGreating {
    public static String formatGreating(String nom){
        if(nom.isEmpty())
            throw new UserGreatingFailureException("Name is empty !");
        return "Bonjour, "+ nom;
    }
}