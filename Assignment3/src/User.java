public class User {
    private String userID;
    private String pw;
    private String DOB;
    private String address;
    private String ContNumb;
    private String email;

    private EDSystem edSystem = new EDSystem();

    public void registerFroCourse(String userID) {
    }

    private void login() {
    }

    private void logout() {
    }

    private void reqCrsCancel() {
    }

    public void doEnquiry() {
        System.out.println("User submit Enquiry to system.");
    }

    public void queryEnquiry(Enquiry enquiry) {
        System.out.println("user track enquiry with traceID");
    }
}
