package com.company.beginner.beginnerlevelpractice;

public class practice {


public static void main(String[] args) {
    String ActressName = "Julia Roberts ";
    int YearBorn =1987;
    int Age = 2022-YearBorn;
    String[] MoviesTitle = {"Pretty Woman, Hook, Notting Hill, Wonder (I)"};
    float[] MovieRatings = {7.7F, 7.6F, 6.9F,8.0F};
    System.out.println( "Actress Name:-" + ActressName);
    System.out.println("Year Of Born:-" + YearBorn);
    System.out.println("Age:-" + Age);

    for (int i = 0; i < MoviesTitle.length; i++) {
        System.out.println(MoviesTitle[i]  + " - " + getRating(MovieRatings[i]));
    }
}

    static String getRating(float rating){
        if (rating <= 5.0){
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5){
            return "average";
        } else if (rating > 6.5 && rating <= 7.0){
            return "good";
        } else if (rating > 7.0 && rating <= 8.0){
            return "very good";
        }else{
            return "amazing";
        }
}
}
