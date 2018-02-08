package domain;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class UserConverter extends Converter<UserDto, User> {

    public UserConverter() {
        super(userDto -> new User(userDto.getId(), userDto.getName()),
                user -> new UserDto(user.getId(), user.getName()));

    }
}
