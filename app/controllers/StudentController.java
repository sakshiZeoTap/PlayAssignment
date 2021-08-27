package controllers;

import Consumers.consumer;
import akka.util.Timeout;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.tools.json.JSONUtil;
import models.Student;
import play.api.i18n.MessagesApi;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.create;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeoutException;


public class StudentController  extends Controller {

    @Inject
    FormFactory formFactory;

    @Inject
    MessagesApi messagesApi;

    @Inject
    consumer consumer;

    public Result save(Http.Request request) throws IOException, TimeoutException {
        Form<Student> studentForm = formFactory.form(Student.class).bindFromRequest(request);
        if(studentForm.hasErrors()){
            return badRequest("Errors");
        }

        Student student = studentForm.get();
        String studentjson = new ObjectMapper().writeValueAsString(student);

        publish(studentjson,"student_insert_queue","student_direct","student.insert");

        consumer.consumeMessage();
         return ok("Data is saved in database");

    }


    public Result show(){
        List<Student> studentList = Student.find.all();

        return ok(Json.toJson(studentList));


    }
    public Result showById(Integer id){
        Student student = Student.find.byId(id);

        return ok(Json.toJson(student));

    }

    public Result addStudent(Http.Request request){
        Form<Student> studentForm = formFactory.form(Student.class);
       return ok(create.render(studentForm,request,messagesApi.preferred(request)));

    }

    private void publish(String msg, String q, String exe, String routeKey) throws IOException,TimeoutException {
        ConnectionFactory connectionFactory =new ConnectionFactory();
        connectionFactory.setHost("localhost");
        try(Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel()){
            channel.exchangeDeclare(exe,"direct");
            channel.queueDeclare("q",true,false,false,null);
            System.out.println(msg+ " SENT ");
            channel.basicPublish(exe,routeKey,null,msg.getBytes("UTF-8"));
        }

    }

}
