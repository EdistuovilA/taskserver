package ru.skypro.homework.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class ExtenedAdDTO extends SendAdDTO {
    private String authorFirstName;
    private String authorLastName;
    private String description;
    private String email;
    private String phone;
}
