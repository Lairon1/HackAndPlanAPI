package ru.lairon1.hackandplanapi.model.workspace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.project.Project;
import ru.lairon1.hackandplanapi.model.user.User;

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
public class Workspace {

    private int id;
    private String name;
    private User owner;
    private String generalInfo;
    private int totalSeats;
    private int usedSeats;
    private LocalDateTime creationDate;
    private List<Project> projects; // May be empty or missing if includeProjects = false

}
