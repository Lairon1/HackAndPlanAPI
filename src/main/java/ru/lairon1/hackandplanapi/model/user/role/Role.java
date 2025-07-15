package ru.lairon1.hackandplanapi.model.user.role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
public class Role {

    private long projectId;
    private long roleId;
    private String name;
    private boolean isAdmin;
    private LocalDateTime creationDate;
    private Permissions permissions;

}
