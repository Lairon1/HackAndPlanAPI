package ru.lairon1.hackandplanapi.model.designelement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lairon1.hackandplanapi.model.user.ProjectUser;

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
public class DesignElement {

    private int index;
    private long projectId;
    private long designElementId;
    private DesignElementType type;
    private String name;
    private String prefix;
    private DesignElement parent;
    private List<DesignElement> children;
    private int totalWorkItemCount;
    private int closedWorkItemCount;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    private ProjectUser user;

}
