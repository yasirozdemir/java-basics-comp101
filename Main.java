public class Main {
    public static void main(String[] args) {
        int studentage = 15;
        double studentgpa = 3.45;
        String studentfirstname = "Kayla";
        String studentlastname = "Hammon";
        char thefirstinitial = studentfirstname.charAt(0);
        char thelastinitial = studentlastname.charAt(0);
        boolean perfectattendance = true;

        System.out.println(studentage);
        System.out.println(thefirstinitial + " " + thelastinitial);
        System.out.println(perfectattendance);
        System.out.println(studentfirstname + " " + studentlastname + " has a GPA of " + studentgpa);
    }
}
