package ru.skypro.homework.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SendAdDTO {
    private Integer author;
    private String image;
    private Integer pk;
    private Integer price;
    private String title;
}
