package models;
import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;


@Entity
@Table(name = "students")

public class Student extends Model {

    @Id
    @GeneratedValue
    public Integer id;

    public String name;

    public String branch;

    public Integer  marks;

    public Integer age;

    public  static Finder<Integer,Student> find = new Finder<>(Student.class);


}
