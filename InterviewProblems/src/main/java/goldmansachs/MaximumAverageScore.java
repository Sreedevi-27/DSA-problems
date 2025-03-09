/*
Given an array in which there are arrays that are of length two, the first index of that array has the student name and
the second index has the marks scored. Find the maximum average scored by any student. The array can have multiple
subjects of marks for a particular student.
https://www.geeksforgeeks.org/find-maximum-average-marks-in-student-pairs/

Input: A[] = {{"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}}
Output: 99
Explanation: The average marks of each student are as follows:

Bob: (87+52)/2 = 139/2 = 69
Mike: (35+55)/2 = 90/2 = 45
Jason: (35/1) = 35
Jessica: (99/1) = 99
Input: A[] = {{"Pradeep", "54"}, { "Neeraj", "67"}, { "Sheetal", "34"}}
Output: 67
Explanation: It can be verified that the maximum average marks will be 67.
*/

package goldmansachs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverageScore {
    public int maximumAverageScore(List<String[]> studentsMarkList){
        Map<String, Pair> studentsMap = new HashMap<>();

        for(String[] list : studentsMarkList){
            String studentName = list[0];
            int mark = Integer.parseInt(list[1]);

            if(studentsMap.containsKey(studentName)){
                Pair p = studentsMap.get(studentName);
                p.sumOfMarks += mark;
                p.subjectCount += 1;
                studentsMap.put(studentName,new Pair(p.sumOfMarks, p.subjectCount));
            }else{
                Pair p = new Pair(mark, 1);
                studentsMap.put(studentName,p);
            }
        }

        int max = Integer.MIN_VALUE;
        for(Map.Entry<String , Pair> entry : studentsMap.entrySet()){
            Pair p = entry.getValue();
            int mark = (int) Math.floor((double) p.sumOfMarks / p.subjectCount);
            max = Math.max(max, mark);
        }
        return max;
    }
}

class Pair{
    int sumOfMarks;
    int subjectCount;
    Pair(int sumOfMarks, int subjectCount){
        this.sumOfMarks = sumOfMarks;
        this.subjectCount = subjectCount;
    }
}