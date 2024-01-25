public class Student extends Person{
    private int numCourse;
    private String[] courses;
    private int[] grades;
    private int counter;

    public Student(String name, String address, int numCourse){
        super(name, address);
        this.numCourse = numCourse;
        this.courses = new String[numCourse];
        this.grades = new int[numCourse];
        this.counter = 0;
    }

    public void addCourseGrade(String course, int grade){
        if(counter < numCourse) {
            courses[counter] = course;
            grades[counter] = grade;
            counter++;
        }
        else {
            System.out.println("Overflowed array");
        }
    }

    public void printCourse(){
        System.out.println("Courses and grades of "+ this.getName() + ": ");
        for (int i = 0; i < counter; i++){
            System.out.println(courses[i] + "= " + grades[i]);
        }
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
