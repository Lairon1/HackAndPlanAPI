package ru.lairon1.hackandplanapi.model.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 0xLairon1
 * @project HackAndPlanAPI
 * @since 15.07.2025
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectModuleConfig {

    private boolean workItems;
    private boolean workItemCategories;
    private boolean workItemDates;
    private boolean workItemCosts;
    private boolean workItemSubTasks;
    private boolean workItemDependencies;
    private boolean workItemAttachments;
    private boolean workItemComments;
    private boolean workItemTags;
    private boolean gameDesignModel;
    private boolean gameDesignModelTypes;
    private boolean gameDesignModelDates;
    private boolean gameDesignModelAttachments;
    private boolean gameDesignModelComments;
    private boolean calendar;
    private boolean burndownChart;
    private boolean ganttChart;
    private boolean metrics;
    private boolean activity;
    private boolean notifications;
    private boolean forceWorkItemDesignElement;
    private boolean forceWorkItemBoard;
    private boolean forceWorkItemEstimatedCost;
    private boolean forceWorkItemDueDate;
    private boolean forceWorkItemDescription;
    private boolean forceWorkItemUser;
    private boolean forceWorkItemTag;

}
