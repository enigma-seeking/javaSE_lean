use sql_store;
select * #实际中很少用*，因为对数据库服务器和网络带来很大的负担
from customers
# where customer_id = 1
order by first_name;

select first_name AS 'test1', last_name AS 'test2'#实际中很少用*，因为对数据库服务器和网络带来很大的负担
from customers
# where customer_id = 1
order by first_name;

# 练习1
# return all the products
#     name
#     unite price
#     new price(unite price*1.1)
use sql_inventory;
select name, unit_price, unit_price*1.1 as 'new price' from products;

USE sql_store;
SELECT *
FROM customers
where state != 'VA';

SELECT *
FROM customers
where birth_date > '1990-01-01';
#这是sql默认的时间格式，用引号表述日期值，即使不是字符串

#练习2
# get the orders placed this year
select order_date
from orders
where order_date >= '2019-01-01';

# 练习3
# from the order_items table, get the items for order #6
# where the total price is greater than 30

SELECT * from order_items
where order_id = 6 and unit_price * quantity >30;

##*********************************************##

# IN和NOT IN的使用.是解决多个or多余啰嗦的问题。
SELECT * FROM customers WHERE state IN ('VA','FL','GA');

#练习
select * FROM products WHERE quantity_in_stock IN (49,38,72);

##*********************************************##

#between and
SELECT *
FROM customers
WHERE points BETWEEN 1000 AND 3000;
#练习
SELECT *
FROM customers
WHERE birth_date BETWEEN '1990-01-01' AND '2000-01-01';

##*********************************************##

# Like  想得到名字首字母是B的顾客
SELECT *
FROM customers
WHERE first_name LIKE 'B%';
# %表示任意长度的字符  '%B%'带有B的。'%y'以y结尾的
#_表示一个字符。 '_y'有两个字符，第二个字符是y

#练习
select *
FROM customers WHERE (address LIKE '%trail%' OR address LIKE '%avenue%')
                 AND phone NOT LIKE '%9';

##*********************************************##

#REGEXP 是正则表达的缩写，在字符串功能上非常强大
select *
FROM customers
# WHERE address LIKE '%trail%'
WHERE address REGEXP 'trail';
#和上面的式子表达一个意思
#在正则表达中 ^表示字符串开头，用$表示字符串结尾
# '^trail''$trail'分别表示以trail开发和以trail为结尾
SELECT *
FROM customers
WHERE last_name REGEXP 'mac|^field|rose';
# |表示多搜寻模式 'mac|^field|rose'表示带有mac 或 以field为字符串开头 或rose 的

SELECT *
FROM customers
WHERE last_name REGEXP '[gim]e';
# [gim]e表示字符串中包含ge或ie或me；e[mf]对应的意思；
# 想要的匹配字母比较多且连续可以用[a-h]e
SELECT *
FROM customers
WHERE last_name REGEXP '[a-h]e';
#小节
# ^--begining
# $--end
# |--logical or
# [] --匹配
# [-] --范围匹配

#练习
SELECT *
FROM customers
WHERE first_name REGEXP 'elka|ambur';

SELECT *
FROM customers
WHERE last_name REGEXP 'ey$|on$';

SELECT *
FROM customers
WHERE last_name REGEXP '^my|se';

SELECT *
FROM customers
WHERE last_name REGEXP 'b[ru]';
#last_name contains B followed by R or U 这是☞b后面跟着R或U

##*********************************************##

#null if not null

SELECT *
FROM orders
WHERE shipped_date IS NULL ;

##*********************************************##

#order by (Desc) 默认是升序排列，列名之后加上desc关键字改为降序排列。
SELECT *
FROM customers
ORDER BY first_name;

SELECT *
FROM customers
ORDER BY first_name DESC ;

SELECT *
FROM customers
ORDER BY state DESC ,first_name;
#可以同时排序多列

#此外也可以通过列位置进行排序，但不推荐这么做,主要原因是拓展性不够，因为select东西归根据需要变化的
SELECT *
FROM customers
ORDER BY 1, 2;

#练习  where语句在order前面
SELECT order_id,product_id,quantity,unit_price
FROM order_items
WHERE order_id=2
ORDER BY quantity*unit_price DESC ;

##*********************************************##

#limit子句（offset） （符合条件的有很多，我只想得到前几个就用limit）

SELECT *
FROM customers
LIMIT 3;
#limit数量小于查询数量时，显示limit数量，当大于时显示全部

SELECT *
FROM customers
LIMIT 6,3;
#limit offset num;这是为了分页显示做准备，运行后跳过前六条，直接显示789条

#练习
SELECT *
FROM customers
ORDER BY points
LIMIT 3;