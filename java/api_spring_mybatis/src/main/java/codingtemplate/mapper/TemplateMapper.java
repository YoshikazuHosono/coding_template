package codingtemplate.mapper;

import codingtemplate.model.TemplateModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TemplateMapper {

	public List<TemplateModel> selectTemplate();

}
