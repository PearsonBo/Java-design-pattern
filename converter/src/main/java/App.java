import com.google.common.collect.Lists;
import domain.Converter;
import domain.User;
import domain.UserConverter;
import domain.UserDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class App {
    public static void main(String[] args) {

        Converter<UserDto, User> userConverter = new UserConverter();

        UserDto name1 = new UserDto(1, "name1");
        User user = userConverter.convertFromDto(name1);
        System.out.println(user);

        UserDto userDto = userConverter.convertFromEntity(user);
        System.out.println(userDto);

        System.out.println("-----------------");
        ArrayList<User> users = Lists.newArrayList(new User(1, "n1"), new User(2, "n2"));
        users.forEach(System.out::println);

        List<UserDto> fromEntities = userConverter.createFromEntities(users);
        fromEntities.forEach(System.out::println);
    }
}
