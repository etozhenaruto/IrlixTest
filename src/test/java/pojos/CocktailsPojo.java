package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;



@JsonIgnoreProperties(ignoreUnknown = true) // разрешаются исключения в json
@Data // аннотация фреймворка lombok, можно не писать геттеры и сетторы, автоматически генерирует их перед выполнением теста
public class CocktailsPojo {

	private int alcohol;
	private String name;
	private String comment;
	private int id;

}