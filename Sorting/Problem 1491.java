/* You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted. */

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0.0,c=0;
        for(int i=1;i<salary.length-1;i++)
        {
        sum+=salary[i];
        c++;
        }
        if(salary.length==3)
        return salary[1];
        else
        return sum/c;
    }
}
