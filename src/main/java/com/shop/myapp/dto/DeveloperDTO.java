package com.shop.myapp.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@TableName("developer")
public class DeveloperDTO implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    private String name;
    private String field;
}
