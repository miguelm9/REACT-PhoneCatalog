# Phone Catalog Project

This project consists of two main parts: the API server side, developed in Java with Spring Boot and the client side develeped in JavaScript with React.
<br />First, we will see how to build both of these parts and the dependencies and packages that need to be installed for it to properly work on any machine. 

## Build and Run the server side. 

First, after cloning this repository in your local PC, enter the back project directory:
### `cd REACT-PhoneCatalog/back-phone-catalog/`

Now, having `gradle.build` available in this directory.
For this we first need to [install Gradle](https://gradle.org/install/)
<br />We can now run the application:
### `gradle bootRun`

Something like this should show, which would mean we are ready to go:
Task :bootRun

<br />  .   ____          _            __ _ _
<br /> /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
<br />( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
<br /> \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
<br />  '  |____| .__|_| |_|_| |_\__, | / / / /
<br /> =========|_|==============|___/=/_/_/_/
<br /> :: Spring Boot ::        (v1.5.9.RELEASE)
<br />
<br />2019-06-30 09:57:38.494  INFO 11636 --- [           main] c.j.SpringBootApplication                : Starting SpringBootApplication <br />on DESKTOP-6QDF17L with

## Build and Run the client side

Things to have installed:
yarn add expo
expo install expo-constants

yarn start


Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.\
You will also see any lint errors in the console.

### `yarn test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `yarn build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `yarn eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you aren’t satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you’re on your own.

You don’t have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn’t feel obligated to use this feature. However we understand that this tool wouldn’t be useful if you couldn’t customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `yarn build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)
