package in.ankit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ankit.properties.AppProperties;

@RestController
public class DemoRestController {
    @Autowired
	private AppProperties  props;
	
    @GetMapping("/welcome")
    public String welcomeMsg() {
    	Map<String, String> messages = props.getMessages();
    	String value = messages.get("MsgGreet");
    	return value;
    }
}
