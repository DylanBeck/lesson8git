
import javax.swing.table.DefaultTableModel;


public class Student {

    //instance variables
    //these are the properties of a student
    private String name;
    private int test[] = new int[3];

    //constructor methods - 3 ways you can make a student
    public Student(String nm, int t[]) {
        name = nm;
        test = t;
    }

    public Student(Student other) {
        this(other.name, other.test);
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setScore(int i, int score) {
        test[i - 1] = score;
    }

    public int getScore(int i) {
        return test[i - 1];
    }

    public int getAverage() {
        int average = (test[0] + test[1] + test[2]) / 3;
        return average;
    }

    public String toString() {
        //print the details of student when it is printed
        String str;
        str = "Name:\t\t" + name + "\n";
        str += "" + getAverage();
        return str;
    }




//validate data
public String validateData() {
    	String errormessage = null;
    	//check if name is entered
    	if (name.length()<2){ 
    		errormessage += "Name is required \n";
                } 	
	if (test[0]<0 || test[0]>100||test[1]<0||test[1]>100||test[2]<0||test[2]>100) {
    		errormessage += "\nAt least one mark is out of range, please re-enter all data";
                }
        if(errormessage !=null){
                errormessage+= ("\n Please re-enter all data. ");
                }
	return errormessage;
}
}
