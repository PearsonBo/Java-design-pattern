package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by hujianbo on 2018/2/8.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;
    private String name;
}
