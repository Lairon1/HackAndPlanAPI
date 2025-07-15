package ru.lairon1.hackandplanapi.model.project;

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
public class Project {

    private long id;
    private long workspaceId;
    private String name;
    private String description;
    private String generalInfo;
    private LocalDateTime closingDate;
    private LocalDateTime creationDate;
    private User owner;
    private String costMetric;
    private boolean isDemo;
    private int hoursPerDay;
    private ProjectModuleConfig moduleConfig;
    private long defaultBoardId;

}
