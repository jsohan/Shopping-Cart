
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
##Demo: 
https://youtu.be/hq3xJUArB_g

##Installation 
1. create project and add a Source Package called "shoppingcart"

2. Go into the project directory you just created and under scr replace the folder called "shoppingcart" with the one provided by me under the src folder.

3. Insure that the List.dat file provided by me is outside of the      src folder in the project you created. This is the applications data file.


4. Open prject in editor and run "SystemAPI.java"


5. You will be prompted to login or create a user. Some of the already created accounts are: 
Seller(Username: jake, Password: okay), 
Customer(Username: josh, Password:okay),
Customer(Username: lauren, Password:okay),
the password field is case sensitive and these only work if the List.dat file is in the right place

6. Otherwise feel free to create users and try it out for yourself

##System Functionality 
When the application is first started, the user sees a simple boxed application
where they are prompted to login or create a customer/seller account. From there the
user will be signed in as either a customer or seller.
After signing in if you are a customer the System will take you to the product list
where you can add items to your cart. You can choose how much of that item
you want and then click the “add to cart button” next to the item. You can go to your
shopping cart by clicking the “Shopping cart” button. From there you can change how
much of the item you want and update it with the “Update” Button. Once you are
satisfied you can go to the checkout page that displays your total and prompts you for
your information. Once you confirm you shopping cart is cleared and all items are
“bought”.
If you are a seller then the system takes you to your product inventory where you
can change each item by clicking the “edit” button next to it and save it once you are
done with the “save” button which replaces the edit button once pressed. You can add a
discounted product by selecting the check mark next to an item and entering a new
price in the text box near the “Add discounted product” button. You can also select
multiple items to either delete or put into a bundle. The Bundle button replaces the “Add
discounted product” once more than one item is selected. For a bundle you can choose to enter a
custom price, or it will automatically add up all product prices. The discounted and
bundled items cannot be edited, only removed.
All data is saved once the user closes the application.
