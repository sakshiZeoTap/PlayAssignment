package Consumers;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DeliverCallback;
import views.Repository;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import com.rabbitmq.client.ConnectionFactory;

import javax.inject.Inject;

public class consumer  {

    private Repository repository;

    @Inject
    public consumer(Repository repository){
        this.repository=repository;



    }
    public void consumeMessage() throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();

        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setVirtualHost("/");
        factory.setHost("localhost");
        factory.setPort(5672);

        Connection conn = factory.newConnection();
        Channel channel = conn.createChannel();

        channel.exchangeDeclare("student_direct", "direct");
        channel.queueDeclare("student_insert_queue", true, false, false, null);

        channel.queueBind("student_insert_queue", "student_direct", "student.insert");
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            System.out.println("Data Recived");
            String message = new String(delivery.getBody(), "UTF-8");

            System.out.println(" [x] Received '" + message + "'");
            repository.saveStudent(message);


        };
        channel.basicConsume("student_insert_queue", true, deliverCallback, consumerTag -> { });
    }

}


