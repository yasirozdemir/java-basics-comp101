public class Main2 {
    public static void main(String [] args) {
        StudentProfile studentA = new StudentProfile("Yasir", "Ozdemir", 2025, 3.65, "Industrial Engineering");
        StudentProfile studentB = new StudentProfile("Furkan", "Ozdemir", 2021, 3.85, "Laws");

        System.out.println(studentA.studentFirstName);
        System.out.println(studentA.studentLastName);
        System.out.println(studentA.expectedGraduateYear);
        System.out.println(studentA.GPA);
        System.out.println(studentA.declaredMajor);

        System.out.println(studentB.studentFirstName);
        System.out.println(studentB.studentLastName);
        System.out.println("Expected graduate Year is " + studentB.expectedGraduateYear);
        System.out.println("Incremented graduate year is " + studentB.graduateYear());
        System.out.println(studentB.GPA);
        System.out.println(studentB.declaredMajor);
    }
}
