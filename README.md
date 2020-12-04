# Phone Catalog Project

## Table of contents
* [General Info](#general-info)
* [How To Run](#Build-and-Run-the-server-side)
* [Front Details](#Information-about-the-frontend)
* [Back Details](#Information-about-the-backend)

## General Info
This project consists of two main parts: the API server side, developed in Java with Spring Boot and the client side developed in JavaScript with React.
<br />First, we will see how to build both of these parts and the dependencies and packages that need to be installed for it to properly work on any machine. 

## Build and Run the server side

First, after cloning this repository in your local PC, enter the back project directory:
### `cd REACT-PhoneCatalog/back-phone-catalog/`

Now, we have `build.gradle` available in this directory.
For this we first need to [install Gradle](https://gradle.org/install/)
<br />We can now run the application:
### `gradle bootRun`

## Build and Run the client side
We get into the client side directory:
### `cd REACT-PhoneCatalog/front-phone-catalog/`

In order to execute the proyect we need to have [yarn installed](https://classic.yarnpkg.com/en/docs/install/) 
### `yarn`

Before running the project, we need to install some dependencies:
### `yarn add 'react-router-dom'`

Let's now run the app in the development mode.
### `yarn start`
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.
The page will reload if you make edits.

Things to have installed:
yarn add expo
expo install expo-constants

## Information about the frontend
Let's now dive into the details of the visual part of the project (`front-phone-catalog`)

In here we can find several files:
* `App.js`: This is the starting point of the project. Here I make a GET call to the API in order to get the JSON from `/phones` and create the list calling our next class: `PhoneList.js`
* `PhoneList.js`: In this class we take the data we have gathered in the previous GET method and display it on screen using the component `Phone.js`
* `Phone.js`: This component is merely used to arrange all the phones we have received in the PhoneList and display them on screen with their respective CSS files.
* `Details.js`: When hitten, the "View More" button of the component `Phone.js` will store the ID (using Redux) of the seleced phone. Here, we will retrieve the stored ID and pass it on to the next function.
* `id.js`: This class is the one that manages the next API call, which is a POST where we pass the ID and we get in return the JSON details of that phone. 
* `DetailsList.js`: Here, finally, we print the results of the API call to the screen with their respective CSS files. 
* `action.js`, `reducer.js` and `index.js` are files that help me manage the Redux state to store and update variables

## Information about the backend

The project structure is divided into: `controller`, `model`, `service` and `utils`

* `controller`: In this package we, we have the file `PhoneInfoController.java` which is the one that created the two endpoints I have used: `/phones` and `/details`. Being the former the GET method and, the later, the POST method.
The first endpoint has very simple logic, since it always returns the same JSON. The `/details` controller calls a service which we will see now.

* `model`: This package contains `PhoneDTO.java` and `IdDTO.java`. The first one is used to define each of the phones with their attributes and the second one for storing the ID passed on the POST method.

* `service`: Here we have `PhoneDetailService.java` which handles the POST request that enters through `/details`. It returns the element number ID from the PhoneDTO list.

* `utils`: In the utils package I have put `PhoneListCreator.java` which the only thing it does is create a list full of PhonesDTO. 

There is, as well, a mirror project structure in which I have the tests for the `controller` and the `service` 
