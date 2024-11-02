package srp;

// In the example, Bad_userManager initially handles both user registration and email notifications, which violates SRP. 

// By splitting it into UserRegistrationService and EmailService, each class has a single responsibility, improving maintainability.

// OOP Pillars: This follows Encapsulation by clearly defining the purpose of each class.

// Best Practices: Adheres to DRY (Don’t Repeat Yourself), as splitting responsibilities reduces the likelihood of repeated code, and YAGNI (You Ain’t Gonna Need It), as it avoids overcomplicating a single class with multiple functions.

// A class violating SRP by handling multiple responsibilities
public class Bad_userManager {
  public void addUser(String username) {
    // Code to add user
    System.out.println("Adding user...");
  }

  public void sendEmail(String username, String message) {
    // Code to send email to user
    System.out.println("Sending email to user...");
  }
}