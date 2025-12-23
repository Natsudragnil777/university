

public class Person {
String firstName;
String lastName;
int age;
int adress;

public void displayInfo(){
    System.out.println("first name :" + firstName + "  last name :" + lastName + "   age : " + age );
}
public void concatInformation(){
    System.out.println("your name :" + firstName + "  " + lastName + "   age : " + age + "   adress :" + adress );
}

public void update(String firstName, String lastName, int age, int adress){
 this.firstName = firstName;
 this.lastName = lastName;
 this.age = age;
 this.adress = adress;
}

public void displayAddInfo(){
    System.out.println("first name :" + firstName + "  last name :" + lastName + "   age : " + age + "    adress" + adress );
}


}
