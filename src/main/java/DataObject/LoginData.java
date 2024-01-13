package DataObject;

import com.github.javafaker.Faker;

public class LoginData{
    static Faker faker1 = new Faker();


public static

    String

    correctUserName = "admin.admin",

    correctPassword = "welcome",

    inCorrectUserName = faker1.bothify("ABCDE"),

    inCorrectPassword = faker1.bothify("????##??");


}
