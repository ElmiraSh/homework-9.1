package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class UtilsFaker {
    public Faker faker=new Faker(new Locale("en"));

    public String userName=faker.name().firstName(),
    lastName=faker.name().firstName(),
    userEmail=faker.internet().emailAddress(),
    userGender=getRandomGender(),
    userNumber=faker.phoneNumber().subscriberNumber(10),
    userSubjects=getRandomSubjects(),
    userHobbies=getRandomHobbies(),
    userCurrentAddress=faker.address().fullAddress(),
    userState=getRandomState(),
    userCity=getRandomCity(),
    userDate= String.valueOf(faker.number().numberBetween(1, 28)),
    userMounth=getRandomMounth(),
    userYear= String.valueOf(faker.number().numberBetween(1990, 2015));


    public String getRandomGender(){
        String[] genders={"Male","Female","Other"};
       return faker.options().option(genders);
    }
    public String getRandomSubjects(){
        String[] subjects={"Math","Arts","Chemistry","Hindi","English","Biology","Computer Science"};
        return faker.options().option(subjects);
    }

    public String getRandomHobbies(){
        String[] hobbies={"Sports","Reading","Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomState(){
        String[] state={"NCR","Uttar Pradesh"};
        return faker.options().option(state);
    }

    public String getRandomCity(){

        String[] city={"Delhi","Gurgaon","Noida","Agra","Lucknow", "Merrut"};
        return faker.options().option(city);
    }
    public String getRandomMounth(){
        String[] mounth={"January","February","March","April","May",
                "June","July","August","September","October","November","December"};
        return faker.options().option(mounth);
    }

}
