package ru.lairon1.hackandplanapi.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.user.role.Role;
import ru.lairon1.hackandplanapi.model.user.role.permission.Permissions;

import java.time.LocalDateTime;

/**
 * @author 0xLairon1
 * @project HackAndPlanAPI
 * @since 15.07.2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectUser {

    private long projectId;
    private User user;
    private boolean isAdmin;
    private boolean isGuest;
    private boolean isActive;
    private LocalDateTime creationDate;
    private Permissions permissions;
    private Role role;

}
