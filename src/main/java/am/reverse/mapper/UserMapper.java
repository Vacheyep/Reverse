package am.reverse.mapper;

import am.reverse.dto.User.UserDto;
import am.reverse.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    @Autowired
    AddressMapper addressMapper;
    public User toUser(UserDto userDto){
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setReverseCoin(userDto.getReverseCoin());
        user.setName(userDto.getName());
        user.setAddress(addressMapper.toAddress(userDto.getAddressDto()));
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }
    public UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setReverseCoin(user.getReverseCoin());
        userDto.setName(user.getName());
        userDto.setAddressDto(userDto.getAddressDto());
        userDto.setPhoneNumber(user.getPhoneNumber());
        return userDto;
    }

    public List<UserDto> mapAllToUserDto(List<User> users) {
        return users.stream()
                .map(this::toUserDto)
                .collect(Collectors.toList());
    }

}
