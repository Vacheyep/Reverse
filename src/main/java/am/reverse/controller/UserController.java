package am.reverse.controller;

import am.reverse.dto.User.UserDto;
import am.reverse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/api/users")
    public class UserController {

        UserService userService;

        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }

        @PostMapping
        public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
            Assert.notNull(userDto, "Given user is null!");
            UserDto user = userService.createUser(userDto);
            return new ResponseEntity<>(
                    "User was created", HttpStatus.OK
            );
        }
    @GetMapping("/email")
    public ResponseEntity<?> getUserByEmail(@RequestParam String email) {
        UserDto user = userService.getUser(email);

        return new ResponseEntity<>(
                user, HttpStatus.OK
        );
    }
    @DeleteMapping
            ("/{email}")
    public ResponseEntity<?> deleteUser(@PathVariable("email") String email) {
        userService.deleteUser(email);
        return new ResponseEntity<>(
                "User was deleted ", HttpStatus.OK
        );
    }
}
