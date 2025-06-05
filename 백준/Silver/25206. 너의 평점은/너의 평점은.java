import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double subjGrade = 0.0; // 학점 X 과목평점
        double gradeSum = 0.0; // 학점 총합

        for (int i = 0; i < 20; i++) {
            String reportStr = br.readLine();
            String[] reportArr = reportStr.split(" ");

            if (reportArr[2].equals("P")) {
                continue;
            }
            gradeSum += Double.parseDouble(reportArr[1]);
            subjGrade += (Double.parseDouble(reportArr[1]) * getGradePoint(reportArr[2]));


        }

        System.out.println(subjGrade/gradeSum);

    }

    public static double getGradePoint(String grade) {

        double point = 0.0;

        switch (grade) {
            case "A+":
                point = 4.5;
                break;
            case "A0":
                point = 4.0;
                break;
            case "B+":
                point = 3.5;
                break;
            case "B0":
                point = 3.0;
                break;
            case "C+":
                point = 2.5;
                break;
            case "C0":
                point = 2.0;
                break;
            case "D+":
                point = 1.5;
                break;
            case "D0":
                point = 1.0;
                break;
            case "F":
                point = 0.0;
                break;
        }

        return point;

    }
}


