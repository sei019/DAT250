# Report

##Installing software
I already had all the relevant software installed. I validated the software by checking that I had the correct versions in the terminal for all of the required software.

##Heroku tutorial
Overall the tutorial was very well written and I really had no problems following it. These are the minor things I encountered:
When defining config vars I made a small syntax error when adding to the Java code, causing "mvn clean install" to give an error.
I corrected this and it immediately worked when running the command again.
In the provision add-ons step: I needed to verify my account by adding a credit card in order to add the "Papertrail" add-on. I skipped this step and did not enter my credit card number.
Consequently, the "heroku addons:open papertrail" command told me that it could not find the add on, since I did not install it.
