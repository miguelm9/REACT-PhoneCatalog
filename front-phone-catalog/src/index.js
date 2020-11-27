import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import Details from './Details'
import {BrowserRouter, Route} from "react-router-dom";
import { Provider } from 'react-redux';
import store from './store';

ReactDOM.render(
    <React.StrictMode>
        <Provider store={store}>
        <BrowserRouter>
            <Route exact path="/" component={App}/>
            <Route exact path="/details" component={Details}/>
        </BrowserRouter>
        </Provider>
    </React.StrictMode>,
    document.getElementById('root')
);

registerServiceWorker();
