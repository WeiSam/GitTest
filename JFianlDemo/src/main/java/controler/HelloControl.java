package controler;

import com.jfinal.core.Controller;

public class HelloControl extends Controller {
	
	public void index() {

		renderFreeMarker("jsp/helloworld.html");
	}

	
}
