package ru.lairon1.hackandplanapi.model.workitem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.Board;
import ru.lairon1.hackandplanapi.model.designelement.DesignElement;
import ru.lairon1.hackandplanapi.model.project.ProjectCategory;
import ru.lairon1.hackandplanapi.model.project.ProjectImportanceLevel;
import ru.lairon1.hackandplanapi.model.project.ProjectStage;
import ru.lairon1.hackandplanapi.model.project.ProjectTag;
import ru.lairon1.hackandplanapi.model.user.ProjectUser;
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
public class WorkItem {

    private int projectId;
    private int workItemId;
    private int parentStoryId;
    private boolean isStory;
    private String title;
    private String description;
    private ProjectCategory category;
    private ProjectStage stage;
    private double estimatedCost;
    private double loggedCost;
    private double storyTasksEstimatedCost;
    private double storyTasksLoggedCost;
    private int boardIndex;
    private int designElementIndex;
    private DesignElement designElement;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private LocalDateTime updateDate;
    private LocalDateTime closingDate;
    private LocalDateTime creationDate;
    private User user;
    private Board board;
    private List<ProjectUser> assignedUsers;
    private List<ProjectTag> tags;
    private ProjectImportanceLevel importanceLevel;
    private WorkItemAttachment picture;
    private boolean hasDependencies;
    private boolean isBlocked;

}
