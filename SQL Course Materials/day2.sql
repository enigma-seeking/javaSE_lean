#第三章这是之前没学过的---内链接

#同一个数据库下不同的表的连接
#order和customer是分开的，在order中通过customer来识别顾客，是因为顾客的地址和电话是会改的，
# 同时一个顾客会有还几个订单，最终会导致来回改动非常麻烦
SELECT *
FROM orders
JOIN customers ON orders.customer_id = customers.customer_id;
#join 默认为内连接即inner join。on是指通过什么来连接。
#这里的结果就是钱面试orders后面是customer

SELECT orders.customer_id,last_name,order_id
FROM orders
JOIN customers ON orders.customer_id = customers.customer_id;
#这种会报错，主要是sql不知道customer_id是要那张表的，所以要加一个限定orders.customer_id

#练习
SELECT order_id,o.product_id,quantity,o.unit_price
FROM order_items o
JOIN products p ON p.product_id = o.product_id
ORDER BY order_id;
#因为join会用很多次表明，所以一般会用别名会减小代码量，别名一般就是首字母。

##*************************************##

#不同数据库的连接
#只是增加了前缀来确定数据库
SELECT *
FROM order_items oi
JOIN sql_inventory.products p ON p.product_id = oi.product_id;

##*************************************##
#自连接
SELECT *
from sql_hr.employees e
join sql_hr.employees m ON e.reports_to = m.employee_id;