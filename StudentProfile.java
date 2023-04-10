public class StudentProfile {
    String studentFirstName;
    String studentLastName;
    int expectedGraduateYear;
    double GPA;
    String declaredMajor;

    public StudentProfile(String studentFirstName,
                   String studentLastName,
                   int expectedGraduateYear,
                   double GPA,
                   String declaredMajor) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedGraduateYear = expectedGraduateYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public int graduateYear() {return expectedGraduateYear + 1;}

}
