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
#自连接  同一张表按照某一情况相连。
SELECT e.employee_id, e.first_name, m.first_name AS manager
from sql_hr.employees e
join sql_hr.employees m ON e.reports_to = m.employee_id;

#****************************#
#多表相连
USE sql_store;
# 将order表和customers表相连同时根据order_statues表进行连接。
SELECT o.order_id,c.first_name,os.name AS status
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
    JOIN order_statuses os ON o.status = os.order_status_id
ORDER BY order_id;

#****************************#
# 练习
USE sql_invoicing;
SELECT p.date,p.invoice_id,p.amount,c.name,pm.name
FROM payments p
JOIN clients c ON c.client_id = p.client_id
JOIN payment_methods pm ON p.payment_method = pm.payment_method_id;

#******************#
#复合连接
SELECT *
FROM order_items oi
JOIN order_item_notes oin
		ON oi.order_id = oin.order_id
		AND oi.product_id = oin.product_id;
		
		
		#*******************#
		#隐式链接  但是不建议用
SELECT *
FROM orders o, customers c 
WHERE o.customer_id = c.customer_id;

##********##
#外连接

SELECT c.customer_id,c.first_name,o.order_id
FROM orders o
JOIN customers c 
ON o.customer_id = c.customer_id
ORDER BY c.customer_id;
#这种查询只显示有订单的顾客信息，如果顾客没有订单那么就没有他的信息，如果想看到所有顾客的信息就可以用外连接。
#之所有看不到没有订单的顾客消息主要是因为on语句，符合on语句的才返回。所以增加了关键字right join和left join
SELECT c.customer_id,c.first_name,o.order_id
FROM orders o
RIGHT JOIN customers c 
ON o.customer_id = c.customer_id
ORDER BY c.customer_id;
#RIGHT JOIN 指join后面的表格全部保存，LEFT JOIN是join前面的表选中的信息全部展示。

#练习 
USE sql_store;
SELECT p.product_id, p.name,oi.quantity
FROM products p 
LEFT JOIN order_items oi
ON p.product_id = oi.product_id
ORDER BY product_id;


#多表外链接 
SELECT c.customer_id,c.first_name,o.order_id,sh.shipper_id
FROM orders o
RIGHT JOIN customers c 
ON o.customer_id = c.customer_id
LEFT JOIN shippers sh 
ON sh.shipper_id = o.shipper_id
ORDER BY c.customer_id;
##一般都是全部使用left join这样其他人可以更快看懂。

#练习 
SELECT o.order_date,o.order_id,c.first_name,sh.`name` AS shipper ,os.`name`
FROM orders o
LEFT JOIN customers c 
ON o.customer_id = c.customer_id
LEFT JOIN shippers sh 
ON sh.shipper_id = o.shipper_id
LEFT JOIN order_statuses os
ON os.order_status_id = o.`status`
ORDER BY o.order_id;


#外自链接 
USE sql_hr;
SELECT e.employee_id,e.first_name,m.first_name AS manager
FROM employees e
LEFT JOIN employees m
ON e.reports_to = m.employee_id


#USING语句 
SELECT c.customer_id,c.first_name,o.order_id
FROM orders o
RIGHT JOIN customers c 
ON o.customer_id = c.customer_id;
#像这样不同列有同样的名字，customer_id.可以用using语句减少代码量,也更易读 注意必须是不同地列同样的名字
SELECT c.customer_id,c.first_name,o.order_id,sh.`name`
FROM orders o
LEFT JOIN customers c 
#ON o.customer_id = c.customer_id
USING (customer_id)
LEFT JOIN shippers sh 
USING(shipper_id);

SELECT * 
FROM order_items oi 
JOIN order_item_notes oin 
ON oi.order_id = oin.order_id AND oi.product_id = oin.product_id;

#练习 
USE sql_invoicing;
SELECT p.date,c.`name`, p.amount, pm.`name`
FROM payments p 
JOIN payment_methods pm
#USING (payment_id)列的名字不一样所以不能用using
ON p.payment_method = pm.payment_method_id
JOIN clients c
USING (client_id);

#自然连接很少用，因为会出现意想不到的结果，就是看一看，知道这是自然连接。


#交叉连接 关键字 CROSS JOIN 一般用于有三个尺码 s m l，有几个颜色黑白蓝粉 想将所有的型号和所有的颜色组合。 Cross JOIN是显式表达 ，可以通过在from后多加几个表格来隐式表达。
#练习 
USE sql_store;
SELECT sh.`name`, p.`name`
FROM shippers sh 
CROSS JOIN products p 
ORDER BY shipper_id;


SELECT sh.`name`, p.`name`
FROM shippers sh ,products p 
#CROSS JOIN products p 
ORDER BY shipper_id;


#联合 能力很强
#目前都是在多表中结合列，实际上sql可以多行结合 
SELECT 
order_id,
order_date,
'Active' AS status 
FROM orders
WHERE order_date >= '2019-01-01'#this is not a good method to get orders in this year because sql was hard code 2019, the next year it didn't work 
UNION
SELECT 
order_id,
order_date,
'Archived' AS status 
FROM orders
WHERE order_date < '2019-01-01'
#UNION核心作用是合并查询结果。值得注意的是必须要将列数要一致。第一个查询列名是什么整个表的列名就是什么。

#exercise 
SELECT 
customer_id, 
first_name, 
points ,
'Bronze'  AS type
FROM customers
WHERE points<2000
UNION
SELECT customer_id, first_name, points ,'Silver' AS type 
FROM customers
WHERE points>=2000 AND points < 3000
UNION
SELECT customer_id, first_name, points ,'Gold' AS type 
FROM customers
WHERE points>=3000
ORDER BY first_name #会对union之后的表进行排序