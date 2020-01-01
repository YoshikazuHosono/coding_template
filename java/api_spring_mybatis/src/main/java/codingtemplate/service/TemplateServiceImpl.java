package codingtemplate.service;

import codingtemplate.mapper.TemplateMapper;
import codingtemplate.model.TemplateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateMapper mapper;

    @Override
    public List<TemplateModel> getTemplate() {
        return mapper.selectTemplate();
    }
}
