import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(String S) {

        List<String> list = Arrays.asList(S.split("\\n"));
        List<DayTime> dayTimeList = new ArrayList<>();
        DayTime dayTime;
        for (String s : list) {
            dayTime = new DayTime();
            String[] str = s.split(" ");
            dayTime.setDay(str[0]);
            String str1 = str[1].split("-")[0];
            String strConcat1 = str1.split(":")[0].concat(str1.split(":")[1]);
            String str2 = str[1].split("-")[0];
            String strConcat2 = str2.split(":")[1].concat(str2.split(":")[1]);
            //dayTime.getStartTime(strConcat2);

        }
        //Collections.sort(list, new MyComparator());
        return 0;
    }
}
class MyComparator implements Comparator<DayTime> {

    @Override
    public int compare(DayTime o1, DayTime o2) {
        return 0;
    }
}
class DayTime {
    private String day;
    private int startTime;
    private int endTime;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}