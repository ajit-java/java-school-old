package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ajit on 17.10.15.
 */

@Controller
public class EmpController {

    @RequestMapping(value = "/emp")
    public ResponseEntity<?> getName()
    {
        return ResponseEntity.ok(new Emp(){{name="ajit";salary="234";}});// "ajit";
    }
}
