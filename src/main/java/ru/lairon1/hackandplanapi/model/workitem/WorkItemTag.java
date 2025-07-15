package ru.lairon1.hackandplanapi.model.workitem;

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
public class WorkItemTag {

    private int projectId;
    private int tagId;
    private int displayOrder;
    private String name;
    private String groupName;
    private String color;
    private String icon;
    private boolean displayIconOnly;
    private LocalDateTime creationDate;

}
