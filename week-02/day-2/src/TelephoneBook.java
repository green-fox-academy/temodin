import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap <String, String> phonebook = new HashMap<>();
        phonebook.put("William A. Lathan",	"405-709-1865");
        phonebook.put("John K. Miller",	"402-247-8568");
        phonebook.put("Hortensia E. Foster",	"606-481-6467");
        phonebook.put("Amanda D. Newland",	"319-243-5613");
        phonebook.put("Brooke P. Askew",	"307-687-2982");

        // What is John K. Miller's phone number?
        System.out.println("John K. Miller's number is " + phonebook.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        for (String phoneNumber : phonebook.keySet()
             ) {if (phonebook.get(phoneNumber).equals("307-687-2982")) {
            System.out.println("The number 307-687-2982 belongs to " + phoneNumber);
        }
        }

        //Do we know Chris E. Myers' phone number?
        String answer;
        if (phonebook.containsKey("Chris E. Myers")) {
            answer = "We know Chris E. Myers' phone number";
        } else {answer = "We don't know Chris E. Myers' phone number";}
        System.out.println(answer);


    }
}
/*
    Create an application which solves the following problems.

        What is John K. Miller's phone number?
        Whose phone number is 307-687-2982?
        Do we know Chris E. Myers' phone number?

 */
