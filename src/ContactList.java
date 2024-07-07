/* Author: Randall Carbonel
 * Date: 7/6/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that uses a class to store and display contact information.
 * Specifications:
 *      - Use a class named Contact to store the data for each contact. This class should include these methods:
 *          - public void setFirstName(String name)
 *          - public String getFirstName()
 *          - public void setLastName(String name)
 *          - public String getLastName()
 *          - public void setEmail(String email)
 *          - public String getEmail()
 *          - public void setPhone(String phone)
 *          - public String getPhone()
 *          - public String displayContact()
 *      - Use the Console class presented in chapter 7 or an enhanced version of it to get and validate the user’s
 *        entries.
 *      - The application should continue only if the user enters “y” or “Y” to continue.
 */

public class ContactList {

    // Greeter
    private static void greeter() {
        System.out.println();
        System.out.println("Welcome to the Contact List application");
        System.out.println();
    }

    public static void main(String[] args) {

        // Greeter
        greeter();

        // Set choice so the program runs at least once
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            // Instantiate Contact Class
            Contact contact = new Contact();

            // Get user input
            String fName = Console.getString("Enter first name: ");
            String lName = Console.getString("Enter last name: ");
            String eMail = Console.getString("Enter e-mail: ");
            String phone = Console.getString("Enter phone number: ");

            // Populate the class
            contact.setFirstName(fName);
            contact.setLastName(lName);
            contact.setEmail(eMail);
            contact.setPhone(phone);

            // Display contact information
            System.out.println(contact.displayContact());

            // Ask the user if they want to input another contact
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
    }
}
