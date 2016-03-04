package eu.kielczewski.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class IndexController {

    @SuppressWarnings("SameReturnValue")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return "Hello world";
    }
    
    /**
     * Add another mapping handler method
     * @param id
     * @return
     * @author lmthien
     */
    @RequestMapping(value = "/goodbye/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String sayGoodbye(@PathVariable String id) {
        return "Goodbye " + id;
    }

}
