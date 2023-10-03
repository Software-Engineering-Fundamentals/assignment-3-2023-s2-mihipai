public class EDSystem {
    Manager manager = new Manager();

    public void generateID(Enquiry enquiry) {
        System.out.println("system generate trace id for the enquiry.");
    }

    public void returnTraceID(Enquiry enquiry) {
        this.generateID(enquiry);
        System.out.println("system return traceID to user.");
    }

    public void processEnquiry() {
        System.out.println("system ask manager to process enquiry.");
        manager.respondEnquiry();
    }

    public void respondEnquiry(Enquiry enquiry) {
        System.out.println("system respond enquiry with traceID to user.");
    }


    public void registeredAccount() {
        System.out.println("system return the registered account.");
    }

    public void requestPayInfo() {
        System.out.println("system request PayInfo to user.");
    }

    public Course returnCourseInfo() {
        System.out.println("system respond with course info after creation.");
        return new Course();
    }

    public void returnErrorMessage() {
        System.out.println("system respond error message when creation failed.");
    }

    public void respondExam() {
        System.out.println("system respond exam for a course when creation.");
    }

    public void respondProject() {
        System.out.println("system respond project for a course when creation.");
    }

}
