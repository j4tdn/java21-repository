+ Class
Customer: name, phone, id, address
Item	: id, os, color, cost

B1: create list of customers
B2: create an array of items in store
B3: Shopping function
+ who is buying
+ list of items
+ amount of each item
+ time
Order: customer, item_details[], quantity, date_time
ItemDetail: item, quantity
==========================
c1: KH1, Adam, 123, NewYork
c2: KH2, Kate, 243, California

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4, IOS, White, 280
i4: IP12, IOS, Black, 880
i5: WP8, WindowPhone, Black, 560

order1: c1, {id1(i1, 3), id2(i4, 1), id3(2, 1)}, date_time
order2: c2, {id1(i3, 2), id2(i5, 1)}, date_time
order3: c2, {id1(i4, 2)}, date_time

Function: export(order) => TotalOfAmount:Void



