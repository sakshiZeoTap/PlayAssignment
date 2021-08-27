package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.concurrent.TimeoutException;

public class APIController extends Controller {

    public Result display(Http.Request request) throws IOException, TimeoutException {

        return ok("Data is saved in database");

    }

    public Result authorise(Http.Request request) {
        JsonNode json = request.body().asJson();
        if (json == null) {
            return badRequest("Expecting Json data");
        }
        String username = json.findPath("username").textValue();
        String password = json.findPath("password").textValue();
        if (username == null || password == null) {
            return badRequest("Missing parameter");
        }

        ObjectNode segment = Json.newObject();
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        String token = bytes.toString();

        segment.put("token", token);
        //segment.put("type", "bearer");
        return ok(segment);

    }
}
