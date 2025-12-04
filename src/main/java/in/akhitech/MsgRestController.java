package in.akhitech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/")
	public String retMsg() {
		return "Hello Wlcome in or first app !!!";
	}

}
