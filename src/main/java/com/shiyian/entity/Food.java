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
    private String othername;   //别名
    private double heat;    //热量
    private String suitable; //适宜人群
    private String fooddetail; //食物详情
}
