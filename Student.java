public class Student{
    private String name;
    private double[] test = new double[4];


    public Student(){
        name = " ";
    }

    public Student(String n, double[] t){
        name = n;
        test = t;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setTest(double t,int i)
    {
        test[i] = t;
    }

    public double getTest(int i)
    {
        return test[i];
    }


    public double getTestAvg(){

        double sum = 0;
        double avg;
        for(int i = 0; i < test.length; i++)
        {
            sum += test[i];
        }
         avg = sum / test.length;
         return avg;
    }

    public char getLetterGrade(){

        double average = getTestAvg();
        char grade=0;

        if(average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >=60)
            grade = 'D';
        else if (average < 60)
            grade = 'F';

        return grade;
    }

    public String toString(){
        String str = "";
        str += "\nName of student: " + name;
        str += "\nAverage test score: " + getTestAvg();
        str += "\nLetter grade: " + getLetterGrade();
        return str;
    }
}       