package views;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.ebean.Ebean;
import models.Student;
import play.db.ebean.EbeanConfig;
import play.db.ebean.EbeanDynamicEvolutions;

import javax.inject.Inject;
import java.io.IOException;

public class Repository {

    private final EbeanConfig ebeanConfig;
    private final EbeanDynamicEvolutions ebeanDynamicEvolutions;
    @Inject
    public Repository(EbeanConfig ebeanConfig, EbeanDynamicEvolutions ebeanDynamicEvolutions) {
        this.ebeanConfig = ebeanConfig;
        this.ebeanDynamicEvolutions = ebeanDynamicEvolutions;

    }

    public  void saveStudent(String message) throws IOException {
        Student s = new ObjectMapper().readValue(message, Student.class);
        s.save();

    }
}
