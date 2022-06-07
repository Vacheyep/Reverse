package am.reverse.dto.User;

import am.reverse.dto.AddressDto;
import am.reverse.entities.Address;

public class UserDto {
    private Long reverseCoin;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private AddressDto addressDto;

    public UserDto(){}

    public UserDto(Long reverseCoin ,String email, String password,
            String name, String phoneNumber, AddressDto addressDto) {
        this.reverseCoin = reverseCoin;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.addressDto = addressDto;
    }

    public Long getReverseCoin() {
        return reverseCoin;
    }

    public void setReverseCoin(Long reverseCoin) {
        this.reverseCoin = reverseCoin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

}
