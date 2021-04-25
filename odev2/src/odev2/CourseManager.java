package odev2;

public class CourseManager {

       public void courseInformation(Course course ) {
    	   
    	   System.out.println("Kurs içeriði : " + course.content );
    	   System.out.println("Kursun idsi : " + course.id ); 
    	   System.out.println("Kurs eðitmeni : " + course.instructorName );
    	   System.out.println("Kurs tamamlanma : " + course.completion );
    	   
       }
       
       
       public void instructorInformation(Instructor instructor) {
    	   
    	   System.out.println("Eðitmen Adý:  : " + instructor.name ); 
    	   System.out.println("Eðitmen Soyadý: : " + instructor.surName );
    	   System.out.println("Eðitmen Ýdsi : " + instructor.id );
       }


}
