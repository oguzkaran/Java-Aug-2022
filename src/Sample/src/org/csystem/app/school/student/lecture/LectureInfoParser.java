package org.csystem.app.school.student.lecture;

import org.csystem.app.date.DateUtil;

public class LectureInfoParser {
    public LectureInfo lectureInfo;

    public static String getDateStr(String str)
    {
        String [] dateInfo = str.split("[/]");

        return DateUtil.getDateStrTR(Integer.parseInt(dateInfo[0]), Integer.parseInt(dateInfo[1]), Integer.parseInt(dateInfo[2]));
    }

    public LectureInfoParser(String str)
    {

        String [] lectureInfoStr = str.split("[:]+");

        //...

        lectureInfo = new LectureInfo();
        lectureInfo.studentName = lectureInfoStr[0];
        lectureInfo.name = lectureInfoStr[1];
        lectureInfo.midtermDate = getDateStr(lectureInfoStr[2]);
        lectureInfo.finalDate = getDateStr(lectureInfoStr[3]);
        lectureInfo.midtermGrade = Integer.parseInt(lectureInfoStr[4]);
        lectureInfo.finalGrade = Integer.parseInt(lectureInfoStr[5]);
    }
}
