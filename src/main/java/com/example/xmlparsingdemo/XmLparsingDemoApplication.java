package com.example.xmlparsingdemo;

import com.example.xmlparsingdemo.model.Student;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class XmLparsingDemoApplication {

    public static void main(String[] args) throws JAXBException {
        SpringApplication.run(XmLparsingDemoApplication.class, args);

//        try {
//            File file = new File("C:\\Users\\Ilija\\IdeaProjects\\XMLparsing-demo\\students.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
//            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//            Student student = (Student) unmarshaller.unmarshal(file);
//            System.out.printf(student.toString());
//        }catch (Exception e){
//           throw e;
//        }
        try {

            File file = new File("C:\\Users\\Ilija\\IdeaProjects\\XMLparsing-demo\\src\\main\\java\\com\\example\\xmlparsingdemo\\posao.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(stmtrslist.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            stmtrslist student = (stmtrslist) unmarshaller.unmarshal(file);
            System.out.printf(student.toString());

        }catch (Exception e){
            throw e;
        }
    }

}
