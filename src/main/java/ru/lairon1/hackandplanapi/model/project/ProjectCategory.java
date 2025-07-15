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
public class ProjectCategory {

    private long projectId;
    private long categoryId;
    private String name;
    private String icon;
    private String color;
    private LocalDateTime creationDate;

}
