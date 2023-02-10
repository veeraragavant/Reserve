$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Regression.feature");
formatter.feature({
  "line": 3,
  "name": "For Automating Adactin Website",
  "description": "",
  "id": "for-automating-adactin-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "To Launch the Adactin Website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User Launching the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Entering Adacting Website URL \"http://adactinhotelapp.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launching_the_Chrome_Browser()"
});
formatter.result({
  "duration": 13955552500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://adactinhotelapp.com/",
      "offset": 36
    }
  ],
  "location": "Steps.user_Entering_Adacting_Website_URL(String)"
});
formatter.result({
  "duration": 3069900100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Logging in Adactin",
  "description": "",
  "id": "for-automating-adactin-website;user-logging-in-adactin",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC-101"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Entering the Username \"Veeraragavmsd7\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User Entering the Password \"veera@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Clicking the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Selecting Location of the Hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User Selecting the Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Selecting the Toom Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Selecting No of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Selecting Checkin and Checkout Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Verifying Error Message \"Check-In Date shall be before than Check-Out Date\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Veeraragavmsd7",
      "offset": 28
    }
  ],
  "location": "Steps.user_Entering_the_Username(String)"
});
formatter.result({
  "duration": 388354000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "veera@123",
      "offset": 28
    }
  ],
  "location": "Steps.user_Entering_the_Password(String)"
});
formatter.result({
  "duration": 129764500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Clicking_the_Login_Button()"
});
formatter.result({
  "duration": 4797402600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Selecting_Location_of_the_Hotel()"
});
formatter.result({
  "duration": 982269800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Selecting_the_Hotel()"
});
formatter.result({
  "duration": 246821700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Selecting_the_Toom_Type()"
});
formatter.result({
  "duration": 234341200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Selecting_No_of_Rooms()"
});
formatter.result({
  "duration": 202898000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Selecting_Checkin_and_Checkout_Date()"
});
formatter.result({
  "duration": 489938400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check-In Date shall be before than Check-Out Date",
      "offset": 30
    }
  ],
  "location": "Steps.user_Verifying_Error_Message(String)"
});
formatter.result({
  "duration": 49117200,
  "status": "passed"
});
});