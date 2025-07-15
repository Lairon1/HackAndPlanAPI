package ru.lairon1.hackandplanapi.model.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.user.User;

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
public class WorkspaceTeamUser {

    private int workspaceId;
    private User user;
    private int teamId;
    private boolean isAdmin;
    private boolean isGuest;
    private boolean isActive;
    private LocalDateTime creationDate;

}
