package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String season = "";
        if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
            season = "Winter";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            season = "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            season = "Summer";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            season = "Autumn";
        }else {
            season = "Wrong month number";
        }
        System.out.println(season);
    }

}
