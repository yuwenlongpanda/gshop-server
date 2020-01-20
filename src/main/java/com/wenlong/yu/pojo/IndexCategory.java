package com.wenlong.yu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class IndexCategory {

  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  private String isInServing;

  private String description;

  private String title;

  private String link;

  private String imageUrl;

  private String iconUrl;

  private String titleColor;

}
