package org.csystem.app.school.student.lecture;

public class LectureParserAppConsoleUtil {
    public static void printLectureInfo(LectureInfo lectureInfo)
    {
        int grade = lectureInfo.getGrade();

        System.out.printf("Ad Soyad:%s%n", lectureInfo.studentName);
        System.out.printf("Ders Adı:%s%n", lectureInfo.name);
        System.out.printf("Arasınav Tarihi:%s%n", lectureInfo.midtermDate);
        System.out.printf("Final Tarihi:%s%n", lectureInfo.finalDate);
        System.out.printf("Arasınav Notu:%d%n", lectureInfo.midtermGrade);
        System.out.printf("Final Notu:%d%n", lectureInfo.finalGrade);
        System.out.printf("Geçme Notu:%d%n", grade);
        System.out.printf("Sonuç:%s%n", grade >= 50 ? "Geçti" : "Kaldı");
    }

    //...
}
