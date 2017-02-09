/**
 * Created by ethan on 2017-02-07.
 */
public class Instructor extends Person {
    String title;
    Course favCourse;

    public Course getFavCourse() {
        return favCourse;
    }

    public Instructor(String name, String emailAddress, String title){
        super(name,emailAddress);
        this.title=title;
    }

    public String toString(){
        return String.format("Name: %s\nTitle: %s\nEmail: %s", this.name, this.title, this.emailAddress);
    }
}
