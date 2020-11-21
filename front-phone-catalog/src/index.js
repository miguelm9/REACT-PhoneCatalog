import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import Details from './Details'
import {BrowserRouter, Route} from "react-router-dom";


ReactDOM.render(
    <React.StrictMode>
        <BrowserRouter>
            <Route exact path="/" component={App}/>
            <Route exact path="/details" component={Details}/>
        </BrowserRouter>
    </React.StrictMode>,
    document.getElementById('root')
);

registerServiceWorker();
