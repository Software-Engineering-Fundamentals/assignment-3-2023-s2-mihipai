import java.util.Random;

public class Activity2MainInstructorRegisterCourseFlow {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        EDSystem edSystem = new EDSystem();
        //Instructor register course.
        instructor.createCourse();
        //Instructor request register course to system.
        instructor.requestCreateCourse();
        if (instructor.userID == null) {
            //Instructor request sign up.
            instructor.signUp();
            //system return the registered account.
            edSystem.registeredAccount();
        }
        int time = 1;
        while (time < 3) {
            //Instructor process for 1 time(s).
            System.out.println("Instructor process for " + time + " time(s).");
            //Instructor process course creation.
            instructor.processCourseCreation();
            //Instructor process payment.
            instructor.processPayment();
            //system request PayInfo to user.
            edSystem.requestPayInfo();
            //Instructor provide PayInfo.
            instructor.providePayInfo();
            if (time < 2) {
                //system respond error message when creation failed.
                edSystem.returnErrorMessage();
            } else {
                //system respond with course info after creation.
                edSystem.returnCourseInfo();
            }
            time++;
        }
        Random random = new Random();

        if (random.nextInt(10) % 2 == 1) {
            //Instructor create exam for the course.
            instructor.createExam();
            //system respond exam for a course when creation.
            edSystem.respondExam();
        } else {
            //Instructor create project for the course.
            instructor.createProject();
            //system respond project for a course when creation.
            edSystem.respondProject();
        }

    }
}
