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
public class ProjectEvent {

    private long projectId;
    private String name;
    private String url;
    private ProjectCategory category;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String backgroundColor;
    private String textColor;
    private boolean isAllDayEvent;

}
