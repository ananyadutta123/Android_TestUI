# Android_TestUI

Create an application in whatever style you choose that interacts with two simple classes (that you create) called Element and Item. Elements contain a list of Items. You can randomly create these associations or make them have real world significance as you see fit. The app will look different based on whether the phone is portrait or landscape mode or if the app’s smallest width is bigger than 943dp (noted below as tablet mode). 
•	In portrait mode, the app: 
o	Has a hamburger menu that, when clicked, displays a list of Elements. 
o	When an Element is chosen from the menu, the main activity displays a list of Items for that Element  along with a title indicating which Element  was chosen. 
o	When an Item is chosen, it is highlighted in the list and maintains that highlighting when backgrounding the app or changing orientation. 
o	When the hamburger menu is re-opened, the Element currently chosen will be highlighted. 
•	In landscape mode or tablet mode, the app: 
o	Shows two lists side-by-side with no hamburger menu. The leftmost list shows the list of Elements. The rightmost list shows the Items corresponding with the chosen Element (if any). 
•	Important point: When the app is rotated from portrait to landscape mode, the current chosen Item and Element (if any) must be maintained. That is, if Element 2 is chosen and Item 4 is highlighted in the list when in portrait mode and the app is turned to landscape mode, then Element 2 must be highlighted in the left list and Item 4 highlighted in the right list. 
