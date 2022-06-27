package edu.miu.lab6partb.adapter;

import edu.miu.lab6partb.DTO.GradeDTO;
import edu.miu.lab6partb.domain.Grade;

import java.util.List;
import java.util.stream.Collectors;

public class GradeAdapter {
    public static Grade getGrade(GradeDTO gradeDTO){
        return new Grade(gradeDTO.getGrade());
    }
    public static GradeDTO getGradeDTO(Grade grade){
        return new GradeDTO(grade.getGrade());
    }
    public List<GradeDTO> GradeDTOList(List<Grade> grades){
        return grades.stream().map(GradeAdapter::getGradeDTO).collect(Collectors.toList());
    }
}
