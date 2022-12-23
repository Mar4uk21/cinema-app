package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role userRole = new Role();
        userRole.setName(Role.Type.USER);
        Role adminRole = new Role();
        adminRole.setName(Role.Type.ADMIN);
        roleService.add(userRole);
        roleService.add(adminRole);
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("1234");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
