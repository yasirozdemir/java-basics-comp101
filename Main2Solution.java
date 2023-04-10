public class Main2Solution {
    public static void main(String [] args) {
        StudentProfileSolution profileOne = new StudentProfileSolution("Yasir","Ozdemir", "IE", 3.45, 2025);
        StudentProfileSolution profileTwo = new StudentProfileSolution("Furkan", "Ozdemir", "Laws", 3.65, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
