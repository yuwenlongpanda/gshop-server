package com.wenlong.yu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Shops {

  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  private String name;

  private String address;

  private float latitude;

  private float longitude;

  private String phone;

  private String category;

  private int status;

  private long recentOrderNum;

  private long ratingCount;

  private double rating;

  private String promotionInfo;

  private String imagePath;

  private int floatMinimumOrderAmount;

  private int floatDeliveryFee;

  private String distance;

  private String orderLeadTime;

  private String description;

}
