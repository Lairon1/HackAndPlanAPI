package ru.lairon1.hackandplanapi.model.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 0xLairon1
 * @project HackAndPlanAPI
 * @since 15.07.2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkspaceTeam {

    private int workspaceId;
    private int teamId;
    private String name;
    private List<WorkspaceTeamUser> users;
    private WorkspaceTeamUser creator;
    private LocalDateTime creationDate;

}
