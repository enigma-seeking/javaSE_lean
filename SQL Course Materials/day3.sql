#列属性
#COLUMN atttibutes in markdown 

#inserting a single row 
INSERT INTO customers
VALUES (DEFAULT, 'John', 'Smith', NULL, NULL, 'address', 'city', 'CA', DEFAULT)
#because the customers table is AI, so we values(DEFAULT) is better. Sql deal this itself.
#we can see it ,we only Assign values ​​to names and regions so we can change expression 
INSERT INTO customers (
first_name, 
last_name, 
address,
 city, 
state)
VALUES( 'John', 'Smith','address', 'city', 'CA')
#this expression didn't need default or null 



#inserting multiple rows 
INSERT INTO shippers (name)
VALUES ('shipper1'),
								('shipper2'),
							('shipper3');
							
#exercise 
INSERT into products (`name`, quantity_in_stock, unit_price)
VALUES('product1', 89,2),
('product2', 900,3.1),
('product3', 30,2.8)