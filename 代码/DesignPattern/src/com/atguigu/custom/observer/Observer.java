package com.atguigu.custom.observer;

import java.time.LocalDateTime;

/**
 * @description
 * @author: clt
 * @create: 2021-03-27 09:02
 **/
public interface Observer {

    /**
     *  �˴���Ӧ�����������ݣ� �ᵼ�����ô��ݣ���۲���һ������ĳ����������ú�
     *  ����������֪ͨ�б��У���Ҫ�������ݸ��£������е���������Ҳ������
     *
     * @param data
     */
    @Deprecated
    void receiveNotification(Subject data);

    void receiveNotification(LocalDateTime dateTime, Integer count);
}
