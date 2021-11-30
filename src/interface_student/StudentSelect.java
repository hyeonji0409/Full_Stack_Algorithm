package interface_student;

import arraylist_student.StudentDAO;

import java.util.ArrayList;

public class StudentSelect {
    public void studentSelect(){
        StudentDAO stdDAO = new StudentDAO();


        ArrayList<StudentDTO> dataSet = new ArrayList<StudentDTO>();
        // dataSet = stdDAO.selectStudent();

        System.out.println("제목 출력 알아서,,,");

        for(StudentDTO dto : dataSet) {
            System.out.println(dto);
        }
    }
}
