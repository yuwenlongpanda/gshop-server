package com.wenlong.yu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  private String name;

  private String pwd;

  private String phone;

}
