package odev2;

public class CourseManager {

       public void courseInformation(Course course ) {
    	   
    	   System.out.println("Kurs i�eri�i : " + course.content );
    	   System.out.println("Kursun idsi : " + course.id ); 
    	   System.out.println("Kurs e�itmeni : " + course.instructorName );
    	   System.out.println("Kurs tamamlanma : " + course.completion );
    	   
       }
       
       
       public void instructorInformation(Instructor instructor) {
    	   
    	   System.out.println("E�itmen Ad�:  : " + instructor.name ); 
    	   System.out.println("E�itmen Soyad�: : " + instructor.surName );
    	   System.out.println("E�itmen �dsi : " + instructor.id );
       }


}
