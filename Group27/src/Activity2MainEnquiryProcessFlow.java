public class Activity2MainEnquiryProcessFlow {
    public static void main(String[] args) {
        Enquiry enquiry = new Enquiry();
        EDSystem edSystem = new EDSystem();
        User user = new User();

        //User submit Enquiry to system.

        user.createEnquiry();
        //system generate trace id for the enquiry.
        //system return traceID to user.
        edSystem.returnTraceID(enquiry);
        //system ask manager to process enquiry.
        //manager respond enquiry to system with traceID.
        edSystem.processEnquiry();
        //user track enquiry with traceID
        user.queryEnquiry(enquiry);
        //system respond enquiry with traceID to user.
        edSystem.respondEnquiry(enquiry);

    }
}
