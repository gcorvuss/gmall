package com.coraxcorvus.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @auth gcorvus
 * @date 2024-07-19 10:52:31
 * @desc 秒杀商品通知订阅
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 活动场次id
	 */
	private Long sessionId;
	/**
	 * 订阅时间
	 */
	private Date subcribeTime;
	/**
	 * 发送时间
	 */
	private Date sendTime;
	/**
	 * 通知方式[0-短信，1-邮件]
	 */
	private Integer noticeType;

}
