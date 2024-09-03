import java.util.Scanner;

class Medical {
    // Data members
    private String medicalName;
    private String medicalISNNumber;
    private String mCity;
    private String mOnear;
    private String mMobileNo;
    private String mEmailId;
    private String date;
    private int stock;
    private int quantity;
    private double price;

    // Default constructor
    public Medical() {
    }

    // Parameterized constructor
    public Medical(String medicalName, String medicalISNNumber, String mCity, String mOnear, String mMobileNo, String mEmailId, String date, int stock, int quantity, double price) {
        this.medicalName = medicalName;
        this.medicalISNNumber = medicalISNNumber;
        this.mCity = mCity;
        this.mOnear = mOnear;
        this.mMobileNo = mMobileNo;
        this.mEmailId = mEmailId;
        this.date = date;
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to display medical data
    public void displayData() {
        System.out.println("Medical Name: " + medicalName);
        System.out.println("Medical ISN Number: " + medicalISNNumber);
        System.out.println("City: " + mCity);
        System.out.println("Owner: " + mOnear);
        System.out.println("Mobile Number: " + mMobileNo);
        System.out.println("Email ID: " + mEmailId);
        System.out.println("Date: " + date);
        System.out.println("Stock: " + stock);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    // Overloaded method to display medical data with a specific format
    public void displayData(String format) {
        switch (format.toLowerCase()) {
            case "brief":
                System.out.println("Medical Name: " + medicalName);
                System.out.println("Price: " + price);
                break;
            case "detailed":
                displayData();
                break;
            default:
                System.out.println("Invalid format specified.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for medical data
        System.out.print("Enter Medical Name: ");
        String medicalName = scanner.nextLine();
        System.out.print("Enter Medical ISN Number: ");
        String medicalISNNumber = scanner.nextLine();
        System.out.print("Enter City: ");
        String mCity = scanner.nextLine();
        System.out.print("Enter Owner: ");
        String mOnear = scanner.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mMobileNo = scanner.nextLine();
        System.out.print("Enter Email ID: ");
        String mEmailId = scanner.nextLine();
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        // Creating an instance of Medical class
        Medical medical = new Medical(medicalName, medicalISNNumber, mCity, mOnear, mMobileNo, mEmailId, date, stock, quantity, price);

        // Using switch case to choose the format to display the data
        System.out.print("Enter display format (brief/detailed): ");
        scanner.nextLine(); // Consume newline
        String format = scanner.nextLine();
			

        switch (format.toLowerCase()) {
            case "brief":
                System.out.println("\nDisplaying Medical Data (Brief):");
                medical.displayData("brief");
                break;
            case "detailed":
                System.out.println("\nDisplaying Medical Data (Detailed):");
                medical.displayData("detailed");
                break;
            default:
                System.out.println("Invalid format specified.");
        }

        // Close the scanner
        scanner.close();
    }
}
