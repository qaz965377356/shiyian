package com.shiyian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    private Integer id;
    private String name;
    private String othername;
    private double heat;
    private String suitable;
    private String fooddetail;
}
