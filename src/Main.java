import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<String, Integer>();

        int count = 0;
        int lowest = 120;
        int highest = 0;
        String highClass = "";
        String lowClass = "";

        grades.put("Engineering Design", 100);
        grades.put("Physics", 95);
        grades.put("PreCalc", 91);
        grades.put("Programming", 102);
        grades.put("Comp II", 92);

        System.out.println("Grades By Subject:\n");

        for(String classes: grades.keySet()) {
            //System.out.println(classes +": " + grades.get(classes));
            System.out.printf("%-24s%3d", classes, grades.get(classes));
            System.out.println("\n");
            count++;
        }

        double avg = 0;
        int total = 0;

        System.out.println("\nNumber of Classes: " + count);
        for(String classes: grades.keySet()) {
            if (lowest > grades.get(classes)){
                lowest = grades.get(classes);
                lowClass = classes;
            }

            if(highest < grades.get(classes)){
                highest = grades.get(classes);
                highClass = classes;
            }



            total += grades.get(classes);
            avg = total / count;
        }
        System.out.println("\nLowest Grade\nClass: " + lowClass + "\nGrade: " + lowest );
        System.out.println("\nHighest Grade\nClass: " + highClass + "\nGrade: " + highest);
        System.out.println("\n\nOverall Average: " + avg);


    }
}