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
public class ProjectStorage {

    private long projectId;
    private long totalSpace;
    private long totalUsedSpace;
    private long projectUsedSpace;
    private long fileLimit;

}
