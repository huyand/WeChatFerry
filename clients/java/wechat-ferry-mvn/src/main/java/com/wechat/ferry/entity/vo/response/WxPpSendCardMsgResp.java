package com.wechat.ferry.entity.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 请求出参-个微发送卡片消息
 *
 * @author chandler
 * @date 2024/10/04 23:11
 */
@Data
@ApiModel(value = "wxPpSendCardMsgResp", description = "个微发送卡片消息请求出参")
public class WxPpSendCardMsgResp {

    /**
     * 类型编号
     */
    @ApiModelProperty(value = "类型编号")
    private Integer id;

    /**
     * 类型名称
     */
    @ApiModelProperty(value = "类型名称")
    private String name;

}
