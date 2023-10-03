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

    public void createEnquiry() {
        System.out.println("User Enquiry submitted to system.");
    }

    public void trackEnquiry(Enquiry enquiry) {
        System.out.println("User tracks enquiry with given traceID");
    }
}
