# OrangeGo——API文档


## 关于用户
### 登录
|URL|Method|描述|
|---|---|---|
|/login|POST|登录|
#### 参数
```json

```

### 注册
|URL|Method|描述|
|---|---|---|
|/signUp|POST|注册|

#### 参数
```json

```

#### 返回值
```json

```

### 发送邮箱验证码

### 个人中心

### 个人站内信

## 根据条件搜索

|URL|Method|描述|
|---|---|---|
|/search|POST|搜索|

### 参数
```json

```


## 关于电影
### 显示电影
|URL|Method|描述|
|---|---|---|
|/movie/:id|GET|获取电影的信息|
#### 返回值
```json

```
### 给电影评分
|URL|Method|描述|
|---|---|---|
|/movie/:id/score|POST|给电影评分|

#### 参数
```json

```

#### 返回值
```json

```

### 加载电影短评list
|URL|Method|描述|
|---|---|---|
|/movie/:id/shortComment|GET|加载电影短评list|

### 加载电影长评list
|URL|Method|描述|
|---|---|---|
|/movie/:id/longComment|GET|加载电影长评list|

### 加载电影话题list
|URL|Method|描述|
|---|---|---|
|/movie/:id/topic|GET|加载电影话题list|

### 加载电影讨论区list
|URL|Method|描述|
|---|---|---|
|/movie/:id/discusses|GET|加载电影讨论list|

### 发布短评（需登录）
|URL|Method|描述|
|---|---|---|
|/movie/:id/shortComment|POST|发布电影短评|

### 发布长评（需登录）
|URL|Method|描述|
|---|---|---|
|/movie/:id/longComment|POST|发布电影长评|

### 添加讨论 （需登录）
|URL|Method|描述|
|---|---|---|
|/movie/:id/discusses|POST|发布电影讨论|

## 关于长评

### 查看长评
|URL|Method|描述|
|---|---|---|
|/longComment/:id|GET|查看电影长评|

### 回复长评（需登录）
|URL|Method|描述|
|---|---|---|
|/longComment/:id|GET|查看电影长评|

### 给长评点赞 （需登录）

### 给长评的回复点赞（需登录）（暂无）

## 关于短评
### 查看短评
|URL|Method|描述|
|---|---|---|
|/shortComment/:id|GET|查看电影短评|
### 给短评点赞 （需登录）

## 关于讨论
### 查看讨论
|URL|Method|描述|
|---|---|---|
|/discusses/:id|GET|查看电影讨论|

### 给讨论点赞 （需登录）

### 给讨论的回复点赞（需登录）

## 关于演员
### 查看演员的信息

## 关于奖项
### 查看奖项信息
