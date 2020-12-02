# Phone Catalog Project

This project consists of two main parts: the API server side, developed in Java with Spring Boot and the client side developed in JavaScript with React.
<br />First, we will see how to build both of these parts and the dependencies and packages that need to be installed for it to properly work on any machine. 

## Build and Run the server side. 

First, after cloning this repository in your local PC, enter the back project directory:
### `cd REACT-PhoneCatalog/back-phone-catalog/`

Now, having `gradle.build` available in this directory.
For this we first need to [install Gradle](https://gradle.org/install/)
<br />We can now run the application:
### `gradle bootRun`

## Build and Run the client side
We get into the client side directory:
### `cd REACT-PhoneCatalog/front-phone-catalog/`

In order to execute the proyect we need to have [yarn installed](https://classic.yarnpkg.com/en/docs/install/) 
### `yarn`

Before running the project, we need to install some dependencies:
### `yarn add 'react-router-dom`

Let's now run the app in the development mode.\
### `yarn start`
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.
The page will reload if you make edits.\

Things to have installed:
yarn add expo
expo install expo-constants
