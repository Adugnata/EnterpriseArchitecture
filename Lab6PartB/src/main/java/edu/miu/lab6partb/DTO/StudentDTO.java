package edu.miu.lab6partb.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private long studentNumber;
    private String name;
}
