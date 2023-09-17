Class: 
	+Customer: name, phone, id, address
	+Item: id, os, color, cost
	
B1: Create customers
B2: Create array of items in store
B3: Shopping function

+ Who is buying
+ List of items
+ Amount of each item
+ Time
=> Order: customer, item_details[], quantity, date_time
=> ItemDetail: item, quantity


================================
+Object
c1: KH1, Adam, 123, New York
c2: KH2, Kate, 823, Cali

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4, IOS, White, 280
i4: IP12, IOS, Black, 880
i5: WP8, Window, Blue, 560


Order1: c1, {id1(i1, 3), id2(i4, 1), id3(i2, 1)}, date_time
Order2: c2, {id1(i3, 2), id2(i5, 1)}, date_time
Order3: c2, {id1(i4, 1)}, date_time


Function
Function: export(order) => TotalOfAmount:Void



