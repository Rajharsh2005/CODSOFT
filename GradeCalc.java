import java.util.Scanner;
public class GradeCalc{
    int TotalMarks(int subj1, int subj2, int subj3, int subj4, int subj5){
        return subj1 + subj2 + subj3 + subj4 + subj5;
    }
    int AvgPercent(int TotalMarks){
        return TotalMarks/5;
    }
    public static void main(String[] args) {
        GradeCalc gc = new GradeCalc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Subject 1:");
        int subj1 = sc.nextInt();
        System.out.println("Enter marks for Subject 2:");
        int subj2 = sc.nextInt();
        System.out.println("Enter marks for Subject 3:");
        int subj3 = sc.nextInt();
        System.out.println("Enter marks for Subject 4:");
        int subj4 = sc.nextInt();
        System.out.println("Enter marks for Subject 5:");
        int subj5 = sc.nextInt();
        System.out.println("Total Marks: " + gc.TotalMarks(subj1, subj2, subj3, subj4, subj5));
        System.out.println("Average Percentage: " + gc.AvgPercent(gc.TotalMarks(subj1, subj2, subj3, subj4, subj5)));
        if(gc.AvgPercent(gc.TotalMarks(subj1, subj2, subj3, subj4, subj5)) >= 90){
            System.out.println("Grade: O");
        } else if(gc.AvgPercent(gc.TotalMarks(subj1, subj2, subj3, subj4, subj5)) >= 80){
            System.out.println("Grade: E");
        } else if(gc.AvgPercent(gc.TotalMarks(subj1, subj2, subj3, subj4, subj5)) >= 70){
            System.out.println("Grade: A");
        } else if(gc.AvgPercent(gc.TotalMarks(subj1, subj2, subj3, subj4, subj5)) >= 60){
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();


    }
}