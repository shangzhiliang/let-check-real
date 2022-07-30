package com.szl.letck.distribute.entity;

/**
 * @ClassName TransactionalMessageContent
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:17
 * @Version v1.0
 */
public class TransactionalMessageContent {
    private Long id;
    private Long messageId;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
