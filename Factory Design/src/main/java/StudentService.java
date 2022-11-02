public class StudentService {
    public Student getStudent(String studentGender){
        if(studentGender==null){
            return null;
        }

        else if(studentGender.equalsIgnoreCase("Male")){

            return new Male();
        }

        else if(studentGender.equalsIgnoreCase("Female")){

            return new Female();
        }

        return null;
    }
}
