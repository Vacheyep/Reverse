package am.reverse.service;


import am.reverse.dto.User.UserDto;
import am.reverse.entities.Address;
import am.reverse.entities.User;
import am.reverse.exeption.ResourceAlreadyExistsException;
import am.reverse.exeption.ResourceNotFoundException;
import am.reverse.mapper.AddressMapper;
import am.reverse.mapper.UserMapper;
import am.reverse.repository.AddressRepository;
import am.reverse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


    @Service
    public class UserService {
        private final UserRepository userRepository;
        private final UserMapper userMapper;
        private final AddressMapper addressMapper;
        private final AddressRepository addressRepository;

        @Autowired
        public UserService(UserRepository userRepository, UserMapper userMapper, AddressMapper addressMapper, AddressRepository addressRepository) {
            this.userRepository = userRepository;
            this.userMapper = userMapper;
            this.addressMapper = addressMapper;
            this.addressRepository = addressRepository;
        }


        public UserDto createUser(UserDto userDto) {
            if (userRepository.existsByEmail(userDto.getEmail())) {
                throw new ResourceAlreadyExistsException(
                        "User with email " + userDto.getEmail() + " already exists");
            }
            Address address = addressRepository.save(addressMapper.toAddress(userDto.getAddressDto()));
            User userToSave = this.userMapper.toUser(userDto);
            userToSave.setAddress(address);
            User savedUser = this.userRepository.save(userToSave);
            return userMapper.toUserDto(savedUser);

        }

        public UserDto getUser (String email){
            if (userRepository.existsByEmail(email)) {
                User userToGet = userRepository.findByEmail(email);
                        UserDto userDto = userMapper.toUserDto(userToGet);
                return userDto;
            }else {
                throw new ResourceNotFoundException("user by this email didn't exists");
            }

        }

        public void deleteUser(String email) {

            Optional<User> card = Optional.ofNullable(this.userRepository.findByEmail(email));
            if (card.isEmpty()) {
                throw new ResourceNotFoundException("User not found");
            }
            userRepository.delete(card.get());
        }
    }
