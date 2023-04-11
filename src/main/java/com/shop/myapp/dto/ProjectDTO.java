package com.shop.myapp.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
@TableName("project")
public class ProjectDTO {
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    private String name;
    private String field;

    public ProjectDTO(long id, String name, String field) {
        this.id = id;
        this.name = name;
        this.field = field;
    }

    public ProjectDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
