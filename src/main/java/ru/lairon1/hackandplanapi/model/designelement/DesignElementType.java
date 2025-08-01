package ru.lairon1.hackandplanapi.model.designelement;

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
public class DesignElementType {

    private long projectId;
    private long designElementTypeId;
    private String name;
    private LocalDateTime creationDate;

}
