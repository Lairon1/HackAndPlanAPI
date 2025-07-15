package ru.lairon1.hackandplanapi.model.user.role.permission;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 0xLairon1
 * @project HackAndPlanAPI
 * @since 15.07.2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameDesignModelPermissions {

    private boolean canRead;
    private boolean canWrite;

}
