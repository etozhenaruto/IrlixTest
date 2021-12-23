package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // разрешаются исключения в json
@Data // аннотация lombok, можно не писать геттеры и сетторы, автоматически генерирует их сама перед выполнением программы
public class DrinksPojo{

	private int alcohol;
	private String name;
	private String comment;
	private int id;

}