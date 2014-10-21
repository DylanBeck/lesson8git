public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int mark1, mark2, mark3; 


 //constructor methods - 3 ways you can make a student

      public Student(){
		this("", 0, 0, 0);
	}

	//Additonal Constructor
	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		mark1 = t1;
		mark2 = t2;
		mark3 = t3;
	}

	//Another constructor
	public Student(Student s) {
		this(s.name, s.mark1, s.mark2, s.mark3);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
    	if (whichmark == 1) {
    		mark1 = number;
    	} else if (whichmark == 2) {
    		mark2 = number;
    	} else{

    		mark3 = number;
    	}
    }

    public int getAverage() {
    	int average = (mark1 + mark2 + mark3) / 3;
    	return average;
    }


    public int getMark(int whichmark) {
	if (whichmark == 1) return mark1;
	else if (whichmark ==2) return mark2;
	else return mark3;
    }

    public int getHighscore() {
    	if (mark1 > mark2 && mark1 > mark3) {
    		return mark1;
    	}
    	else if (mark2 > mark1 && mark2 > mark3){
    		return mark2;

    	} else {
    		return mark3;
    	}
    }

    public String toString() {
    	String result = "Name: " + name;
    	result += "\nMark 1:\t" + mark1;
    	result += "\nMark 2:\t" + mark2;
    	result += "\nMark 3:\t" + mark3;
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (mark1 < 0 || mark1 > 100 || mark2 < 0 || mark2 > 100 || mark3 < 0 || mark3 > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
	
	return message;
    	}
 }

