# 数据库设计

### 基础用户（User）

|   名称    |     描述     | 类型 |
| :-------: | :----------: | :--: |
|    uid    |    身份码    |      |
|   uname   |   用户名称   |      |
|  upasswd  |     密码     |      |
|  uphone   |   联系方式   |      |
| uidentity |  身份识别键  |      |
|  uclubId  |  关联舞团id  |      |
| uStudioId | 关联工作室id |      |
|   ucity   |   用户城市   |      |
|  uschool  |   用户学校   |      |
| upicture  |   用户头像   |      |



### 舞团组织（Club）

|    名称    |    描述    | 类型 |
| :--------: | :--------: | :--: |
|    uid     |   身份码   |      |
|    cid     | 关联舞团id |      |
|   cphone   |  联系方式  |      |
|   ccity    |  所在城市  |      |
|  cschool   |  所在学校  |      |
|  cpicture  |    头像    |      |
| cintroduce |    介绍    |      |
|   cuids    |    成员    |      |
|            |            |      |

### 舞蹈工作室（Studio）

|    名称    |   描述   | 类型 |
| :--------: | :------: | :--: |
|    uid     |  身份码  |      |
|    sid     | 舞蹈室id |      |
|   sphone   | 联系方式 |      |
|   scity    | 所在城市 |      |
|  spicture  |   头像   |      |
| sintroduce |   介绍   |      |
|   suids    |   成员   |      |
|            |          |      |
|            |          |      |

### 动态（activity）

|   名称   |   描述   | 类型 |
| :------: | :------: | :--: |
|   aid    |  动态id  |      |
|   uid    |  发帖人  |      |
| acontext | 发帖内容 |      |
| apicture | 发帖图片 |      |
|  alike   |   点赞   |      |
| acomment |   评论   |      |
|  atime   |  时间戳  |      |
|  acity   |   城市   |      |



### 视频（video）

|   名称   |   描述   | 类型 |
| :------: | :------: | :--: |
|   vid    |  动态id  |      |
|   uid    |  发帖人  |      |
|  vname   |   名称   |      |
|   vurl   | 视频链接 |      |
|  vlike   |   点赞   |      |
| vcomment |   评论   |      |
|  vcover  |   封面   |      |
|  vtime   |  时间戳  |      |
|   vhot   |  热力值  |      |
|  vcity   |   城市   |      |

### 聊天(talk)

|   名称   | 描述 | 类型 |
| :------: | :--: | :--: |
|   tid    |      |      |
|   uid1   |      |      |
|   uid2   |      |      |
| tcontext |      |      |



### 关注

|   名称   |   描述   | 类型 |
| :------: | :------: | :--: |
| follower |  关注者  |      |
| followed | 被关注者 |      |



### 订单（order）

|   名称    |   描述   | 类型 |
| :-------: | :------: | :--: |
| oconsumer |  消费者  |      |
| omerchant |   商家   |      |
|   ocost   | 支付费用 |      |
|   otime   | 支付时间 |      |



### 页面（page）



### 事务(affair)

