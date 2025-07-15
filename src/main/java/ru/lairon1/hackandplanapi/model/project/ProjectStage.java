package ru.lairon1.hackandplanapi.model.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ProjectStage {

    private long projectId;
    private long stageId;
    private String name;
    private String icon;
    private String color;
    private String status;
    private boolean isUnblocker;
    private LocalDateTime creationDate;

}
