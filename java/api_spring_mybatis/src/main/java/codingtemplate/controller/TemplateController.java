package codingtemplate.controller;

import codingtemplate.model.TemplateModel;
import codingtemplate.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/template")
public class TemplateController {

    @Autowired
    private TemplateService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TemplateModel> getTemplate() throws Exception {
        return service.getTemplate();
    }

}
